package gun01_04;

public class gun02 {
	
	static String okulAdi ="Fatih";
	

	
	public static void main(String[] args) {
		 String okulNo ="1235";
		
//		System.out.println(okulAdi);
//		System.out.println(okulNo);

	
		 //Auto widening =>> otomatik genisleme
		byte yas = 33;
		short yeniYas= yas;
		
//		System.out.println(yas);
//		System.out.println(yeniYas);
		
		
		//Explicit Narrowing 
		double kar =1250.15;
		
		float yeniKar =(float) kar;
//		System.out.println(kar);
//		System.out.println(yeniKar);
//		
		
	int a = 5;
	double b =5;
	long c = 4;
	 float d =4.01234567f;
	 
//	 System.out.println(a/2);
//	 System.out.println(b/2);
//	 
	 
/*	 primitive   			non-primitive (Wrapper class)
 		byte 				Byte
 		short 				Short
 		int 				Integer 
 		long				Long
 		float				Float
 		double				Double
 		
 		
 		boolean 			Boolean
 		char				Character 
 
 * */
//	 
//	 int aa = 15;
//	 Integer bb = 16;
//	 
//	 System.out.println(bb.MAX_VALUE);
//	 System.out.println(bb.MIN_VALUE);
//	 
//	 System.out.println(bb.max(18, 29));
//	 System.out.println(bb.min(18, 29));
//	 System.out.println(bb.compare(25, 64));
//	 System.out.println(bb.compare(64, 25));
//	 System.out.println(bb.compare(64, 64));
//
//// iki short degeri alin ve bunlarin min ile max degerlerini console yazdirin
//	 
//	 Short x = 12;
	 Short y = 25;
//	 
//	 
//	 System.out.println(x.MAX_VALUE);//32767
//	 System.out.println(x.MIN_VALUE);//-32768
//	 
//	 System.out.println(x.SIZE);//16 bit yer kaplar hafizada 
//	 
//	 System.out.println(x.hashCode());
//	 System.out.println(x.equals(y));//false
//	 
	 
	 //Autoboxing
	 
	 int t = 26;
	 Integer r =t;
	 
	 System.out.println(t);
	 System.out.println(r);
	 
	 
	 //unboxing
	 
	 Short v =25;
	 short z = v;
	 
	 
	 
	 String sinif = "Java";
	 String str = "kolaydir";
	System.out.println(sinif);
	// concat() 
	String str2 = sinif.concat(str);
	
	System.out.println(str2);
	System.out.println(sinif+" "+ str+" Java");
	
	 
	 
	 
 
	 
	 
	 
	 
	
		
	}
	
}	

