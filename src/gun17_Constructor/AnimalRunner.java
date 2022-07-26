package gun17_Constructor;

public class AnimalRunner {

	public static void main(String[] args) {
		
		Animal obj1 = new Animal ();
		
		
		Animal obj2 = new Animal ("Bobby", 3, "Bulldog");
		
		
		Animal obj3 = new Animal ( 5, "puppy");
		
		
		System.out.println(obj2.isim);
		System.out.println(Animal.counter);
		
		
		
		
		
		

	}

}
