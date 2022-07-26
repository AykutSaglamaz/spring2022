package gun14_loop_whileloop;

import java.util.Scanner;

public class WhileLoop03 {

	public static void main(String[] args) {
		//while-loop kulllanarak, kullanicidan bir integer alin ve bunun rakamlarini toplayin 
		//123 => 1+2+3 =6
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi girin");
		int sayi = Math.abs(scan.nextInt());
		
		int toplam =0;
		
		 while(sayi!=0) {

			toplam = toplam + sayi%10;

			sayi = sayi/10;
		 }
		System.out.println(toplam);
		
		
		
		
	}

}
