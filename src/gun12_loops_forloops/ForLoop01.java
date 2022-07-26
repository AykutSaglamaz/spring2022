package gun12_loops_forloops;

import java.util.Scanner;

public class ForLoop01 {

	public static void main(String[] args) {
		// Kullanicidan bir String alalim
		// cift indexlerde bulunan karakterleri arada bosluk olacak yazdiralim
		// kelebek ==> k l b k
		
		
 
//		Scanner scan  = new Scanner(System.in);
//		System.out.println("Bir String giriniz...");
//		String str = scan.nextLine().toLowerCase();
//		
//		//1. yol
//		
//		for(int i =0; i<str.length(); i++ ) {
//			
//			if(i%2==0) {
//				System.out.print(str.charAt(i)+ " ");
//			}
//			
//		}
//		System.out.println("=======");
//		//2.yol
//		
//		for(int i =0; i<str.length(); i+=2) {
//			System.out.print(str.charAt(i)+ " ");
//		}
//		
//		Ebay Interview Question:
		//  Type code to print non-repeated characters of any given String
        //	Verilen bir String de tekrar edilmeyen (bir kez) karakterleri yazdiran bir program yaziniz
		
//		Scanner scan  = new Scanner(System.in);
//		System.out.println("Bir String giriniz...");
//		String str = scan.nextLine().toLowerCase();
//		
//		
//		for(int i = 0 ; i<str.length(); i++) {
//
//			if(str.indexOf(str.charAt(i))  == str.lastIndexOf(str.charAt(i))) {
//				
//				System.out.print(str.charAt(i)+ " ");
//				
//			}
//			
//		}
		// ***** cok siklikla mulakatlarda sorulan soru
		// Kullanicidan bir String girmesi isteyin ve bu String i tersten yazdirin
		
		
		Scanner scan  = new Scanner(System.in);
		System.out.println("Bir String giriniz...");
		String str = scan.nextLine();	
		
		for (int j = str.length()-1; j>=0;  j--) {
			System.out.print(str.charAt(j));
			
		}
		
		
		
		
		
	}

}
