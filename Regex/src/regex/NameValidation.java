package regex;

import java.util.Scanner;

public class NameValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String flag = "y";

		do {
			System.out.println("enter name: ");
			String name = scanner.nextLine();

			String regex = "[a-z]";			

			if (name.matches(regex)) {
				System.out.println(name.matches(regex));

			} else {
				System.out.println(name.matches(regex));

			}
			System.out.println("enter flag");
			flag = scanner.nextLine();
		} while (flag.equalsIgnoreCase("y"));

	}

}
