package gun27_Multithreadsyncencapsulation;

	/*
 		1) Java'da ebeveyn-cocuk (parent-child) iliskisi vardir
 		2) Bir ebeveyn sinirsiz sayida cocuk (alt) sinifina sahip olabilir
 			Java'da bir cocuk (alt sinif) YALNIZCA bir tek ebeveyne (parent) sahip olabilir 
 			yani Java coklu kalitim (inheritance) desteklemez 
 		3) Inheritance demek alt (child-cocuk) siniflarin ebeveyn siniflarinin uyelerini kullanabilecegine imkan saglamak demektir
 		4) Inheritance 3 amacla kullanilir
 			a) code tekrarini onler (repetaion)
 			b) code'larin bakimini kolaylastirir (maintenance)
 			c) code"larin tekrar tekrar kullanimina izin verir (reusability)
 		5) Bir alt (child-cocuk) sinifi baba, dede ve onun dedesi sinifina da sahip olabilir
 			a) Single (tek) inheritance:  Alt (cocuk) sinif sadece bir ebeveyne sahiptir
 			b) Hierachical (katmanli)  inheritance: Ebeveyn bir fasla alt ( cocuk ) sinifa sahip olabilir
 			c) Multi-level inheritance (cok katmanli) : Eger alt sinif hem ebeveyn, hem dede, hemde onun dedelerine sahip olabilir
	 */

public class Animal {
	
	public void hareket() {
		System.out.println("Hayvanlar hareket eder");
		
	}
	
	public void beslenme() {
		
		System.out.println("Hayvanlar beslenir");
	}
	

}
