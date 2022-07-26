package gun28_InheritanceOverriding;

public class Animal {
	
	
	/*      Super()
	 1) super() parent (ebeveyn-bir ust sinif) class'dan spesifik bir constructor cagirmak icin kullanilir
	 2) "super()" yazmak ile "super()" yazmamamk arasinda hic bir fark yoktur
	 3) "super()" MUTLAKA ilk satirda ve constructor icinde olmalidir
	 4) "super()" constructor icinde YALNIZCA bir kez kullanilabilir
	 5) "super()" constructor'i sadece "parent class'tan cagrilabilir, grandparent (dede classlardan) cagrilamaz.
	 
	 Not1: Eger "this." kullaniyorsaniz, isimleri farkli olan degiskenlerin tamamina (alt-cocuk veya ust-ebeveyn) siniflardan erisebilirsiniz
	 
	 Not2: Eger parent classlardaki isimleri ayni olan degiskenlere erismek istiyorsaniz, "this." yi KULLANMAYIN, cunku ayni isimli degiskenlere
	 		this. kullanilarak erisilmez. 
	 		
	 Not3: super.'yi kullanarak hem variable call (degisken cagirma) hemde method call (method cagirma) yapabilir
	 
	 
	 */
	
	String isim= "Animal";
	int yukseklik= 33;
	byte hayvaninYasi =3;
	
	public Animal() {
		
		System.out.println("Ebeveyn Constructor calisir... ");
	}
	
	public Animal (String isim) {
		
		System.out.println("Ebeveyn Constructor hareket eder... ");
	}
	
	public void hareket() {
		System.out.println("Hayvanlar hareket eder...");
		
	}
	
	public void beslenir() {
		System.out.println("Hayvanlar beslenir...");
		
	}
	

}
