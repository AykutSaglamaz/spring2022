package gun05;

public class Ders6_Concatenation {

	public static void main(String[] args) {
		// concatenation=> bir araya getirme/birlestirme
		
		String str = "Ali";
		String strBir = "Can";
		System.out.println(str+ " cok caliskandir. " +strBir+ "!!!!");
		
		System.out.println(2+3+""+8);
		
		
		System.out.println(str + 2 + 3);//Ali23
		System.out.println(2 + str + 3);//2Ali3
		
		System.out.println(2 + str + 3+strBir);//2Ali3Can
		System.out.println(2 + str +strBir+ 3);//2AliCan3
		
		System.out.println(2 + str +strBir+ (3*5));//2AliCan15
	}

}
