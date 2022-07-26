package gun16_MethodOverloadingConstructor;

public class MethodOverloading {
	// Java icin tamsayilar default (varsayilan) olarak integer
	// Java icin virgullu sayilar default (varsayilan) olarak double olarak kabul edilir
	
	public static void main(String[] args) {
		System.out.println(toplam(2, 9));
		System.out.println(toplam(2.5, 9));
		System.out.println(toplam(8, 9.9));
		
		System.out.println(toplam(8.5, 9.9));
		
		
		System.out.println(toplam(2, 8, 9.9));
		
		System.out.println(toplam(2, 15));
		
		toplam(2, 15, 5, 8);
	
		toplam(2);
		
		
	}
	
	public static double toplam (double... a) {
		System.out.println("varargs kullandim");
		return 4;
	}
	
	
//	public static double toplam(int a, int b) {
//		System.out.println("int + int");
//		
//		return a+b;
//	}
//	
//	public static double toplam(double a, int  b) {
//		System.out.println("double + int");
//		return a+b;
//	}
//
//	
//	public static double toplam(int a, double b) {
//		System.out.println("int + double");
//		return a+b;
//	}
//	
//	public static double toplam(double a, double b) {
//		System.out.println("double + double");
//		return a+b;
//	}
//	
//	public static double toplam(int a, int b, double c) {
//		System.out.println("int + int + double");
//		return a+b;
//	}
	
	
	
	
	
	

}
