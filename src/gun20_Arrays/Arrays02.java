package gun20_Arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		
		String str[] = new String[5];
		
		System.out.println(Arrays.toString(str));//[null, null, null, null, null]
		
		
		str[0]= "Ali";
		str[1]= "Veli";
		str[2]= "Ayse";
		str[3]= "Zeynep";
		str[4]= "Fatma";
		
		System.out.println(Arrays.toString(str));//[Ali, Veli, Ayse, Zeynep, Fatma]
		
		
		//Herbir indexi console nasil yazdirabiliriz
		//1. yol. tavsiye edilmez
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);
		System.out.println(str[4]);
		System.out.println("========");
		
		//2. way: loops lari kullanin
		
		for(int i =0;i<str.length; i++ ) {
			System.out.println(str[i]);
			}
		
		//Uzunlugu 6 olan bir double Array olusturun
		//Elemenleri Array in icerisine ekleyen bir program kodlayin
		// Console bu elemenlerin toplamini yaziniz

	double d[] = new double[6];	
	d[0] =2.3;
	d[1] =2.4;
	d[2] =2.9;
	d[3] =2.6;
	d[4] =4.4;
	d[5] =3.8;
		
	System.out.println(Arrays.toString(d));
	
	double d1[]= {1.2, 1.9, 2.8, 3.5, 8.2, 5.4};

	double toplam =0;
	
	for(int i =0; i<d1.length;i++ ) {
		
		toplam = toplam +d1[i];
		}
	System.out.println("Arraydeki elementlerin toplami: "+ toplam);
	
	
	
		
	
		

	}

}
