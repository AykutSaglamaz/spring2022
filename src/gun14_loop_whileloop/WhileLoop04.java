package gun14_loop_whileloop;

import java.util.Scanner;

public class WhileLoop04 {

	public static void main(String[] args) {
		// while-look kullarak bir sayinin faktorlerinin sayisini yaziniz
		// 8'in faktorleri => 1, 2, 4, 8    =====> 12'in faktorleri = 1, 2, 3, 4, 6, 12
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi girin");
		int sayi = Math.abs(scan.nextInt());
		
		int i = 1;
		int counter = 0; //flag
		
		while(i<=sayi) {
			
			
			
			if(sayi%i==0) {
				
				
				
				
				counter++;
				
				System.out.print(i + " ");	
			}
			
			i++;
		}
		
		System.out.println();
		System.out.println(counter);
		
		
		
		
		
		
		
	}

}
