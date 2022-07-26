package gun06_if_ifelse_ifelseif;

import java.util.Scanner;

public class IfStatement_Sart_cumleleri_02 {

	public static void main(String[] args) {
		// kullanicidan bir dikdortgenin yukseklik ve tabanlarini alalim
		// bu yukseklik ve taban birbirine esitse, konsole kare, esit degilse 
		//dikdortgen yazdiralim
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen dikdortgen icin yukseklik ve taban giriniz");
		
		double y = scan.nextDouble();
		double t = scan.nextDouble();
		
		if(y==t) {
			System.out.println("bu bir karedir");	
		}else {
			System.out.println("bu bir dikdortgendir");
		}
		

	}

}
