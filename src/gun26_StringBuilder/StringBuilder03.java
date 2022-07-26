package gun26_StringBuilder;

public class StringBuilder03 {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder ("Java Kolaydir");
		StringBuilder sb2 = new StringBuilder ("Java Kolaydir");
		
		System.out.println(sb1.equals(sb2));//false
		
		System.out.println(sb1.toString().equals(sb2.toString()));//true
		
		//CompareTo()
		
		System.out.println(sb1.compareTo(sb2));//0 --> Eger StringBuilderlar ayni karakterlere sahipse bize "0" dondurur
												// Ayni karakterlere sahip degilse "-1" dondurur
		
		
		StringBuilder sb3 = new StringBuilder ("Java"); // default capacity + kullanilan karakter sayisi
		System.out.println(sb3.capacity());//20
		
		System.out.println("..........");
		
		StringBuilder sb4 = new StringBuilder ();// capacity 16
		
		System.out.println(sb4.capacity());//16==>34
		
		sb4.append("Ali Kemal Ozturk");
//		sb4.trimToSize();
		
		System.out.println(sb4.capacity());
		
		//substring()
		
		sb4.substring(5);
		
		System.out.println(sb4.substring(5));
		
		
		
		

	}

}
