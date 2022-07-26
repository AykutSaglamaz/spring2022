package gun01_04;

import java.util.Scanner;

public class gun04_1 {
	/*
	 *  kullanicidan bir deger almak icin "Scanner Class"
	 *  1) Scanner Class obje olusturulur 
	 *  ClassAdi ObjeAdi "=" new ClassAdi 
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("hey kullanici, Yasiniz kactir");
		
		System.out.println("hey kullanici, boyunuz kactir");

		int yas = scan.nextInt();
		float boy = scan.nextFloat();
		
//		 System.out.println("Benim yasim: "+yas+" ");
//		 System.out.println("Benim Boyum: "+boy);
		 
		 System.out.println("Benim yasim: "+yas+" "+ "Benim Boyum: "+boy);
		
		

	}

}
