package gun23_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lists01 {
	/*
	 * ArrayList'lerin boyutlari esnektir, degistirilebilir
	 * ArrayList'ler sadece non-primitiveleri (wrapper class, string gibi) depolayabilir
	 * ArrayList'ler birden fazla data type ni depolayamaz, sadece bir data type'ni depolayabilir
	 */

	public static void main(String[] args) {

		// Bir ArrayList nasil olusturulur
		
		//1.yol
		ArrayList<String> list1 = new ArrayList<String>();
		//2.yol
		ArrayList<String> list2 = new ArrayList<>();
		//3.yol
		List<String> list3 = new ArrayList<String>();
		//4.yol
		List<String> list4 = new ArrayList<>();
		
		
		//ArrayList'e element nasil eklenir
		
		list1.add("Ali");
		list1.add("Ayse");
		list1.add("Merve");
		list1.add("Zeynep");
		
		// ArrayList'in elementleri nasil yazdirilir
		
		System.out.println((list1));
		
		
		// Bir element belli bir indexe nasil eklenir
		list1.add(2, "Mustafa");
		System.out.println((list1));
		
		list1.add(3, "Ahmet");
		
		System.out.println((list1));
		
		// ArrayList'in elementleri kucukten buyuye (a-z veya 0-9) nasil siralanir
		
		Collections.sort(list1);
		
		System.out.println(("Sort ettikten sonra kucuktan buyuge siralama: " +list1));
		
		// ArrayList'in elementleri buyukten kucuge dogru (z-a veya 9-0) nasil siralanir
		Collections.sort(list1, Collections.reverseOrder());
		
		System.out.println(("reverseOrder ettikten sonra buyukten kucuge dogru siralama: " +list1));
		
		
		// ArrayList'in spesifik bir elementi nasil yazdirilir
		
		System.out.println(list1.get(2));
		System.out.println(list1.get(4));
		
		// Eger girdigimiz index List'ede bulunmuyorsa, IndexOutOfBoundsException hatasi alinir
		
//		System.out.println(list1.get(8));
		
		//ArrayList icindeki elementlerin sayisi nasil bulunur
		
		System.out.println(list1.size());
		
		/*
		 List adinda bir List olusturun, ve 17, 23,11,17,3,5,8,-5, -15 degerlerini List e ekleyin
		 Bunu yaptiktan sonra List icindeki en buyuk ve en kucuk elementi bulun
		
		 */
		
		List<Integer> list = new ArrayList<>();
		list.add(17);
		list.add(23);
		list.add(111);
		list.add(17);
		list.add(3);
		list.add(5);
		list.add(8);
		list.add(-35);
		list.add(-15);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println("en kucuk deger: "+ list.get(0));
		
		System.out.println("en buyuk deger: "+ list.get(list.size()-1));
	}

}
