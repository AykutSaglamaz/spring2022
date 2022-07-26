package gun24_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists03 {

	public static void main(String[] args) {
		
		Character arr []= new Character[4];
		arr[0]= 'a';
		arr[1]= 'b';
		arr[2]= 'c';
		arr[3]= 'd';
		 System.out.println(Arrays.toString(arr));//[a, b, c, d]
		 
		 List <Character> list = new ArrayList<>();
		 
		 // Bir Array bir List'e nasil cevrilir
		 //1. yol : loop kullanarak
		 
		 for(int i =0; i<arr.length; i++) {
			 list.add(arr[i]); 
		 }
		System.out.println(list);//[a, b, c, d]
		
		//2.yol Arrays.asList(), methodu kullanilarak bir Array List'e cevrilebilir
		// fakat Arrays.asList() methodu data type olarak sadece "non-primitive" kabul eder
		// 'int' degil 'Integer', yada 'char' degil 'Character' kullanmamiz lazim
		
		 List <Character> list1 = Arrays.asList(arr);
		 
		 System.out.println(list1);//[a, b, c, d]
		 
		 Integer s[]= {2, 41, 3, 6};
		 
		 List <Integer> list2 = Arrays.asList(s);
		 System.out.println(list2);//[2, 41, 3, 6]
		 
		 String str[] = {"Ali", "Veli", "Cemil"};
		 
		 List<String> list3 = Arrays.asList(str);
		 
		 System.out.println(list3);//[Ali, Veli, Cemil]
		 /*
		  Bir List'i Array cevirdigimiz durumlarda yani Arrays.asList() kullandigimizda, List'imiz Array'in ozelliklerini beraberinde tasir, 
		  Array'ler boyutlarinda sabit olduklari icin (boyutlari degistirilemez) biz List'e eleman eklemek istedigimiz de 
		  "UnsupportedOperationException" hatasi aliriz,
		  Dolayisiyla Array'den olusturdugumuz List'lerde boyutu yada uzunlu etkileyen methodlar kullanilamaz
		  */
		 
//		 list3.add("Zeynep");//UnsupportedOperationException
		 
//		 list2.remove(1);//UnsupportedOperationException
		 
//		 list2.clear();////UnsupportedOperationException
		 
		 list3.set(1, "Mustafa");
		 
		 System.out.println(list3);//[Ali, Mustafa, Cemil]
		 
		 
		 //List'i Array'e nasil ceviririz
		 
		 List<Integer> list4 = new ArrayList<>();
		 
		 list4.add(12);
		 list4.add(1);
		 list4.add(6);
		 list4.add(32);
		 
		 System.out.println(list4);//[12, 1, 6, 32]
		 
		 
		 Integer arr2[]= list4.toArray(new Integer[0]);
		 System.out.println(Arrays.toString(arr2));//[12, 1, 6, 32]
		 

	}

}
