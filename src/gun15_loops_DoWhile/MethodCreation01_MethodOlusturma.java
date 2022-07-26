package gun15_loops_DoWhile;

public class MethodCreation01_MethodOlusturma {
	// Eger bir method 'static' ise onun icerindeki hersey 'static' olmak zorundadir

	public static void main(String[] args) {
		
		System.out.println(toplam(2, 6));// arguments
		System.out.println(toplam(5, 16));
		System.out.println(toplam(2, 6, 9));
		
		
		
		
	}	
	
	/*
	 Bir sinif icinde isimleri ayni olan methodlar olusturmak istiyorsak, parametereleri farkli hale getirmemiz lazim
	 	1) Parametrelerin data tipini (data type) farkli yapin
	 	2) Parametrelerin sayisini degistirebiliriz
	 	3) Parametrelerin data tipi farkliysa, parametrelerin sirasini degistirin
	 	
	 Not1: Eger a) isimleri ayni, b) parametreleri farkli, c) ayni sinifta methodlar olusturursaniz 
	 		buna "Method Overloading" diyoruz.
	 		
	 Not2: "Method Overloading" icin
	 		a) Farkli return tipi kullanmak CTE ortadan kaldirmaz
	 		b) Farkli erisim duzenleyici (access modifier)  kullanmak ise yaramaz, CTE ortadan kaldirmaz.
	 		c) Farkli parametre isimleri kullanmak ise yaramaz, CTE aliriz
	 
	 Not3: Java icin methodlari farkli kilmak icin sadece  a) method ismi ve b)parametre onemlidir
	 	   Bundan dolayi method ismi + parametre" method signature" denilir
	 	
	 	
	 */
	
	public static int toplam (int a, int b) {
		
		//compile time error -> CTE
		//Run time Error -> RTE
		return a+b;	
	}
	//1) Parametrelerin data tipini (data type) farkli yapin
	public static int toplam (short x, int y) {
		return x+y+6;
	}
	//2) Parametrelerin sayisini degistirebiliriz
	public static int toplam (int x, int y, int z) {
		return x+y+z;
	}
	//3) Parametrelerin data tipi farkliysa, parametrelerin sirasini degistirin
	public static int toplam (int x, short y) {
		return x+y+6;
	}
	
	
	
	
	
	
}
