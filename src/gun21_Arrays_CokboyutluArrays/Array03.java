package gun21_Arrays_CokboyutluArrays;

import java.util.Arrays;

public class Array03 {

	public static void main(String[] args) {
		// Bir Array icinde herhangi bir karakterin kullanilip kulanilmadigini ogrenebiliriz
		// ilk once Arrays.sort() kullaniyoruz
		// sonra binarySearch() kullaniyoruz
		
		char crr[] = {'c', 'A', 'k', 'm'};
		
		//1. basamak : sort() kullan
		
		 Arrays.sort(crr);//[ 'A', 'c', 'k', 'm']
		 
		 // 2.basamak => binarySearch() kullaniyoruz
		 
		 //eger element Array icinde var ise, binarySearch bize o elementin indexi dondurur.
		 System.out.println(Arrays.binarySearch(crr, 'k'));//2
		 
		 System.out.println(Arrays.binarySearch(crr, 'm'));//3
		 
		 System.out.println(Arrays.binarySearch(crr, 'x'));//-5
		 
		 System.out.println(Arrays.binarySearch(crr, 'B'));//-2
		 

	}

}
