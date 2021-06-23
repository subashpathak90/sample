import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {

		Scanner f = new Scanner(System.in);
		int a, b, c;

		System.out.println("Enter the first number: ");
		a = f.nextInt();
		System.out.println("Enter the second number: ");
		b = f.nextInt();
		c = a + b;
		System.out.println("The result is: ");
		System.out.println(c);

	}

}
