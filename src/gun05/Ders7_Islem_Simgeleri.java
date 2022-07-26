package gun05;

public class Ders7_Islem_Simgeleri {

	public static void main(String[] args) {
		/*
		 1) "=" ==> deger atama 
		 	orn, int yas = 28;
		 	
		 2) "==" anlami esittir, boolean dondurur
		 	orn boolean a == b;
		 		return true/false dondurur
		 3) "!=" anlami esit degildir, boolean dondurur
		 	orn,	a!=b, a esit degil b,
		 4) ">", "<", ">=", "<=", boolean dondurur.
		 	orn a>b=> a buyuktur b
		 5) "&"   "&&" bir yanlis (false) sonucu buldugunda kodlari okumayi
		 				birakir ve false dondurur.
		 6) || pipe/or  bir true sonucu var ise sonuc true olur.  
		 */
		
		int a = 12;
		
		System.out.println(12==12);//true
		System.out.println(12==2*6);
		System.out.println(12!=2*7);//true
		
		System.out.println(12>=2*5);

	}

}
