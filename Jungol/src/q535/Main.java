package q535;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double inp = sc.nextDouble();
		sc.close();
		
		switch((int)inp) {
		case 4:
			System.out.println("scholarship");
			break;
		case 3:
			System.out.println("next semester");
			break;
		case 2:
			System.out.println("seasonal semester");
			break;
		case 1:
		case 0:
			System.out.println("retake");
			break;
			
			
		}
		
		//if(inp>=4.0) {
			//System.out.println("scholarship");
		//}else if(inp>=3.0) {
			//System.out.println("next semester");
		//}else if (inp>=2.0) {
			//System.out.println("seasenal semester");
		//}else {
			//System.out.println("retake3.5");
		//}
	}

}
