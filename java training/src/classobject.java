class person {
	int age;
	String name;
	void detail() {
		System.out.println("My name is " + name + "and i am " + age + " old");
	}
	int retireage () {
		int age = 65 - this.age;
		return age;
	}
	void person2(int age) {
		System.out.println("My age is " + age);
	}
	
}
public class classobject {

	public static void main(String[] args) {
		person person1 = new person ();
		person1.age = 27;
		person1.name = "sunit"; 
		person1.detail();
		int age = person1.retireage();
		System.out.println("retire age is "+ age);
		int age1 = 56;
		person1.person2(age1);
	}

}
