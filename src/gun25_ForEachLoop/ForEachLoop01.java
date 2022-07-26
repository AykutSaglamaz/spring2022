package gun25_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {
		
		List<Character> list1 = new ArrayList<>();
		
		list1.add('a');
		list1.add('b');
		list1.add('c');
		list1.add('d');
		list1.add('e');
		list1.add('g');
		list1.add('t');
		
		System.out.println(list1);// [a, b, c, d, e, g, t]
		//1. yol for-loop
		for(int i = 0; i<list1.size(); i++ ) {
			System.out.print(list1.get(i)+ "X ");//aX bX cX dX eX gX tX 
			
		}
		
		System.out.println();
		
		
		//2.for-Each Loop
		
		for(Character w : list1 ) {
			
			System.out.print(w + "!!! ");// a!!! b!!! c!!! d!!! e!!! g!!! t!!! 
			
		}
		
		System.out.println();
		
		//list1 deki sadece unsuz olan karakterleri yazdirin
		
		
		for (Character w :list1) { //[a, b, c, d, e, g, t]
			
			if(w=='a'|| w=='e' || w =='i'|| w=='u' || w=='o' ) {
				
				continue;
				
			} System.out.print(w + "? ");//b? c? d? g? t? 
			
		}
		
		
		System.out.println();
		
		// list1'deki tum karakterlerin ASCII degerlerini yazdirin
		
		for (Character w :list1) {
			
			System.out.print(w +":" + (int)w + " ");// 97 98 99 100 101 103 116 
		}
		
		System.out.println();
		
	// List1'de tum degerlerin toplamini yazdirin // [a, b, c, d, e, g, t]
		int toplam =0;
		for(Character w : list1) {
			
			toplam+= w;
		}
		System.out.println("Karakterlerin ASCII degerleri toplami: " + toplam);
		
		//ASCII degeri cift olan karacterleri yazdiriniz
		
		for(Character w : list1) {
			if (w%2==0) {
				System.out.print(w + ":"+ (int)w + " ");//b:98 d:100 t:116 
				
			}
		}
		
		System.out.println();
		
		//ASCII degeri 100 den buyuk olan karakterleri degerleriyle beraber yazdirin
		
		Character flag = '?';
		for(Character w : list1) {
			if(w>100) {
				flag = w;
				break;
			}
			System.out.print(w);
			
		}			System.out.println();
		System.out.println(flag+ "'nin  ASCII degeri 100'den buyuktur");
		
		
		//Arraylerde for-each loop kullanilabilir
		
		//Arraydeki elementlerinden sonu "y" ile bitmeyen elemanlari yazdirin 
		
		
		String str [] = {"Hasan", "Huseyin", "Ali", "Olcay"};
		
		for(String w :str) {
			if(!w.endsWith("y")) {
				System.out.print(w + " ");
				
			}
			
		}
		System.out.println();
		
		for(String w :str) {
			if(!w.startsWith("H")) {
				System.out.print(w + " ");
				
			}
			
		}
		

	}

}
