package gun01_04;

import java.util.Scanner;

public class gun04_7 {

	public static void main(String[] args) {
		// Kullanicindan bir sayi mil olarak alalim km cevirelim
		// 1 km = mil*1.6
		
		Scanner km1 = new Scanner(System.in);
		System.out.println("Km cevirmek icin bir mil degeri giriniz");
		
		double milDegeri =km1.nextDouble();
		
		System.out.println(milDegeri*1.6+ " km");
		
		
		

	}

}
