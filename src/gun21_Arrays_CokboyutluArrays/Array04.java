package gun21_Arrays_CokboyutluArrays;

import java.util.Arrays;

public class Array04 {

	public static void main(String[] args) {
		// 2 Array in esit olup olmadigini nasil check ederiz 
		/*
		 		Arrayleri esit yada ayni yapmak icin
		 1) Elementleri ayni olmalidir
		 2) Ayni elementler ayni indexte olmalidir
		 */
		
		
		String s1 [] = {"Ali", "Can", "Veli"};
		String s2 [] = {"Veli", "Ali", "Can"};
		String s3 [] = {"Ali", "Can", "Veli"};
		String s4 [] = {"Veli", "Ali", "Can"};
		
		System.out.println(Arrays.equals(s1, s2));//false
		
		System.out.println(Arrays.equals(s1, s3));//true
		
	
		
		// 2 Array in ayni elementlere sahip oldugunu indexlere bakmadan bulmak istiyorsak Arrays.sort() kullanilir
		
		Arrays.sort(s2);// [Ali, Can, Veli]
		
//		System.out.println(Arrays.equals(s1, s2));//true
		
		if (Arrays.equals(s1, s4)) {
			System.out.println(" Bunlar ayni elementlere sahiptir");
			
		}else {
			System.out.println("Bunlar ayni elementlere sahip degildir");
		}
		
		
		// split() ==> "Bunlar ayni elementlere sahip degildir"
		
		String s5 = "Bunlar ayni elementlere sahip degildir";
		
		String kelime [] = s5.split(" ");
		
		System.out.println(Arrays.toString(kelime));//[Bunlar, ayni, elementlere, sahip, degildir]
		
		String parca[] =s5.split("a");
		System.out.println(Arrays.toString(parca));//[Bunl, r , yni elementlere s, hip degildir]
		
		String harf [] =s5.split("");
		
		System.out.println(Arrays.toString(harf));
		System.out.println(harf.length);//38
		
		// Bosluklar haricinde bir String de kac tane karakter kulllanildigini bulmak icin su yontemi kullaniriz
		
		String boslukHaricKarakterler [] = s5.replace(" ", "").split("");
		
		System.out.println(Arrays.toString(boslukHaricKarakterler));//[B, u, n, l, a, r, a, y, n, i, e, l, e, m, e, n, t, l, e, r, e, s, a, h, i, p, d, e, g, i, l, d, i, r]
		
		System.out.println(boslukHaricKarakterler.length);//34
		
		// Bir String herhangi bir karakterin kac defa kullanildigini bulmak icin su yol izlenir.// "a" 
		
		String s6 = "mama may go to Alabamax";
		

		String sehir [] = s6.split("a");
		
		    // bununla alakali butun senaryolara bakilmali
//		1) String "a" ile basliyor ve "a" ile bitiyorsa //"ama may go to Alabama"  // 6
//		2) String "a" ile basliyor ve "a" ile bitmiyorsa //"ama may go to Alabamax"  // 7
//		3) String "a" ile baslamiyor ve "a" ile bitiyorsa //"mama may go to Alabama" //6
//		4) String "a" ile baslamiyor ve "a" ile bitmiyorsa //"mama may go to Alabamax" //7 
		
		//1. yol: tavsiye etmiyor
		
		if(s6.startsWith("a") && s6.endsWith("a")) {
			System.out.println("-->"+ sehir.length);
			
		}else if(s6.startsWith("a") && !s6.endsWith("a")) {
			System.out.println("+++>"+ sehir.length);
			
		}else if (!s6.startsWith("a") && s6.endsWith("a")) {
			System.out.println("===>"+ sehir.length);
			
		}else if (!s6.startsWith("a") && !s6.endsWith("a")) {
			System.out.println("-=->"+ sehir.length);
		}
		
		System.out.println(Arrays.toString(sehir));//[m, m,  m, y go to Al, b, m]
		
		// 2. yol // "mama may go to Alabamax"
		
		String a1 [] = s6.split("");
		String a2 [] = s6.replace("a", "").split("");
		
		System.out.println("2. yol: "+ (a1.length- a2.length));//6
		
		//3.yol: loops
		int counter = 0;
		for(int i= 0; i<s6.length(); i++) {
			if(s6.charAt(i)=='a') {
				counter++;
			}
		}
		System.out.println("ucuncu yol kullanilan karakter Sayisi: "+ counter);//6

		//4. yol: regex() kullanarak istegimiz karakter disindaki diger butun karakterleri silerek cozulebilir
		
		 System.out.println("4. yol: " + s6.replaceAll("[^a]", "").length());
		
		
		
	}

}
