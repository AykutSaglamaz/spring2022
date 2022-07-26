package gun10;

public class String02_StringManipulation {

	public static void main(String[] args) {
		
		
		//18. method : replaceAll ==> replace gibi calisir, sonucu String dondurur
		
		String s1 = " Java lava degildir";
		
		
	System.out.println(s1.replaceAll("l", "s"));
	System.out.println(s1.replaceAll("lava", "J"));
	
	/*
	 replace() ile replaceAll() farkliliklar
	 	1) 	replace() biz String veya char parametre olarak kullanabiliriz
	 	 	replaceAll() sadece String parametre olarak kullanilabilir
	 	2) replaceAll(), bazi Regular Expressions (regex)==> syntax kullanilir ve bir den fazla karakteri temsil edebilir
	 	
	 	orn: a)  \\d ==> butun rakamlari degistirir (0, 1 ,2, .....9)
	 		  	 \\D ==> rakamlar disindaki butun karakterileri degistirir 
	 		 b) \\w ==> alttire (_) ve a-z ile A-Z ve 0-9 karakterleri kapsar
	 		 	\\W ==> alttire (_) ve a-z ile A-Z ve 0-9 karakterleri disindaki karakterleri kapsar 
	 		 3) \\s ==> bosluk icin kullanilir
	 		 	\\S ==> bosluk (space) harici diger karakterler icin 
	 		 4)	\\A ==> String baslangicinin tamami icin kullanilir
	 		 	\\Z ==> tum String in son kismi icin 
	 		 5) [xyz] veya [abc] ==> x, y, z nin tamami icin gecerli
	 		 	[^xyz] x, y ve z harfleri disindaki butun karakterler

	 */
	
	// orn 1)
	String s2 = "A1b8C9D87";
	 System.out.println(s2.replaceAll("\\d", "*"));
	 System.out.println(s2.replaceAll("\\d", ""));
	 
	 System.out.println(s2.replaceAll("\\D", "!"));
	 System.out.println(s2.replaceAll("\\D", ""));
	
		// orn 2)
	 String s3 = "a0B1_!  xm?";
	
	 System.out.println(s3.replaceAll("\\w", "*"));//*****!  **?
	 System.out.println(s3.replaceAll("\\W", "*"));//a0B1_***xm*

	// orn 3)
	 String s4 = "  Ali Can   ";
	 
	 System.out.println(s4.replaceAll("\\s", "*"));//**Ali*Can***
	 System.out.println(s4.replaceAll("\\S", "*"));//  *** *** 
	 
	// orn 4)
	 
	 String s5 = " 3,15.99 ";
	 
	 System.out.println(s5.replaceAll("\\A", "Dolar"));//Dolar 3,15.99
	 System.out.println(s5.replaceAll("\\Z", "TL"));// 3,15.99 TL
	 
	// orn 5)
	 
	 String s6 = "Ali Can bey";
	 
	 System.out.println(s6.replaceAll("[lCy]", "x"));//Axi xan bex
	 
	 System.out.println(s6.replaceAll("[^Ai ]", "Z"));//AZi ZZZ ZZZ
	 System.out.println(s6.replaceAll("[^ACb]", "*"));//A***C***b**
	 
	}

}
