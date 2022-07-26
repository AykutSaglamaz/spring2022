package gun20_Arrays;

import java.util.Arrays;

public class Arrays01 {

	/*
	 1) Arrays ayni container icinde cok sayida data depolamamiz icin vardir.
	 2) Arrays de butun elementler MUTLAKA ayni data type de olmalidir
	 3) Arrays sadece "primitive" ve 'non-primitive' datalarin referenslarini data type lerini kabul eder.
	 	 
	 4) Arrays lerin data type 'non-primitive' dir
	 */
	public static void main(String[] args) {
		
		// Array nasil olusturulur

		int arr[] = new int[3];// [0, 0, 0]
		
		System.out.println(Arrays.toString(arr));
		
		//Array a element nasil atanir
		arr[0]=11;
		
		System.out.println(Arrays.toString(arr));//[11, 0, 0]
		
		arr[1]=15;
		System.out.println(Arrays.toString(arr));//[11, 15, 0]
		
		arr[2]=18;
		System.out.println(Arrays.toString(arr));//[11, 15, 18]
		
		
		//Herhangi bir index deki degeri nasil console yazdiririz
		System.out.println(arr[2]);//18
		
		//var olmayan bir indexi bulmak istedinigimiz de ne olur
//		System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
		
		
		// Bir Arrayin element sayisini nasil buluruz
		//String lerde boyutu bulmak icin 'length()', fakat Arraylerde buyutu bulmak icin sadece 'length' kullaniriz
		System.out.println(arr.length);//3
		

	}
	
	

}
