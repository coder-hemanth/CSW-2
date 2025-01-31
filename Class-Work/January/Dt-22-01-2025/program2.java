class Student1 {
	int rno;
	String name;
	float marks = 90;

	void greeting() {
		System.out.println("Hello ! my name is " + this.name);
	}

	Student1(Student1 other) {
		this.rno = other.rno;
		this.name = other.name;
		this.marks = other.marks;
	}

	Student1() {
		this(13, "default person", 100.0f);
	}

	Student1(int rno, String name, float marks) {
		this.rno = rno;
		this.name = name;
		this.marks = marks;
	}

}

public class program2 {

	public static void main(String[] args) {

		Student1 kunal = new Student1(15, "Kunal Kushwaha", 85.4f);
		System.out.println(kunal.rno);
		System.out.println(kunal.name);
		System.out.println(kunal.marks);
		Student1 random = new Student1(kunal);
		System.out.println(random.name);
		Student1 random2 = new Student1();
		System.out.println(random2.name);
		Student1 one = new Student1();
		Student1 two = one;
		one.name = "Something Something";
		System.out.println(two.name);

	}

}
