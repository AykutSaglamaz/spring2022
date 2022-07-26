package gun01_04;

import java.util.Scanner;

public class gun04_2 {

	public static void main(String[] args) {
		
//		//1-Scanner object olustur
//		Scanner scan = new Scanner(System.in);
//		
//		//2-kullaniciya bir mesaj gonder
//		System.out.println("Hey str, isminiz nedir");
//		
//		System.out.println("Hey str1, isminiz nedir");
//		
//		//3-kullanicidan gelen veri icin konteyner olustur
//		
////		String str =scan.next();// Ali Can 
//		String str1 = scan.nextLine(); // Ali Can
//		
		//4.Aldigimiz degeri/mesaji yazdirmak
////		System.out.println(str);
//		System.out.println(str1);
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Emekli misin. true veya false");
		
		boolean emakliMi = scan.nextBoolean();
		 System.out.println(emakliMi);

		
		

	}

}
