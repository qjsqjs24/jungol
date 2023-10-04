package q9018;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int sum1 = a + b;
		System.out.println("두 개의 수를 입력하시오. " + "7 + 5 = " + sum1);
		int sum2 = a - b;
		System.out.println("7 - 5 = " + sum2);
		int sum3 = a * b;
		System.out.println("7 * 5 = " + sum3);
		int sum4 = a / b;
		System.out.println("7 / 5 = " + sum4);
		int sum5 = a % b;
		System.out.println("7 % 5 = " + sum5);
		

	}

}
