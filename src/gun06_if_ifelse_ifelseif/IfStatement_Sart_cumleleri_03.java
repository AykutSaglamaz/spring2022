package gun06_if_ifelse_ifelseif;

import java.util.Scanner;

public class IfStatement_Sart_cumleleri_03 {

	public static void main(String[] args) {
		//kullanicidan bir gun ismi al, bu gunun haftaici mi yoksa haftasonu gunu
		// oldugunu yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir gun giriniz");
		String gun = scan.next();
		
		/*
		1) "==" ==> a) deger (value) b) adres (references)
		 String a = "ALi";
		 String b = "Ali";
		  a==b; false
		2) equals() ==> sadece degere bakar adrese bakmaz 
		  a.equals(b); true
	 	3) equalsIgnoreCase() ==> sadece degere bakaar kucuk-buyuk harfe bakmaz
	 		a.equalsIgnoreCase(b) => true
		 */
		
		if(gun.equalsIgnoreCase("pazar") || gun.equalsIgnoreCase("cumartesi")) {
			System.out.println(gun+" haftasonudur");
				
		}else {
			System.out.println(gun+ " haftaici bir gundur");
		}

	}

}
