package gun13_loops_forloops;

import java.util.Scanner;

public class ForLoop05 {

	public static void main(String[] args) {
		/* Kullanicidan degeri alarak asagidaki sekli olusturunuz
		 orn
		 			* * * *
		             * * *
		              * *
		               *
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir ucgenin taban degerini giriniz");
		int kenar = scan.nextInt();
		
		for(int i = kenar; i>0; i--) {
			
			for(int j = 0; j<kenar-i; j++) {
	
				System.out.print(" ");	
			}
			for(int k = kenar; k>kenar-i; k--) {
	
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
