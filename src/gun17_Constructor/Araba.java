package gun17_Constructor;

public class Araba {
	
	String marka;
	int fiyat;
	int yil;
	String model;
	String renk;
	static int satilanAracSayisi =0;

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
		// object olustururken== > Sinif ismi   + Object ismi = new + Constructor()
		
		Araba obje1 = new Araba ("Audi", 20000, 2020, "Q5", "Beyaz");
		
		System.out.println(obje1.marka);
		System.out.println(obje1.fiyat);
		System.out.println(obje1.yil);
		System.out.println(obje1.model);
		System.out.println(obje1.renk);

		Araba obje2 = new Araba ("BMW", 25000, "X5");
		
		System.out.println(obje2.marka);
		System.out.println(obje2.fiyat);
		System.out.println(obje2.model);
		
		Araba obje3 = new Araba ("Honda");
		
		System.out.println(obje3.marka);
		
		Araba obje4 = new Araba();
		
		System.out.println(obje4.marka);//null
		System.out.println(obje4.fiyat);// 0
		System.out.println(obje4.yil);// 0
		System.out.println(obje4.model);// null
		System.out.println(obje4.renk);// null
		
	
		System.out.println(obje1.satilanAracSayisi);//4
		
		System.out.println(obje2.satilanAracSayisi);//4
		
		System.out.println(obje3.satilanAracSayisi);//4
		System.out.println(obje4.satilanAracSayisi);//4
		
		System.out.println(satilanAracSayisi);//4

	}
	
	public Araba (String marka, int fiyat, int yil, String model, String renk) {
		this.marka = marka;
		this.fiyat= fiyat;
		this.yil = yil;
		this.model = model;
		this.renk = renk;
		satilanAracSayisi++;
		
	}
	
	public Araba (String marka, int fiyat, String model) {
		this.marka = marka;
		this.fiyat= fiyat;
		this.model = model;
		
		satilanAracSayisi++;
		
	}
	
	
	public Araba (String marka) {
		this.marka = marka;
		
		satilanAracSayisi++;
		
	}
	
	public Araba () {
				
		satilanAracSayisi++;
		
	}
	

}
