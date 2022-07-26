package gun18_Constructor;

public class AnimalRunner {

	public static void main(String[] args) {
		
		Animal a1 = new Animal("Memeli");
	//	Animal a2 = new Animal("Surungenler");
		 System.out.println(a1.yas);//5
		 System.out.println(a1.isim);//Kartal
		 System.out.println(a1.cinsiyet);//K
		 System.out.println(a1.tur);//Memeli
		 System.out.println(a1.etcilMi); //false
		 
		 System.out.println(Animal.counter);
		 
	
		 
		
		
	}

}
