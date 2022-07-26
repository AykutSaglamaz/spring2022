package gun13_loops_forloops;

import java.util.Scanner;

public class ForLoop03 {

	public static void main(String[] args) {
		//nested loops ==> dongu icinde dongu
		
//		for (int i = 1; i<4; i++) {
//
//			for(int j =5; j<7; j++) {
//				System.out.println(i + "-" + j);
//			}
//		}

		
		/* bir kanari 3 diger kanari 4 olan bir dikdortgeni  "*" kullanarak yazdiralim 
				orn;
				
				* * * *
				* * * * 
				* * * * 
		*/
		
		for(int i =1; i<4; i++) {

			for(int j =1; j<5; j++) {

				System.out.print("* ");

			}
			System.out.println();
			
		}
		
		
		
	// kullanicidan satir ve colon  degeri alarak "*" bir dikdortgen olusturunuz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir satir degeri giriniz");
		int satir = scan.nextInt();
		System.out.println("lutfen bir colon degeri giriniz");
		int colon = scan.nextInt();
		
		for(int i = 1; i<satir+1; i++) {
			for(int j = 1; j<colon+1; j++) {
				System.out.print("* ");	
			}
			System.out.println();
		}
		
		
		
		
	}

}
