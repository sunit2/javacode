import java.util.Scanner;

public class switchclass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String text = scan.nextLine();
		switch (text){
		case "start":
			System.out.println("Machine started");
			break;
		case "pause":
			System.out.println("Machine pauused");
			break;
		default:
			System.out.println("ünassinged");
			
		
		}

	}

}
