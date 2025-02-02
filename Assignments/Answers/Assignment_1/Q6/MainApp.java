package Assignments.Answers.Assignment_1.Q6;

class College {
    private String collegeName;
    private String collegeLoc;

    public College(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeLoc() {
        return collegeLoc;
    }

    public void setCollegeLoc(String collegeLoc) {
        this.collegeLoc = collegeLoc;
    }
}

class Student {
    private String studentId;
    private String studentName;
    private College college;

    public Student(String studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("College Name: " + college.getCollegeName());
        System.out.println("College Location: " + college.getCollegeLoc());
    }
}

public class MainApp {
    public static void main(String[] args) {
        College college1 = new College("ITER", "Bhubaneswar");
        College college2 = new College("SUM", "Bhubaneswar");
        Student student1 = new Student("2341016247", "Hemanth", college1);
        Student student2 = new Student("2341016246", "Ansh", college2);
        student1.displayStudentInfo();
        System.out.println();
        student2.displayStudentInfo();

    }
}
