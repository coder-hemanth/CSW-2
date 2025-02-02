package Assignments.Answers.Assignment_1.Q10;

class Student {
    private String studentId;
    private String name;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Course {
    private String courseId;
    private String courseName;
    private Student[] enrolledStudents;
    private int studentCount;

    public Course(int maxStudents) {
        this.enrolledStudents = new Student[maxStudents];
        this.studentCount = 0;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Student[] getEnrolledStudents() {
        return enrolledStudents;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public boolean addStudent(Student student) {
        if (studentCount < enrolledStudents.length) {

            enrolledStudents[studentCount++] = student;
            return true;
        }
        return false;
    }

    public boolean removeStudent(Student student) {
        for (int i = 0; i < studentCount; i++) {
            if (enrolledStudents[i].equals(student)) {
                enrolledStudents[i] = enrolledStudents[studentCount - 1];
                enrolledStudents[--studentCount] = null;
                return true;
            }
        }
        return false;
    }
}

interface EnrollmentSystem {

    void enrollStudent(Student student, Course course);

    void dropStudent(Student student, Course course);

    void displayEnrollmentDetails(Course course);

}

class Enrollment implements EnrollmentSystem {
    public void enrollStudent(Student student, Course course) {
        if (course.addStudent(student)) {
            System.out.println(student.getName() + " has been enrolled in " +
                    course.getCourseName());
        } else {
            System.out.println("Enrollment failed: " + course.getCourseName() + " is full.");
        }
    }

    public void dropStudent(Student student, Course course) {
        if (course.removeStudent(student)) {
            System.out.println(student.getName() + " has been dropped from " + course.getCourseName());
        } else {
            System.out.println("Drop failed: " + student.getName() + " is not enrolled in " + course.getCourseName());
        }
    }

    public void displayEnrollmentDetails(Course course) {
        System.out.println("Enrollment details for " + course.getCourseName() + ":");
        for (int i = 0; i < course.getStudentCount(); i++) {
            Student student = course.getEnrolledStudents()[i];
            if (student != null) {
                System.out.println("- " + student.getName() + " (ID: " + student.getStudentId() + ")");
            }
        }
    }
}

public class MainEnrollApp {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentId("S001");
        student1.setName("ABC");
        Student student2 = new Student();
        student2.setStudentId("S002");
        student2.setName("DEF");
        Student student3 = new Student();
        student3.setStudentId("S003");
        student3.setName("PQR");
        Course course1 = new Course(2);
        course1.setCourseId("C001");
        course1.setCourseName("Mathematics");
        Course course2 = new Course(2);
        course2.setCourseId("C002");
        course2.setCourseName("Physics");
        Enrollment enrollmentSystem = new Enrollment();
        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.enrollStudent(student2, course1);
        enrollmentSystem.enrollStudent(student3, course1);
        enrollmentSystem.enrollStudent(student1, course2);
        enrollmentSystem.displayEnrollmentDetails(course1);
        enrollmentSystem.displayEnrollmentDetails(course2);
        enrollmentSystem.dropStudent(student1, course1);
        enrollmentSystem.displayEnrollmentDetails(course1);
    }
}
