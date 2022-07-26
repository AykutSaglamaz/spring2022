package gun08_ternary;

public class Ternary01 {

	public static void main(String[] args) {
		
		
		
		int x = 11;
//		 					sart		? sart saglaniyorsa bu kisim :  sart saglanmiyorsa bu kisim okunur
		String sonuc =   x%2==0         ?     "bu cift sayi"   		 :   "bu tek sayi";
		
		
//		System.out.println(x%2==0    ?   "bu cift sayi"    :   "bu tek sayi");
		
		System.out.println(sonuc);

	}

}
