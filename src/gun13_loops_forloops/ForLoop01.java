package gun13_loops_forloops;

public class ForLoop01 {

	public static void main(String[] args) {
		// 1'den 100'e kadar olan sayilarin toplamini yaziniz
		
		int toplam = 0;
		
		for (int i = 1; i<101; i++) {
		
			toplam = toplam + i;//= toplam+=i
		
//			System.out.println(toplam);
		
		}
		System.out.println(toplam);
		
		// // 1'den 100'e kadar olan sayilarin tek ve cif olanlarin toplamlarini ayri ayri yaziniz
		int toplamCift=0;
		int toplamTek=0;
		
		for(int i=1;i<=100;i++) {
			
			if(i%2==0){
				
				toplamCift+=i;

			}else {
				
				toplamTek+=i;
			}
		}
		
		System.out.println(toplamCift);
		System.out.println(toplamTek);
		
		
		
		
		
		
		
		
		
		

	}

}
