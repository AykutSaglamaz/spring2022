package gun18_Constructor;

	/*
	 instance (object) degiskeni constructor icinde parametre olarak kullanilir, cunku constructorlar obje olusturur ve constructorlar obje ile 
		baglanili degiskenleri yani instance degiskenlerini kullanir
		
	 Constructorlarin icinde class(static) degiskenleri kullanmayiz, cunku class degiskenleri sinifla baglantilidir. 
	 */

public class Animal {
	
	 String isim;
	 int yas;
	 boolean etcilMi;
	 String tur;
	 char cinsiyet;
	 
	 static int counter;

	public Animal() {
		counter++;
	}

	public Animal(String isim, int yas, boolean etcilMi, String tur, char cinsiyet) {
		
		this.isim = isim;
		this.yas = yas;
		this.etcilMi = etcilMi;
		this.tur = tur;
		this.cinsiyet = cinsiyet;
		counter++;
	}

	public Animal(String isim, int yas, char cinsiyet) {
		
		this.isim = isim;
		this.yas = yas;
		this.cinsiyet = cinsiyet;
		counter++;
	}

	public Animal(String tur) {
//		this();
		
		/*
		 1- "this()",constructor call icin kullanilir
		 2- "this()" MUTLAKA constructor icinde  ve ilk satirda olmalidir
		 3- Bir constructor icinde "this()" yalniz bir kez kullanilabilir
		  
		  
		  				"this()" ile "this" arasindaki fark nedir?
		  1- "this()" constructor call icin kullanilir , "this" degisken cagirma (variable call) icin kullanilir
		  2- "this()" yalnizca bir kez kullanabiliriz, "this"  istediginiz kadar kullanilabilir
 
		 */
		
		this("Kartal", 5, 'K');
		this.tur = tur;
		
		counter++;
	}
	 
	 
	

}
