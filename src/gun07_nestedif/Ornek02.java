package gun07_nestedif;

import java.util.Scanner;

public class Ornek02 {
	/*
	 kullanicidan 4 basamakli bir tamsayi (int) alin ve sayinin ilk ve son rakaminin toplamini yazdirin
	 orn; eger kullanici bize 1234 => 1+4= 5
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 4 basamakli bir sayi giriniz");
		int dortBasamakli = scan.nextInt();
		
		dortBasamakli = Math.abs(dortBasamakli);
		
		if(dortBasamakli>999 && dortBasamakli<10000) {
			int ilkRakam = dortBasamakli / 1000;
			int  sonRakam = dortBasamakli % 10;
			System.out.println(ilkRakam);
			System.out.println(sonRakam);
			
			System.out.println("ilk ve son rakam toplami :" + (ilkRakam+sonRakam));
		}else {
			System.out.println("Ben size 4 basamakli bir sayi girin dedim");
		}

		scan.close();
	}

}
