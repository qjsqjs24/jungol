package q528;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      String strX = scanner.nextLine();
      
      scanner.close();
      int x = Integer.parseInt(strX);
      
      if(x>0) {
         System.out.println(x);
      }else {
         System.out.println(x);
         System.out.println("minus");
      }

   
   }

}