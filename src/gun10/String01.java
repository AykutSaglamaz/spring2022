package gun10;

import java.util.Scanner;

public class String01 {

	public static void main(String[] args) {
		
		String s1 ="Java ogrenek para kazanarak hayatini yasa";
		
		System.out.println(s1.indexOf("ara", 15));//23  ==> ilk 15 index atlanir sonra karakter aranir 
		
		//9. Method : lastIndexOf() ==> en sondan baslayarak aradigimiz karakteri yazdirir, int dondurur
		
		System.out.println(s1.lastIndexOf("ara")); //23
		
		System.out.println(s1.lastIndexOf("k"));//26
		
		System.out.println(s1.lastIndexOf(" "));//36
		System.out.println(s1.lastIndexOf(""));//41
		
		System.out.println(s1.lastIndexOf("param"));// -1 var olmayan karakterler icin -1 sonucu dondurur
		
		
		System.out.println(s1.lastIndexOf("ara", 22));//14
		System.out.println(s1.lastIndexOf("r", 21));//15

		
		// bir karakterin yanlizca bir kez kullanildigini bulmak icin indexOf () ve lastIndexOf()
		
		// orn, "HHelloo"       indexOf ("H")--> 0       lastIndexOf("H") --> 1
		//						indexOf ("e")-->2   =   lastIndexOf("e") --> 2 ==> 'e' yalnizca bir kez kullanilmistir 
		
		
		
		
		//10. method : startsWith() =>> Bir String in aradigimiz bir karakterle baslayip baslamadigini bize yazdirir, boolean dondurur
		
		
		String s2 = "Java kolaydir";
		
		
		System.out.println(s2.startsWith("J"));// true
		
		System.out.println(s2.startsWith("K"));//false
		System.out.println("=========");
		
		System.out.println(s2.startsWith("a", 3));//true
		
		//11. endsWith() bir string in aradigimiz bir karakterle bitip bitmedigine bakar ve boolean dondurur 
		
		System.out.println(s2.endsWith("r"));//true
		
		System.out.println(s2.endsWith("N"));// false
		
		System.out.println(s2.endsWith("kolaydir"));//true
		
		System.out.println(s2.endsWith("Java kolaydir"));//true
		
		
		//12. method : isEmpty() ==> String in bos olup olmadigina bakar ve boolean dondurur
		
		String s3 = "";
		String s4 = null;
		System.out.println(s3.isEmpty());//true
		System.out.println(s2.isEmpty());//false
		
//		System.out.println(s4.isEmpty());//NullPointerException ==> isEmpty() null String kullanilmaz
		
		
		//13. method : concat() ==> iki String i bir araya getirmek icin veya birlestirmek icin kullanilir + String dondurur
		
		
		String s6 = "Ali";
		String s7 = "Can";
		
		System.out.println(s6 + " " + s7);// Ali Can ==>  (+) arti isareti integerlarda toplama islevi gorur
													//    (+) arti isareti char toplama islevi gorur
													//	  (+) arti isareti String concatination (birlestirme) gorevi gorur
				
		System.out.println(s6.concat(s7).concat("wooow").concat(s6));
		
		System.out.println('a'+'b');//195
		
		//14. method : replace() ==> Bir karakter yerine baska bir karakter yazmak istedigimizda replace() kullalinir ve String dondurur
		
		System.out.println("=========================");
		String s8 ="$3.199,89";
		System.out.println(s8);
		
		System.out.println(s8.replace("$", "").replace(",", "???"));//3.199???89
		
		String s9 = "Java kolaydir kolay";
		System.out.println(s9.replace("Java", "Python"));
		
		System.out.println(s9.toLowerCase().replace("kolay", "zor").charAt(5));
		
		 String s10 = "Java";// J_A_V_A_
	
		//1. yol
		 
		 System.out.println(s10.toUpperCase().replace("A", "_A_"));//J_A_V_A_
		 
		 //2.yol
		 System.out.println(s10.replace("a", "_A_").replace("v", "V"));//J_A_V_A_
		 
		 System.out.println(s10.replace("", "/"));// /J/a/v/a/
		 
		 
		//15. method : substring() ==> String in belli bir kismini almak kullanilir ve String dondurur
		 
		 
		 String s11 = "Java kolaydir";
		 System.out.println(s11.substring(5));//kolaydir ==> eger bir String in bir karakterden sonraki tum kismi almak istiyorsaniz
		 									// sadece baslangic indexi kullanmak en iyisidir
		 
		 System.out.println(s11.substring(13));// hicbir sey dondurmez
		 
		 
		 System.out.println(s11.substring(5, 9));//kola ==> baslangic indexi dahil, bitis index dahil degildir
		 
		 System.out.println(s11.substring(5, 13));// kolaydir==> 13. index string de mevcut degil fakat 13. index dahil olmadigi icin 
		 										//	12. karaktere kadar yazdirir
		 
//		 System.out.println(s11.substring(5, 14));//StringIndexOutOfBoundsException
		 
		 
		 System.out.println(s11.substring(5, 5));// hicbisey 
		 
//		 System.out.println(s11.substring(9, 5));//StringIndexOutOfBoundsException
		 
		 /*
		  * Kullanicidan bir String girmesini isteyin
		  * Bu string in ilk ve son karakterini yazdirin
		  */
//		 
//		 Scanner scan = new Scanner(System.in);
//		 System.out.println("Lutfen bir String giriniz");
//		 String s12 = scan.nextLine();
//		 
//		
//		 String ilk = s12.substring(0, 1); // s12.charAt(0); 
//		 String son = s12.substring(s12.length()-1); // s12.charAt(s12.length()-1);
//		 
//		 System.out.println(ilk + " " +son);
//		 
		//16. method : trim() ==> String in basinda veya sonunda bosluk var ise onu kaldirir ve sonucu String dondurur
		 
		 String s13 = "     Ali      Can     ";
		 
		String trimmeds13= s13.trim();
		  System.out.println(trimmeds13);
		  
		  
		  //17.method IsBlank() Bir String in ""  ve " " disinda bir karakter var mi yok mu ona bakar, sonucu boolean dondurur
		  
		  String s14 = "";
		  String s15 = " ";
		  String s16 = "    ";
		  System.out.println(s14.isBlank());//true
		  System.out.println(s14.isEmpty());//true
		  
		  System.out.println(s15.isBlank());//true
		  System.out.println(s15.isEmpty());//false
		  
		  System.out.println(s16.isBlank());//true
		  System.out.println(s16.isEmpty());//false
		  
		  
		  
		
		
	}

}
