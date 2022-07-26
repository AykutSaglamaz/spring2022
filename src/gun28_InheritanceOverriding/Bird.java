package gun28_InheritanceOverriding;

public class Bird extends Mammal {
	
	String isim= "Bird";
	int yukseklik= 11;
	byte kusunYasi =1;
	
	public Bird() {
		
		super(3);
		
		
		System.out.println(super.hayvaninYasi);
		System.out.println(super.mammalinYasi);
		System.out.println(super.isim);
		System.out.println(super.yukseklik);
		
		super.hareket();
		
		
		//this. 
		
		System.out.println("Kus constructori calisir...");
	}
	
	public void hareket() {
		System.out.println("Kuslar hareket eder...");
		
	}
	
	public void beslenir() {
		System.out.println("Kuslar beslenir...");
		
	}
	

}

 