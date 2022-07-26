package gun28_InheritanceOverriding;

public class Runner {
	/*
	 	Inheritance'da isimleri ayni olan degiskenler kullaniyorsaniz, olusturdugumuz objeyi kullanrak hangi degiskenlerin 
	 		gorulebililecegini anlamak icin asagidaki kural dikkate alinir:
	 		-->Nesne (obje) olusturmak icin kullandigimiz data type'ne bakilir, yalnizca data type olarak kullandigimiz 
	 			degiskenler gorulebilir
	 			
	 			
	 	Inheritance"da isimleri farkli olan degiskenler kullaniyorsaniz, olusturgunuz obje (nesne) kullanarak hangi degiskenlerin
	 		gorulebililecegini anlamak icin asagidaki kural dikkate alinir:
	 		1) Nesne (obje) olusturmak icin kullandigimiz data type'ne bakilir, data type olarak kullandigimiz sinifta ve parents(ebeveyn)
	 		  siniflarinda isimleri farkli olan degiskenler gorulebilir.
	 		2) Data type olarak kullandigimiz sinifin alt (child-cocuk) siniflarinda farkli olan degiskenleri gormemiz mumkun degildir. 
	 */

	public static void main(String[] args) {
		
		Mammal x1 = new Bird();
		
	
		
		

	}

}
