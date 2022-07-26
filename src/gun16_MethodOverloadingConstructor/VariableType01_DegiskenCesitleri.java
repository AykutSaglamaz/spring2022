package gun16_MethodOverloadingConstructor;
	/*
 	 		Java icin 3 ana degisken (variable) vardir
 	 		
 	 	a)Local variable (yerel degisken):  Bir method body (govdesi) icerisinde olusturuyorsak bu local variable'dir
 	 										Local variable'lara mutlaka bir deger atamasi yapilmasi lazim
 	 										Bir degisken olusturdugumuzda Java bu degiskenlerin varsayilan degerini kullanir
 	 										ancak bu degisken local variable ise Java varsayilan degeri KULLANMAZ. 
 	 										local degiskenler icin bizim bir deger atamamiz lazim, aksi taktirde local variable'i
 	 										kullanmak istedigimizde JAVA sikayet eder
 	 	b) Instance(Object) Variables: Methodlarin disinda fakat sinifin icinde "static" anahtar sozcugunu KULLANMADAN 
 	 						bir degisken olusturursaniz buna instance (object) variable" denir.
 	 						Bir instance variable icin deger atama sart degildir.
 	 						eger deger atamasi yapilirsa JAva bu degeri kullanir
 	 						eger deger atamasi yapilmazsa Java bu degisken icin varsayilan degeri kullanir
 	 						
 	 	c) Class (static) variables: Methodlarin disinda fakat sinifin icinde "static" anahtar sozcugunu KULLANARAK 
 	 						bir degisken olusturursaniz buna Class variable" denir.
 	 	
	 */
public class VariableType01_DegiskenCesitleri {

	//instance variable
	String adress = "Turkiye";
	char harf; 
	
	
	
	//class variable
	static String sehir = "Istanbul";
	

	
	public static void main(String[] args) {
		//local variable
		String isim = "Ali";
		String soyad= " Can";
		
		System.out.println(isim);
		System.out.println(soyad);
		
		System.out.println(sehir);
		
	}
	
	
	public int cikarma(int a, int b) {
		
		//local variable 
		int x = 12;
		System.out.println(adress);
		System.out.println(sehir);
		
		return a-b;
	}
	
	
	
 
}
