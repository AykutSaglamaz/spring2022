package gun01_04;

import java.util.Scanner;

public class gun04_6 {

	public static void main(String[] args) {
		/*
		   kullanicidan bir prizm tabani, yuksekligi ve genisligini alin ve 
		   prizmin hacmini bulalim =>taban*yukseklik*genislik
		*/ 
		 Scanner prizm = new Scanner(System.in);
		 
		 System.out.println("Lutfen prizmin tabani, yukseklini ve genisligini giriniz");
		  
		 double t = prizm.nextDouble();
		 int y = prizm.nextInt();
		 short g = prizm.nextShort();
		 
		 System.out.println("Hacim :" +t*y*g);
		 
		

	}

}
