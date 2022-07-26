package gun26_StringBuilder;

public class StringBuilder02 {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder ("Java Kolaydir");
		StringBuilder sb2 = new StringBuilder ("Java Kolaydir");
		
		// StringBuilder nasil kiyaslanir
		//StringBuilder equals methodu "==" gibi calisir yani hem referansa hemde degere bakar
		
		
		System.out.println(sb1.equals(sb2));//false
		System.out.println(sb1.equals(sb1));//true
		
		System.out.println(sb1 == sb2);//false
		
		
		System.out.println(sb2.indexOf("y"));//9
		
		System.out.println(sb2.indexOf("a"));//1
		
		System.out.println(sb2.indexOf("m"));//-1
		
		System.out.println(sb2.indexOf("a", 5));//8
		
		//insert (index, String)
		
		StringBuilder sb3 = new StringBuilder ("Ahmet");
		
		System.out.println(sb3.insert(1, " ve Mehmet"));
		
		System.out.println(sb3);
		
		
		//reverse
		
		StringBuilder sb4 = new StringBuilder ("Ahmet ve Ayseler Caliskandir");
		
		sb4.reverse();
		System.out.println(sb4);//ridnaksilaC relesyA ev temhA
		
		
		//replace()
		StringBuilder sb5 = new StringBuilder ("Ahmet ve Ayseler");
		sb5.replace(2, 5, "*");
		
		System.out.println(sb5);//Ah* ve Ayseler
		
		sb5.replace(6, 12, "");
		
		System.out.println(sb5);//Ah* veer
		
		
		//set char
		StringBuilder sb6 = new StringBuilder ("Ahmet ve Ayseler");
		sb6.setCharAt(8, '*');
		
		System.out.println(sb6);//Ahmet ve*Ayseler
		
		
		
		StringBuilder sb7 = new StringBuilder ("Ahmet");
	System.out.println(sb7.capacity());	//21
		
		//trimToSize();
	
	sb7.trimToSize();
	System.out.println(sb7.capacity());//5
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
