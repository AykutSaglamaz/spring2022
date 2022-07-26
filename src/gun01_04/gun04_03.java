package gun01_04;

import java.util.Scanner;

public class gun04_03 {

	public static void main(String[] args) {
		// kullanicidan bir sayi al ve onu kupunu hesapla
		// a => a*a*a
			
		//1. object olustur
		
		Scanner scan = new Scanner(System.in);
		//2. Kullaniciya mesaj gonder
		
		System.out.println("Hey kullanici, bize bir sayi soyle");
		
		//3. kullanicidan aldigimiz veriyi konteynirda depolamamiz lazim
		
		short sayi = scan.nextShort();
		
		System.out.println(sayi*sayi*sayi);
		

	}

}
