package gun19_staticAnahtarKavrami;

public class Ogrenciler {
	String isim;
	int sinif;
	int kayitYili;
	static String okulNo;
	static int counter =1000;
	
	public void OkulNoOlusturma () {
		counter++;
		okulNo = "" + kayitYili + sinif + counter;
		
	}

	public Ogrenciler(String isim, int sinif, int kayitYili) {
		this.isim = isim;
		this.sinif = sinif;
		this.kayitYili = kayitYili;
		OkulNoOlusturma();
		
	}


}
