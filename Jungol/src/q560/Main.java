package q560;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for(int i = 0; i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		for(int i = 0 ; i<a.length; i++) {
			//System.out.print(a[i] + " ");
		}
		
		int min = 1000;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);
		
		
	}

}
