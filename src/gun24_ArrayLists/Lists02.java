package gun24_ArrayLists;

import java.util.*;

public class Lists02 {

	public static void main(String[] args) {
		// Elementlerden sonra '*' isaretini ekleyen bir method yaziniz
		
		List<String> str = new ArrayList<>();
		
		str.add("aa");
		str.add("bab");
		str.add("ac");
		str.add("ad");
		str.add("a/c");
		str.add("a>d");
		
		
		elementlereYildizEkleme(str);
		
		//Her elementi kendisiyle carpan bir method yaziniz
		
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(5);
		list.add(7);
		list.add(6);
		list.add(9);
		
		 System.out.println(list);//[2, 5, 7, 6, 9]
		 
		 elementiKendisiyleCarpma(list);
		


	}

	public static void elementiKendisiyleCarpma(List<Integer> list) {
		for (int i=0; i<list.size();i++) {
			list.set(i, list.get(i)*list.get(i));

		}
		System.out.println(list);
	}

	public static void elementlereYildizEkleme(List<String> str) {
		
		for(int i =0; i<str.size(); i++) {
			str.set(i, str.get(i)+"*");
		}
		System.out.println(str);
		
		
	}
	
	
	
	
	
	

}
