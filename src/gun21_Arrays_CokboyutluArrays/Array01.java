package gun21_Arrays_CokboyutluArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		// Kullanicidan bir deger alarak bir integer Array olusturun 
		// Arrayin elemanlarindan en kucuk ve en buyugunu console yazdiran bir java kod yaziniz
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Array olusturmak icin lutfen bir sayi girin");
		
		int sayi = scan.nextInt();
		
		int s[] = new int[sayi];
		
		int elementSayisi =1;
		
		do {
			System.out.println(elementSayisi+". elementi giriniz");
			s[elementSayisi-1] = scan.nextInt();
			elementSayisi++;
			
		}while(elementSayisi<=sayi);
		
		System.out.println(Arrays.toString(s));
		
		//Eger baslagictaki Arrayi sort ettikten sonra kullanmak istiyorsak  Arrays.copyOf()
		
		int d []= Arrays.copyOf(s, sayi);
		
		// Array deki en buyuk ve en kucuk elemente ulasmak icin Arrays.sort() kullanilir.
		
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		
		
		System.out.println("en kucuk element: "+ s[0]);
		
		System.out.println("en buyuk element: "+ s[s.length-1]);
		
		
		System.out.println(Arrays.toString(d));

	}

}
