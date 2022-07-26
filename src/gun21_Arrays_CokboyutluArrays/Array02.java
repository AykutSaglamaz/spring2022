package gun21_Arrays_CokboyutluArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		/*
		 Kullaniciyla beraber bir String Array olusturun
		 Array in uzunluklarinin carpimini bulunuz.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("String Array olusturmak icin lutfen Arrayin boyutu giriniz");
		 
		int uzunluk = scan.nextInt();
		
		String ar[]= new String [uzunluk];
		
		int elementSayisi = 1;
		
		do {
			System.out.println(elementSayisi+ ". elementi giriniz");
			ar[elementSayisi-1] = scan.next();
			elementSayisi++;
			
		}while(elementSayisi<=uzunluk);
		
		System.out.println(Arrays.toString(ar));
		
		
		int carpim = 1; 
		
		 for(int i = 0; i<uzunluk; i++) {
			 
			 
			carpim = carpim * ar[i].length();
			 
		 }
		
		
		 System.out.println(carpim);
	}

}
