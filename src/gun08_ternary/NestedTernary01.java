package gun08_ternary;

import java.util.Scanner;

public class NestedTernary01 {
	/*
 	Kullanicidan bir yil alin ve bu yilin artik yil olup olmadigini soyleyin
	eger girilen yil 100 ile bolunuyorsa, mutlaka 400 ile bolunmesi lazim, o yil artik yildir
	eger girilen yil 100 ile bolunmuyorsa, mutlaka 4 ile bolunmesi lazim, o yil artik yildir
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" lutfen bir yil giriniz");
		int yil = scan.nextInt();
		
//	String sonuc = yil%100==0 ? (yil%400==0 ? "artik yil" :"artik yil degil"): (yil%4==0 ? "artik yil" : "artik yil degil");
	
	String sonuc = yil%100==0 ? yil%400==0 ? "artik yil" :"artik yil degil": yil%4==0 ? "artik yil" : "artik yil degil";		
	
	System.out.println(sonuc);
					}

}
