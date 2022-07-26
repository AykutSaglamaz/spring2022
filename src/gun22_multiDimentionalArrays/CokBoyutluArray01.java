package gun22_multiDimentionalArrays;

import java.util.Arrays;

public class CokBoyutluArray01 {

	public static void main(String[] args) {
		// 1. yol tek boyutlu Array
		int a1 []= new int[2];// [0, 0]
		a1[0]= 12;
		a1[1]= 15;
		System.out.println(Arrays.toString(a1));//[12, 15]
		
		// 2. yol tek boyutlu Array
		int a2[]= {45, 25, 3, -25};
		System.out.println(Arrays.toString(a2)); //[45, 25, 3, -25]
		
		
		
		// 1. yol cok boyutlu Array yazdirmak icin Arrays.deepToString() kullanilir
		
		int a3 [][] = new int [2][3];
		System.out.println(Arrays.deepToString(a3));//[[0, 0, 0], [0, 0, 0]]
		
		a3[0][0] = 3;
		a3[0][1] = 4;
		a3[0][2] = 6;
		
		a3[1][0] = 7;
		a3[1][1] = -12;
		a3[1][2] = -1;
		
		System.out.println(Arrays.deepToString(a3));
		
		//2. yol cok boyutlu array olusturmak icin
		int a4[][] = {{2,3},    {12, 13},    {7} };
		
		System.out.println(Arrays.deepToString(a4));//[[2, 3], [12, 13, 14, 15, 16], [7], [-2, -3, -4]]
		
		
		// cok boyutlu arrayin elementlerin toplamini bulan bir kod yazin //[  [2, 3],     [12, 13],      [7]]
		
		int toplam =0;

		for(int i =0; i<a4.length; i++) {
			
			for(int k =0; k<a4[i].length; k++ ) {
				toplam = toplam + a4[i][k];		
			}
		}
		System.out.println(toplam);
		
		
		
		
		
		
		

	}

}
