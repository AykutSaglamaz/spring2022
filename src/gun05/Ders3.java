package gun05;

import java.util.Scanner;

public class Ders3 {

	public static void main(String[] args) {
		// kullanicidan Alinin maasi al ve bunu 2 ye bol sonra 3 kat artir
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen maasini giriniz");
		
		int maas = scan.nextInt();
		
		System.out.println(maas);
		
		int sonMaas =(maas /2)*3;
		
		System.out.println(1-(maas /2)*3);
		
		System.out.println(sonMaas);
		
		
		//=> 38 / 2 - ( 4 + 3) * 2 = ?
		
		System.out.println(38 / 2 - ( 4 + 3) * 2);
		
		//=> 8+2*(14-6/2)-12 = ?
		
		int sayi = 8+2*(14-6/2)-12;
		
		System.out.println(8+2*(14-6/2)-12);
		
		System.out.println(sayi);
	}

}
