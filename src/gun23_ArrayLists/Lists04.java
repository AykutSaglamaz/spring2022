package gun23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class Lists04 {

	public static void main(String[] args) {
		/*
		 * Bir Integer ArrayList olusturun, bu sayilari ekleyin: 3, 45, 12, 3, 6, 45, 7, 8
		 * Bu List'e tekrarlanmis elementleri List'en silin, sadece tekrarlanmamis elementlere sahip List'i yazdirin
		 */

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(3);
		list1.add(45);
		list1.add(12);
		list1.add(3);
		list1.add(6);
		list1.add(45);
		list1.add(7);
		list1.add(8);
		
		System.out.println("Tekrarlanmis elementler silinmeden onceki List: "+ list1);//[3, 45, 12, 3, 6, 45, 7, 8]
		
		List<Integer> list2 = new ArrayList<>();
		
		for(int i =0; i<list1.size(); i++) {
			
			
			if(!list2.contains(list1.get(i))) {
				
				
				list2.add(list1.get(i));
				
			}else {
				continue;
				
			}
		}
		
		System.out.println("Tekrarlanmamis elementler tekrarlar silindikten sonra: "+list2);
		
	}

}
