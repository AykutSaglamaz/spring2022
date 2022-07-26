package gun28_InheritanceOverriding;

public class Mammal extends Animal {
	
	String isim= "Mammal";
	int yukseklik= 22;
	byte mammalinYasi =2;
	
	
	public Mammal (int yukseklik) {
		
		System.out.println(yukseklik+ ".cm");
		super.beslenir();
		super.hareket();
	}
	
	public void hareket() {
		System.out.println("memeli hayvanlar hareket eder...");
		
	}
	
	public void beslenir() {
		System.out.println("memeli hayvanlar beslenir...");
		
	}

}
