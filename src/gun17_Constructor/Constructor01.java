package gun17_Constructor;

public class Constructor01 {
	
	/*
	 Java, classlarin object olusturmak icin var oldugunu bilir, bu nedenle object olusturmak icin constructorlara ihtiyacimiz var 
	 bunun icin bir class olusturulurken Java otomatik olarak bir constructor olusturur. 
	 Eger siz bir constructor olusturursaniz Java bu default constructor i siler
	 
	 Not; constructorlar method degildir, cunku contructorlarin return typeleri yoktur
	 
	 
	 Mulakat sorusu: constructor ile method arasinda fark nedir
	 
	 1) Constructorlarin return typeleri yoktur, methodlarin ise vardir
	 2) Methodlar herhangi bir ismi method ismi alabilirler, fakat constructorlarin ismi MUTLAKA class (sinif) ismi ayni olmak zorundadir
	 
	 not:  Defualt constructor parametresi olamayan bir constructordir yani bu ornekte oldugu gibi ==> "public Constructor01 () {}"
	 
	 
	 
	 */
	
	

	public static void main(String[] args) {


	}
	
	public int toplam (int a, int b) {
		
		return a+b;
	}
	
	// constructor nasil olusturulur
	// access modifier + sinif ismi () + { }
	
	public Constructor01 () {
		
	}
	
	public Constructor01 (int a) {
		
	}
	
	public Constructor01 (int a, String b) {
		
	}
	
	public Constructor01 (int a, String b, double c) {
		
	}
	
	
	

}
