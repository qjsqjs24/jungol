package lotto;

public class SwichExample {
	public static void main(String[] args) {
		
		while(true) {
		int num1 = (int)(Math.random()*45)+1;
		int num2 = (int)(Math.random()*45)+1;
		int num3 = (int)(Math.random()*45)+1;
		int num4 = (int)(Math.random()*45)+1;
		int num5 = (int)(Math.random()*45)+1;
		int num6 = (int)(Math.random()*45)+1;
		System.out.print(num1 + " " + num2 + " " + num3 + " "
				+ num4 + " " + num5 + " "+ num6 + " ");
		
		boolean b = false;
		if(num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5 || num1 == num6) {
			b = true;
		}
		if(num2 == num3 || num2 == num4 || num2 == num5 || num2 == num6) {
			b = true;
		}
		if(num3 == num4 || num3 == num5 || num3 == num6) {
			b = true;
		}
		if(num4 == num5 || num4 == num6) {
			b = true;
		}
		if(num5 == num6) {
			b = true;
		}
		System.out.println(b);
		
		if(b == false) {
			break;
		}
	}


	}

}
