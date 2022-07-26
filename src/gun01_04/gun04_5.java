package gun01_04;

import java.util.Scanner;

public class gun04_5 {

	public static void main(String[] args) {
		// kullanicidan bir dikdortgen seklinde bir bahcenin en ve boyu isteyelim
		//  bahcenin cevresini hesap en=a, boy =b, ==>2*(a+b)
		//bahcenin alani en=a, boy =b,=> a*b
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dikdortgenin en'ini giriniz");
		System.out.println("Dikdortgenin boy'unu giriniz");
		
		float en = scan.nextFloat();
		
		float boy = scan.nextFloat();
		
		System.out.println("Bahcenin cevresi: "+2*(en+boy));
		
		System.out.println("Bahcenin Alani: "+en*boy);
		

	}

}
