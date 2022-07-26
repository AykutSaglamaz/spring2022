package gun13_loops_forloops;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		// 1'den 10'a kadar olan sayilarin carpimini yaziniz
		
		int toplamCarpim =1;
		
		for(int i = 1; i<11; i++) {
			toplamCarpim = toplamCarpim * i;
			
		}
		System.out.println(toplamCarpim);
		
		/*
		 * Kullanicidan bir sayi girmesini isteyin ve bu sayinin faktorel degerini yaziniz
		 * 5! =5*4*3*2*1 ==120
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Faktoriyel degirini hesaplamak icin bir sayi giriniz");
		int sayi =scan.nextInt();
		
		int toplamFaktoriyel =1; 
		
		if(sayi<=0) {
			System.out.println("lutfen pozitif bir sayi giriniz");
		}else {
		
			for(int i = sayi;  i>0; i--) {
				toplamFaktoriyel = toplamFaktoriyel*i;//5 =>20=>60=>120=>120
			
		}
		System.out.println(toplamFaktoriyel);
		
		}
		
		
		
	}

}
