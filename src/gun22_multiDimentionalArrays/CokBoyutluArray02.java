package gun22_multiDimentionalArrays;

public class CokBoyutluArray02 {

	public static void main(String[] args) {
		/*
		 	arr[][] = { {1, 2},   {3, 4, 5}, {6} }  ve 
		 	
		 	brr[][] = { {7, 8, 9}, {10, 11} }
		 	
		 	arr ile brr Arraylarin indexleriayni olan elementlerin  toplamini bulunuz
		 	
		 	 (1+7) + (2+8) + (3+10) + (4+11)=46
		 */

		int a1[][] = { {1, 2},  {3, 4, 5}, {6} };
		
		int b1[][] = { {7, 8, 9}, {10, 11} };
		
		
		int disArrayBoyutu= a1.length < b1.length ? a1.length : b1.length;
		int toplam =0;
		
		
		for(int i =0; i<disArrayBoyutu; i++) {
			
			
			int icArrayBoyutu = a1[i].length < b1[i].length ? a1[i].length : b1[i].length;
			
			for(int k =0; k<icArrayBoyutu; k++) {
				
				
			toplam = toplam +	a1[i][k] + b1[i][k];
				
			}
			
		}
		System.out.println(toplam);
		
	}

}
