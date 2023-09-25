package q508;

public class Main {

	public static void main(String[] args) {	
		String[] ar = {"item","count","price",
				"pen","20","100",
				"note","5","95",
				"eraser","110","97"};
		
		for(int i=0; i<ar.length; i++) {
			if( i % 3 == 0 && i !=0) {
				System.out.println();
			}
			System.out.printf("%10s", ar[i]);
		}
		// String a = "item";
		// String b = "count";
		// String c = "count";
		// System.out.printf("%10s%10s%10s\n", a, b, c);	
		
		// String d = "pen";
		// int e = 20;
		// int f = 100;
		// System.out.printf("%10s%10d%10d\n", d, e, f);
		
		// String g = "note";
		// int h = 5;
		// int i = 95;
		// System.out.printf("%10s%10d%10d\n", g, h, i);
		
		// String j = "eraser";
		// int k = 110;
		// int l = 97;
		// System.out.printf("%10s%10d%10d\n", j, k, l);
		
	//	System.out.println("      item     count     price");
	//	System.out.println("       pen        20       100");
	//	System.out.println("      note         5        95");
	//	System.out.println("    eraser       110        97");
		

		
	}

}
