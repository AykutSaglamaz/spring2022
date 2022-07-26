package gun15_loops_DoWhile;

public class DoWhile05 {

	public static void main(String[] args) {
//		
//		
//		for(int i=10; i>5; i--) {
//			System.out.println(i);
//		}
//		
//		
//		
//		int i =1; 
//		
//		while(i>1) {
//			System.out.println("while loop....");
//			i++;
//		}
//		
//		
//		
//	int j =1;	
//
//	do {
//		System.out.println("do-while loop");
//		j--;
//		
//	}while(j>1);
//	
//		
//		String = "1234_?!abcdef" icin, harf, sayi ve diger karakter sayilarini veren do-while loop'u kullanarak bir kode yaziniz
		
		
		String str = "1234_?!abcdef";
		
		int rakamSayisi =0;// counter
		int harfSayisi =0;
		
		int noktalamaIsaretSayisi  =0; 
		
	
		int i =0;
		
		do {
			if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				
				rakamSayisi++;
				
			}else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				
				harfSayisi++;
				
			} else {
				
				noktalamaIsaretSayisi++;
			}
			i++;
			
		}while(i<str.length());
		
		
		System.out.println("rakam sayisi "+ rakamSayisi);
		System.out.println("harf sayisi "+ harfSayisi);
		System.out.println("noktalama isaret sayisi "+ noktalamaIsaretSayisi);
		

		
	}

}
