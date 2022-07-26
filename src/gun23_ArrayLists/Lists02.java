package gun23_ArrayLists;

import java.util.ArrayList;

public class Lists02 {

	public static void main(String[] args) {
		
		// ArrayList'e bir element nasil guncellenir yada silinebilir
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Ali");
		list1.add("Veli");
		list1.add("Bahar");
		list1.add("Kaan");
		list1.add("Leyla");
		list1.add("Onur");
		 
		System.out.println(list1);// [Ali, Veli, Bahar, Kaan, Leyla, Onur]
		
		// remove() bir elemani listen tamamen silmek icin kullanilir.
		
		 list1.remove(2);
		 System.out.println(list1);//[Ali, Veli, Kaan, Leyla, Onur]
		 
		 
		 list1.remove(list1.indexOf("Leyla"));
		 
		 System.out.println(list1);
		 
		 // set() = elementi siler ve yerine yenisini ekler => set() bir elementin degerini gunceller
		 
		 list1.set(list1.indexOf("Veli"), "Mustafa");
		 
		 System.out.println(list1);
		 
		 list1.set(1, "Hulya");
		 
		 System.out.println(list1);
		 
		 
		 
		 
		
		
		

	}

}
