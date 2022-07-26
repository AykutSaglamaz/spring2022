package gun25_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class PassByValue {

	public static void main(String[] args) {
		/*
		 Eger bir method icindeki bir degiskeni (local) kullanmak isterseniz, Java method icindeki original degiskeni kullanmaz
		 Java originalin bir kopyasini olusturur ve kopyayi kullanir dolayisiyla bizim local degiskenimiz guncellenmez
		 Java bu ozellige "Pass by Value" denir
		 
		 Eger degiskenin original degerini guncelemek istiyorsak, deger atama islemi yapilmali
		 
		 x = artirma(x);
		 
		 */
		
		int x = 10;
		
		System.out.println("Method call once:" + x);//10
		
		x = artirma(x);
		
		System.out.println("Method call sonra:" + x);//10
		
		/*
		 Primitive data type leri icin method call degiskenin original degeri degismez
		 Eger original degeri degistirmek istiyorsak, deger atamasi yapmamiz lazim
		 orn: a = toplam(a) gibi
		 */
		
		String str = "Ali okula git";
		
		System.out.println("Method call once:" + str);
		
		str = sonaUnlemEkle(str);
		
		System.out.println("Method call sonra:" + str);

		/*
		 Immutable objeler icin method call, primitiveler original degeri degistirmez 
		 Eger original degeri degistirmek istiyorsak, deger atamasi yapmamiz lazim
		 orn ; str = sonaUnlemEkle(str); gibi
		 */
		
		List <String> lt = new ArrayList<>();
		
		lt.add("Ali");
		lt.add("Veli");
		lt.add("Can");
		System.out.println(lt);// [Ali, Veli, Can]
		
		//List bir methdu kullandiginizda, original list guncellenir
		//Eger original list i kodlarimin icinde muhafaza etmek istiyorsam, ==> List.copyOf()
		
		List <String> lt1 = List.copyOf(lt);
		
		System.out.println("Method call once:" + lt);
		
		SonaHarfEkle(lt);
		
		 System.out.println("Method call sonra:" + lt);
		 /*
		  Mutable (boyutlari guncellenen) objeler, java referansi (adresi) kopyalar sonra methodun icerisinde bu kopyayi kullanir
		  Referansin kendisi  ve kopyasi da ayni objeyi isaret ederm, bu nedenle mutable objecler icin method call yaptiginizda, 
		  original deger de guncellenir
		  */
		
		 System.out.println(lt1);
	}

	public static List <String> SonaHarfEkle(List<String> lt) {
		
		for(int w = 0; w<lt.size(); w++) {
			lt.set(w, lt.get(w)+"?");
		}
		 return lt;
		
	}

	public static String sonaUnlemEkle(String str) {
		return str + "!";
		
		
	}

	public static int artirma(int x) {
		return x*3;
		
	}

}
