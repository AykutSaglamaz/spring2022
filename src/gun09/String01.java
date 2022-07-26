package gun09;

import java.util.Scanner;

public class String01 {

	public static void main(String[] args) {
		//1. method: equal() ==> karsilastirma yapar ve (Returns) boolean dondur
		//2. method: equalIgnoreCase() ==> karsilastirma yapar  (Returns) boolean dondur orn, Ali == ali=> true,  Ali == Veli => false
		//3. method: length () ==> String'in kac karacter kullandigini soyler + Returns int 
		
		String s1 = ""; 
		
		System.out.println(s1.length());//0  ==> bos bir String icin lenght(), 0 (sifir) dondurur
		
		String s2 = " ";
		System.out.println(s2.length());// 1 ==> bosluk (space) bir karakter olarak kabul edilir
		
//		String s3 = null;
//		System.out.println(s3.length());// NullPointerException ==<  String null icin length() kullanilmaz
		
		String s4 = "Java ogren para kazan...";
		System.out.println(s4.length());//24
		
		
		//4. method : toUpperCase() ==> karakterleri buyuk harfe cevirir, String dondurur
		//5. method : toLowerCase() ==> karakterleri kucuk harfe cevirir, String dondurur
		//6. method	: contains()	==> aradigimiz karakter/karakterlerin o String icerisinde var olup olmadigini kontrol eder + boolean dundurur
 		
		String s5 = "java";
		System.out.println(s4.contains(s5));// false cunku buyuk harf kucuk harfe bakar
		
		System.out.println(s4.contains(s2));//true
		System.out.println("========================================");
		
		System.out.println(s4.contains(s1));//true
//		System.out.println(s4.contains(null));//NullPointerException hatasi verir
		
		
		//7. method : charAt() ==> Spesifik bir karaktere bakmak icin kullanilir ve char (karakter)  dondurur
		
		String s6 = "Java kolaydir!";
		
		System.out.println(s6.charAt(2));//v =>> indexler sifirdan baslar
		
//		System.out.println(s6.charAt(14));//StringIndexOutOfBoundsException 
		
		System.out.println(s6.charAt(13));
		
		/*
		 * kullanicidan bir String girmesini isteyin 
		 * Her zaman girilen String'in son karakterini yazdirin
		 */
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Bir String giriniz?");
//		String s7 = scan.nextLine();
//		
	//	System.out.println(s7.length());
		
//		 System.out.println(s7.charAt(s7.length()-1));
		
	// 8. method : indexOf()==> spesific bir karakter dondurur 
		
		String s8 = "Java ahh Java!...";
		System.out.println("==========================================");
		System.out.println(s8.indexOf("J"));//0 // indexOf()==> eslesen ilk karakterin indeksini verir
		System.out.println(s8.indexOf('J'));// 0 ==> tek ve cift tirnak isareti kulanilabilir
		
		System.out.println(s8.indexOf("x"));// -1==> var olmayan karakterler icin -1 sonuc dondurur
		
		System.out.println(s8.indexOf(""));//0
		System.out.println(s8.indexOf(" "));// 4
		System.out.println(s8.indexOf(' '));// 4
		
		System.out.println(s8.indexOf("ahh"));// 5 ==> eger aradigim coklu karakter ise indexOf() ilk karakterin indexini dondurur
		
		System.out.println(s8.indexOf("ahha"));// -1 
		
		System.out.println(s8.indexOf("J", 1));//9
		
		System.out.println(s8.indexOf("a", 1));//5 ==> java ilk 4 indexi atlayacak daha sonra ilk gelen "a"yi bulacaktir
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
