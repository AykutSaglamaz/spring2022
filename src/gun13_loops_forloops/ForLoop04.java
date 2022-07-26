package gun13_loops_forloops;

import java.util.Scanner;

public class ForLoop04 {

	public static void main(String[] args) {
		/* Kullanicidan bir eskenar ucgenin bir kenari isteyelim ve ikizkenar bir ucgen yazdiralim
		 orn :3
		 		*
		 		* *
		 		* * *
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen eskenar ucgenin bir kenarinin degeri giriniz");
		int kenar = scan.nextInt();
		
		for (int i =1; i<kenar+1; i++) {
			
			for(int j =1; j<=i; j++) {
				System.out.print("* ");
				
			}System.out.println();
		}
		
		
		
		
		
		
		

	}

}
