package gun12_loops_forloops;

import java.util.Scanner;

public class ForLoop03 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir String girmesini isteyelim  ve bunun Palindrome olup olmadigini kontrol edelim
		 * anna <==> anna ===> Palindrome
		 * 1223221 <==> 1223221  ===> Palindrome
		 * racecar ===> Palindrome
		 * 
		 * kelime < == > emilek ===> Palindrome degil
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir String giriniz... ");
		String kelime = scan.nextLine();
		
		String terstenKelime = "";
		
		for (int i = kelime.length()-1; i >=0;  i-- ){
			
			terstenKelime = terstenKelime + kelime.charAt(i);
			
		}
		
		if(kelime.equalsIgnoreCase(terstenKelime)) {
			System.out.println(kelime + " palindromdur");
		}else {
			System.out.println(kelime + " palindrom degildir");
		}
		
		
		
		
		

	}

}
