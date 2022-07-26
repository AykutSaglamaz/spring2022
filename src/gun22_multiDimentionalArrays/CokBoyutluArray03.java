package gun22_multiDimentionalArrays;

import java.util.Arrays;

public class CokBoyutluArray03 {

	public static void main(String[] args) {
		// 2 boyutlu Array'i tek boyutlu arra'e nasil ceviririz
		
		
		int ar [][] = { {1, 4},     {7, 4, 5},     {11, 18, 25, 3} };
		
//		System.out.println(ar.length);
		
		int toplam = 0;
		
		 for (int i = 0; i<ar.length; i++) {
			 
			 
			 toplam = toplam + ar[i].length; 
			
		 }
		 int br[]= new int[toplam];
		 
		 int idx = 0;
		 
		 for(int i =0; i<ar.length; i++ ) {

			 for(int k =0; k< ar[i].length; k++) {
				 
				br[idx] = ar[i][k];
				
				idx++;
				
			 }
		 }
		 System.out.println(Arrays.deepToString(ar));
		 
		System.out.println(Arrays.toString(br));
		

	}

}
