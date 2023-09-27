package q633;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1. Korea\r\n" + "2. USA\r\n" + "3. Japan\r\n" + "4. China\r\n" + "number? ");
			int a = sc.nextInt();
			System.out.println();
			if (a == 1) {

				System.out.println("Seoul");

			} else if (a == 2) {

				System.out.println("Washington");

			} else if (a == 3) {

				System.out.println("Tokyo");

			} else if (a == 4) {

				System.out.println("Beijing");

			} else {

				System.out.println("none");

				sc.close();
				break;
			}
			System.out.println();
		}

	}

}
