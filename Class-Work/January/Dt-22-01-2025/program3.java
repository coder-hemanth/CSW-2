class Student5 {
	int id;
	String name;
	int age;

	Student5() {
		System.out.println("hello");
	}

	// constructor overloading
	Student5(int id, String name) {
		this.id = id;
		this.name = name;

	}

	Student5(int i, String n, int a) {
		this();
		id = i;
		name = n;
		age = a;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}
}

public class program3 {

	public static void main(String[] args) {

		Student5 n1 = new Student5(2, "numace");
		n1.display();
		Student5 n2 = new Student5(2, "numace", 87);
		n2.display();

	}

}
