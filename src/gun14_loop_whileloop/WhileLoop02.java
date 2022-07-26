package gun14_loop_whileloop;

import java.util.Scanner;

public class WhileLoop02 {

	public static void main(String[] args) {
		/*
		 * While-loop kulllanarak, kullanicidan bir integer alarak bir carpim tablosu olusturun
		 
		 * 3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi girin");
		int sayi = scan.nextInt();
		
		
		int i =1;
		 while(i<11) {

			 System.out.println(sayi + "X" + i + "=" + sayi*i + "  ");

			 i++;
			 
		 }
		
	}

}
