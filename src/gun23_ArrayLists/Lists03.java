package gun23_ArrayLists;

//import java.util.ArrayList;
//import java.util.List;
import java.util.*;

public class Lists03 {

	public static void main(String[] args) {


		List <Character> list1= new ArrayList<>();
		
		list1.add('A');
		list1.add('E');
		list1.add('A');
		list1.add('K');
		list1.add('K');
		list1.add('B');
		System.out.println(list1);//[A, E, A, K, K, B]
		
		//Bir ArrayList veya List icerisinde spesifik bir elementin var olup olmadigini kontrol etmek istiyorum
		
		System.out.println(list1.contains('E'));//true, boolean dundurur- eger aradigimiz element listin icinde var ise
		System.out.println(list1.contains('S'));// false, boolean dundurur- eger aradigimiz element listin icinde yok ise
		
		List<Character> list2 = new ArrayList<>();
		
		list2.add('A');
		list2.add('E');
		list2.add('A');
		list2.add('K');
		list2.add('K');
		list2.add('B');
		// iki List'in esit olup olmadigini nasil check ederiz
		
		 System.out.println(list1.equals(list2));//true => equals() sadece degere bakar
		 
		 System.out.println(list1==list2);//false => (==) hem referanslara hem de degerlere bakar
		 
		 
		/*
		 Kullanicidan bir harf girmesini isteyin, eger harf list2 var ise onu "$" isaretine cevirin
		 Aksi durumda kullanicinin girdigi harfi (element) list2'ye element olarak ekleyin
		 */
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Bir harf giriniz");
		 
//		 String str = scan.next().toUpperCase().substring(0, 1);
//		 char c = str.charAt(0);
		 
		 char c = scan.next().toUpperCase().charAt(0);
		 
		 if(list2.contains(c)) {
			 list2.set(list2.indexOf(c), '$');
			 
		 }else {
			 list2.add(c);
		 }
		
		 System.out.println(list2);
		 
		 scan.close();
		 
	}

}
