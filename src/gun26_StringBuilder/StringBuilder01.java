package gun26_StringBuilder;

public class StringBuilder01 {

	public static void main(String[] args) {
		//String'ler immutable(guncellenemez) bu nedenle Java bizim icim bu sorunu asmak icin StringBuilder olusturmustur.
		
		
		
		String str = "Java";
		str.substring(2);
		str.toUpperCase();
		
		System.out.println(str.toUpperCase());//JAVA
		System.out.println(str);//Java
		
		
		//StringBuilder olusturmak icin 3 yol vardir
		//1. yol 
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println(sb.capacity());//16
		
		//StringBuilder'e bir sey veya karakter ekleme
		sb.append("Ali");
		sb.append(" Kolaydir.");
		sb.append("dogrudur");
		
		System.out.println(sb);// Ali Kolaydir.dogrudur
		
		System.out.println("====================");
		//2. yol 
		
		StringBuilder sb1 = new StringBuilder("Veli");
		
		System.out.println(sb1.length());
		
		sb1.append(" caliskandir");
		
		System.out.println(sb1);//Veli caliskandir
		
		//StringBuilder capacity'e bakimindan esniktir, guncellenbilir
		
		System.out.println(sb1.capacity());//20
		
		
		StringBuilder sb2 = new StringBuilder("Kemal");
		
		System.out.println(sb2.capacity());//21  --> default + kullanilan karakter sayisi ("Kemal")
		
		sb2.append(" ve Cemil kendilerine tester olarak is buldular");
		
		System.out.println(sb2);//Kemal ve Cemil kendilerine tester olarak is buldular
		System.out.println(sb2.capacity());//52
		System.out.println(sb2.length());
		
		
		//3. yol
		
		StringBuilder sb3 = new StringBuilder(5);
		System.out.println(sb3.capacity());//5
		
		sb3.append("Zeynep");
		
		System.out.println(sb3.capacity());//16
		
		//append () method zinciri olusturulabilir
		
		StringBuilder sb4 = new StringBuilder("Java");
		
		sb4.append("+").append("Selenium").append("+").append("SQL").append("= Yuksek maasli is");
		
		System.out.println(sb4);//Java+Selenium+SQL= Yuksek maasli is
		
		
		// spesifik indexler arasindaki karakterleri eklemek icin
		
//		sb4.append("+ guzel hayat", 0, 7);
//		
//		System.out.println(sb4);
//		
		
		sb4.append(sb4, 4, 13);
		
		System.out.println(sb4);
		
		
		//Herhangi bir index teki spesifik bir karaktere ulasmak icin
		StringBuilder sb5 = new StringBuilder("Ayse Caliskandir");
		
		System.out.println(sb5.charAt(5));//C
		
		
		//Spesifik indexler arasindaki karakterleri silmek icin delete() kullanilir
		
		System.out.println(sb5);//Ayse Caliskandir
		
//		sb5.delete(4, 16);
		
		System.out.println(sb5);
		
		sb5.deleteCharAt(9);
		
		System.out.println(sb5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
