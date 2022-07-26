package gun19_staticAnahtarKavrami;


		/*
 		static block: 1) class(static) degiskenlere deger atamak icin kullanabiliriz
 					  2) static block sinif icindeki butun kodlardan (constructor, methodlar, main method) once calisir
 					  3) Eger birden fazla stati block kullanmissaniz en bastaki en once calisir
 					  
	 */

public class StaticBlock {
	
	//static block kullanmadim
	static int yas = 12;
	
	//deger atamak icin static block kullandik
	static int yil;
	static {
		 yil = 2022;
		}
	
	static {
		System.out.println("static block 1");
		
	}
	
	static {
		System.out.println("static block 2");
		
	}
	
	static {
		System.out.println("static block 3");
		
	}
	
	public static void main(String[] args) {
		
		StaticBlock obje = new StaticBlock();
		method1();
		System.out.println("Main");
		method2();

	}
	
	public static void method1() {
		System.out.println("Method 1");
	}
	
	public static void method2() {
		System.out.println("Method 2");
	}
	
	StaticBlock(){
		System.out.println("Constructor");
	}
	
}
