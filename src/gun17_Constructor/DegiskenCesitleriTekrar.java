package gun17_Constructor;

public class DegiskenCesitleriTekrar {
		// 1) local variable : bir method icinde yazilir ve bir deger atanir
		// 2) instance (object) variable degisken = Method govdesinin disinda ama sinifin icinde yazilirsa buna instance variable deriz.
		// 'static' anahtar kavrami bu degiskenle kulanilmaz. Instance degiskenlerine deger atamak zorunlu degildir.
	
		//3) Class (static) degiskeni : Method govdesinin disinda ama sinifin icinde yazilirsa buna Class (static) variable deriz.
	// 'static' anahtar kavrami bu degiskenle kullanmak zorunludur. Class (static) degiskenlerine deger atamak zorunlu degildir.
	

	String soyadi;//null
	int yas = 56;
	char cinsiyet= 'K';
	static String address = "Istanbul";
	
	public static void main(String[] args) {
		//local degisken 
		int x = 4;
		String isim = "Ali";

	}
	
	public int toplam(int a) {
		//local degisken
		int y = 5;
		boolean GuzelMi = true;
		
		return 2;
		
	}
	
	boolean acMi;//false
	

}
