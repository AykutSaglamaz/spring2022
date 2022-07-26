package gun14_loop_whileloop;

import java.util.Scanner;

public class WhileLoop05 {

	public static void main(String[] args) {
		/* Kullanicidan bir satir (rows) sayi alalim ve su sekli yazdiralim
		 orn,    kullanici 5 girdi satir sayisi olarak 
		 
		  									*1
					 						**2
					 						***3
					 						****4
					 						*****5
		*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi girin");
		int sayi = Math.abs(scan.nextInt());
		
		
		int i =1;
		while(i<=sayi) {
			for(int j =1; j<=i; j++) {

				System.out.print("*");

			}
			System.out.println(i);
			i++;
		}
		
		
		
		
		
		
	}

}
