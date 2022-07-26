package gun17_Constructor;

public class Animal {
	
	String isim;
	int yas;
	String tur;
	
	static int counter=0;
	
  // pramatresiz constructor
	public Animal () {
	  counter++;
  }
	
	// Tum degiskenlere sahip constructor 
	public Animal (String isim, int yas, String tur) {
		this.isim = isim;
		this.yas = yas;
		this.tur = tur;

		  counter++;
	  }
	//iki parametreli constructor
	public Animal (int yas, String tur) {
		this.yas = yas;
		this.tur = tur;

		  counter++;
	  }
	
	

}
