package gun24_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		
		
		list1.add(3);
		list1.add(5);
		list1.add(7);
		list1.add(8);
		list1.add(4);
		list1.add(6);
		
		System.out.println(list1); //[3, 5, 7, 8, 4, 6]
		
		List<Integer> list2 = new ArrayList<>();
		
		list2.add(13);
		list2.add(25);
		list2.add(7);
		list2.add(18);
		list2.add(44);
		list2.add(36);
		
		// Bir List'i baska List'e ekleyelim
		//"addAll()" bir listi baska list'e ekleyebiliriz, 
		
		List<Integer> list3 = new ArrayList<>();
		list1.addAll(list2);
		
		System.out.println(list2.addAll(list3));//true
		
		System.out.println(list1);//[3, 5, 7, 8, 4, 6, 13, 25, 7, 18, 44, 36]
		
		
		List<Integer> list4 = new ArrayList<>();
		
		list4.add(12);
		list4.add(121);
		list4.add(125);
		
		System.out.println(list4);//[12, 121, 125] 
		
		//Belli bir index baska bir List eklemek istedigimiz de asagidaki methodu kullaniriz		
		list4.addAll(1, list2);
		
		System.out.println(list4);
		
		
		// Bir list'eki butun elementleri nasil sileriz => 'clear()'		
		
		list4.clear();
		System.out.println(list4);//[]
		

	}

}
