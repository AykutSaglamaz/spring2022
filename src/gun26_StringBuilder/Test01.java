package gun26_StringBuilder;

public class Test01 {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String ("Java");
		
		StringBuilder sbld = new StringBuilder("Java");
		
		if(s1==s2) {
			System.out.println("s1 ile s2 birbirinde esittir with '==' ");
			
		}
		
		if(s1==s3) {
			System.out.println("s1 ile s3 birbirinde esittir with '==' ");
		}
		
		if(s1.equals(s3)) {
			System.out.println("s1 ile s3 birbirinde esittir with 'equals()' ");
		}
		
		
//		if(s1==sbld) {
//			System.out.println("s1 ile sbld birbirinde esittir with '==' ");
//			
//		}

		//Eger data type farkli olan iki objeyi equal() ile kiyaslarsaniz, java size false dondurur
		
		if(s1.equals(sbld)) {
			
			System.out.println("s1 ile sbld birbirinde esittir with 'equals()' ");
		}
		

	}

}
