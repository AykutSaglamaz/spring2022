package gun27_Multithreadsyncencapsulation;

public class Runner {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		cat1.miyow();
		cat1.beslenme();
		cat1.hareket();
		
		System.out.println("====================");
		
		Dog dog1 = new Dog();
		dog1.havlamak();
		dog1.beslenme();
		dog1.hareket();
		
		System.out.println("====================");
		
		Bird bird1 = new Bird();
		bird1.ucar();
		bird1.beslenme();
		bird1.hareket();



	}

}
