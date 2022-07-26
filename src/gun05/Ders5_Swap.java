package gun05;

public class Ders5_Swap {

	public static void main(String[] args) {
		// iki integer in degerin yerlerini degistirin 
		// a = 12, b=5;=>. a = 5, b=12
		
		//1. yol => yeni degisken/konteynir olusturma
		
		 int a =12;
		 int b =5;
		 int g =0;
		 
		 System.out.println("degisimden once a:"+a);
		 System.out.println("degisimden once b:"+b);
		 
		 g = b;//5
		 b = a;//12
		 a = g;//5
		 
		 System.out.println("degisimden sonra a:"+a);
		 System.out.println("degisimden sonra b:"+b);
		
		
		 //2 yol
		 
		 int c =20;
		 int d= 15;
		 
		 c= c+d;//c=35
		 d= c-d;// d=20
		 c=c-d; //c=15
		 

	}

}
