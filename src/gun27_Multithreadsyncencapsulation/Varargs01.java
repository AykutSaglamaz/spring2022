package gun27_Multithreadsyncencapsulation;

public class Varargs01 {
	/*
	 1) Varargs larin arka planinda , java Array'leri kullanir. Bu nedenle varargs'lar bazi farkliliklara ragmen Arrays gibi calisir
	 2) Method parantezinin icinde en fazla bir varargs kullanilabilir
	 3) Varargs her zaman en son parametre OLMALIDIR
	 4) "..." data type ten sonra ( int... x) veya varargs isminden once de kullanilabilir (int ...x). diger durumlar calismaz
	 
	 Note: Eger parametre sayilari farkli olan ayni isimli methodlar olusturmak istiyorsaniz, bu durumda en secenek varargs olusturmaktir.
	 */

	public static void main(String[] args) {
		
		System.out.println(toplam());//0
		System.out.println(toplam(5, 15));//20
		System.out.println(toplam(5, 15, 20));//40
		
	}
//	
//	public static int toplam() {
//		return 3+5;
//		
//	}
//	
//	public static double toplam(int a, double b) {
//		return 3+9;
//	}
//	
//	public static int toplam(int 5, int 15, int 20) {
//	return 3+9;
//
//}
	
	public static int toplam(int... x) {
		
		int toplam = 0; 
		
		for(int w:x) {
			
			toplam = toplam + w;
		}
		return toplam;
		
		// arr[] = {1, 2, 4, 6, 10};
		
	}
	

}
