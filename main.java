import java.util.Scanner;

public class main {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		tuna obj= new tuna();
		System.out.println("Enter the name here: ");
		String temp = input.nextLine();
		obj.setName(temp);
		obj.saying();
		
		
	}

}
