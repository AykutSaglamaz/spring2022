package gun27_Multithreadsyncencapsulation;

	/*
	 		Veri gizleme islemine "Encapsulation" denir
	 	1) Sinif uyelerini gizlemek istiyorsak, private access modifier kullaniriz
	 		Eger baskalarinin bu objelere (degiskenlere) yada onlarin detaylarina erismesine istemiyorsak, "toString()" kullanmayiz.
	 	2) Gizlenmis degiskenlerin degerlerini okumak icin "getters" methodunu olustururuz. bu "getters" ile degiskenin degerini okuruz
	 	3) Gizlenmis degiskenlerin degerini spesifik bir obje icin guncellemek istiyorsak, "setters" methodunu kullaniriz
	 	
	 	Not: Immutable class olusturmak icin
	 		a) degiskenlerin access modifierlerini "private" yapariz
	 		b) Herhangi bir setters methodunu olusturmayiz.
	 		
	 	Not: getter() ve setter() methodlarina "Java Beans" denir;
	 	
	 	 
	 	Not: Getter/Setter method isimleri "get" ile baslar ve "degiskenin ismi" ile devam eder
	 		int yas = 11; ==> getter: getYas()- setter: setYas()
	 		fakat eger degisken "boolean" ise, getter method isimleri "is" ile baslar ve degisken ismi ile devam eser
	 		 boolean yasli= true; ==> getter:isYasli() - setter: setYasli();
	 		 
	 	Not: a) getter'in return type degiskenin (variable) return type ile aynidir
	 		b) setter"in return type ise DAIMA "void" dir
	 		c) Getters methodu "parametre" KULLANMAZ. fakat setters methodu MUTLAKA "parametre kullanmaliki degiskenin degerini guncellesin
	 	
	 		 
	 */


public class Ogrenci {
	
	private String isim= "Ali Can";
	private int yas=37;
	private boolean basariliMi = false;
	
	
	public Ogrenci() {
	}

	public Ogrenci(String isim, int yas, boolean basariliMi) {
		this.isim = isim;
		this.yas = yas;
		this.basariliMi = basariliMi;
	}


	public Ogrenci(String isim, int yas) {
		this.isim = isim;
		this.yas = yas;
	}


	@Override
	public String toString() {
		return "Ogrenci + isim + " + yas  + basariliMi ;
	}


	public String getIsim() {
		return isim;
	}


	public void setIsim(String isim) {
		this.isim = isim;
	}


	public int getYas() {
		return yas;
	}


	public void setYas(int yas) {
		this.yas = yas;
	}


	public boolean isBasariliMi() {
		return basariliMi;
	}


	public void setBasariliMi(boolean basariliMi) {
		this.basariliMi = basariliMi;
	}






	

}
