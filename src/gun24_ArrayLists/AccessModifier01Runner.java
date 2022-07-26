package gun24_ArrayLists;

import gun27_Multithreadsyncencapsulation.AccessModifier_ErisimDuzenleyici01;

public class AccessModifier01Runner extends AccessModifier_ErisimDuzenleyici01 {

	public static void main(String[] args) {
		
		AccessModifier01Runner obj1 = new AccessModifier01Runner();
		
		/*
		1) Obj1 kullanarak "meslek" degiskenine erisemeyiz cunku "meslek" degiskeni, private access modifier kullanmakta 
			ve farkli bir siniftadir 
		2) obj1 kullanarak "universite" degiskenine erisemeyiz, cunku "universite" degiskeni default access modifier kullanmaktadir
			-default icin paket onemlidir. 
		3) Obj1 kullanarak "adress" degiskenine erisemeyiz cunku "adress" degiskeni access modifier olarak protected kulllanmaktadir
			eger cocuk (alt) sinif iliski olusturulmussa bu durumda protected olan degiskenlere erisim saglanabilir.
			 
		4) obj1 kullanarak "isim" degiskenine erisim saglanabilir cunku access modifier olarak public kullanilmistir. 
		 
		 */
		
	
		System.out.println(obj1.isim);
		System.out.println(obj1.adress);
		
	
	
	
		
		

	}

}
