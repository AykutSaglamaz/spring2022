package gun11_loops_donguler;

public class ForLoop01 {

	public static void main(String[] args) {

		// console 10 defa "Hello World!" yazdiriniz
		
		
		String s1 = "ali";
		//1. yol
		
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
		
		//2. yol = for-loop 
		// for (Baslangic noktasi : sart ; arttirma veya azaltma
		
		for(int i = 0; i<10; i++) {
			System.out.println("Hello World!");
				
			}
		System.out.println("=======");
		
		//12 ile 19 arasindaki sayilari aralarinda bir bosluk birakarak yan yana yazdiriniz
		
		for (int j = 12; j<20; j++ ) {
			System.out.print(j+ " ");
	
		}
		
		System.out.println("=======");
		
		//12 ile 19 arasindaki cift sayilari aralarinda bir bosluk birakarak yan yana yazdiriniz
		
		for (int i = 12; i<=19; i+=2) { //i+=2 == i=i+2
			System.out.print(i+ " ");//12 14 16 18 
			
		}
		System.out.println("=======");
		
		// 21 ile 14 arasindaki tek sayilari aralarinda bir bosluk birakarak yan yana yazdiriniz
		
		for (int i = 21; i>=14; i-=2) {//21 19 17 15 
			System.out.print(i+ " ");
		}
		System.out.println("=======");
		//15 ile 100 arasindaki cift sayilari yazdiriniz
		
		//1. yol
		
		for (int i = 16; i<101; i=i+2){
			System.out.print(i+ " ");
			
		}
		System.out.println("=======");
		
		//2. yol
		
		for (int i =15; i<101; i++) {
			if(i%2==0) {
			System.out.print(i+ " ");
				
			}
			
		}
		
		System.out.println("=======");
		// 13 ile 130 arasindaki 4 ve 6 ile tam bolunen sayilari yazdiriniz
		
		//1. yol 
		 for (int i = 24; i<131; i+=12 ) {
			 
			 System.out.print(i+ " ");
		 }
		
		 //2.yol
		 
		 for ( int i=13;  i<131; i++) {
				if(i%4==0 && i%6==0) {
					System.out.print(i+ " ");
				}
			}
		
		 System.out.println("=======");
		 
		// Bir String in her bir karakterinin arasina birer bosluk birakarak yazdiriniz
		 // orn,  Aykut ==> A y k u t 
		 
		 String str = "Java ogren paran kazan";
		 System.out.println(str.length());
		 
		 
		 for (int i =0; i<str.length(); i++ ) {
			 System.out.print(str.charAt(i) + " ");
			 
		 }
		 
		 
		 

	}

}
