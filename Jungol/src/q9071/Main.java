package q9071;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		sc.close();
		
		int sum1 = a + 3;
		int sum2 = b - 3;
		int sum3 = c * 3;
		int sum4 = d / 3;
		int sum5 = e % 3;
		
		System.out.print("5개의 수를 입력하시오. " + sum1 + " ");
		System.out.print(sum2 + " ");
		System.out.print(sum3 + " ");
		System.out.print(sum4 + " ");
		System.out.print(sum5);

	}

}
