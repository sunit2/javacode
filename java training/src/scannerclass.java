import java.util.Scanner;
public class scannerclass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the string");
		String mystring = input.nextLine();
		System.out.println("you entered string is " + mystring);
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("enter the number");
		int myint = input.nextInt();
		System.out.println("you entered number is " + myint);	

		Scanner input2 = new Scanner(System.in);
		System.out.println("enter the float number");
		double mydouble = input.nextDouble();
		System.out.println("you entered float number is " + mydouble);
	}

}
