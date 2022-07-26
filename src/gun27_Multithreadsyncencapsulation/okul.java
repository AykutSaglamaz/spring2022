package gun27_Multithreadsyncencapsulation;

public class okul {

	public static void main(String[] args) {
		
	// 1. yol Default constructur
		Ogrenci ogr1 = new Ogrenci();
		System.out.println(ogr1.getIsim());//Ali Can
		
		
		ogr1.setIsim("Veli Han");
		
		System.out.println(ogr1.getIsim());// Veli Han
		
		
		Ogrenci ogr2 = new Ogrenci();
		
		System.out.println(ogr2.getIsim());//Ali Can
		
		
	//2. yol Parameteresi olan constructor
		
		
		Ogrenci ogr3 = new Ogrenci("Ayse Tan", 33, true);
		
		
		System.out.println(ogr3.getIsim());
		
		System.out.println(ogr3.getYas());
		
		System.out.println("=========-");
		
		//3. yol 
		
		Ogrenci ogr4 = new Ogrenci();
		
	ogr4.setIsim("Hakan Can");
	ogr4.isBasariliMi();
	ogr4.setBasariliMi(false);
	
	System.out.println(ogr4.getIsim());
	System.out.println(ogr4.isBasariliMi());
	

	}

}
