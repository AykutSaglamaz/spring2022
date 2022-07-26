package gun25_ForEachLoop;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Date01 {

	public static void main(String[] args) {
		/*
		 Date () kullanarak
		 1-Kodlarin ne kadar surede sonuclandigini gorebiliriz
		 2- Screenshot yada video kaydi alip raporlara ekleyebilirsiniz
		 */
		
	//Date object i nasil olusturulur
		
//		LocalDate guncelTarih = new LocalDate();
		
		LocalDate guncelTarih = LocalDate.now();
		
		System.out.println(guncelTarih);//2022-06-18
		
		System.out.println(guncelTarih.plusDays(5)); //2022-06-23 ==> gun guncellemek icin
//		guncelTarih = guncelTarih.plusDays(5);
		
		System.out.println(guncelTarih.plusMonths(2));//2022-08-18 ==> ay guncellemek icin
		
		System.out.println(guncelTarih.plusYears(5)); //2027-06-18 ==> yilli guncellemek icin
		
		
		System.out.println(guncelTarih.plusDays(-5));//2022-06-13
		
		System.out.println(guncelTarih.minusDays(5)); //2022-06-13
		
		// yarin tarihi icin
		
		LocalDate yarin = guncelTarih.plusDays(1);
		
		System.out.println("yarin: "+ yarin); //yarin: 2022-06-19
		
		//Dunun tarihi 
		LocalDate dun = guncelTarih.minusDays(1);
		LocalDate dun1 = guncelTarih.plusDays(-1);
		
		System.out.println("dunun tarihi " + dun);//dunun tarihi 2022-06-17
		System.out.println(dun1);
		
		
		//2 yil 3 ay 15 gun sonrasini yazdiralim
		System.out.println(guncelTarih.plusYears(2).plusMonths(3).plusDays(15));
		
		
		System.out.println(guncelTarih.plusDays(20).plusYears(5).plusMonths(3));
		
		// 5 ay 18 gun once
		System.out.println(guncelTarih.minusMonths(5).minusDays(18));
		
		// Sadece gun veya ay veya yil degeri almak icin
		
		System.out.println(guncelTarih.getDayOfMonth());//18
		
		System.out.println(guncelTarih.getDayOfYear());//169
		
		System.out.println(guncelTarih.getDayOfWeek()); //SATURDAY
		
		
		System.out.println(guncelTarih.getMonth());//JUNE
		System.out.println(guncelTarih.getMonthValue()); //6 
		
		System.out.println(guncelTarih.getYear());//2022
		
		//Spesifik bir tarihi olusturmak icin 
		
		LocalDate spesifikTarih = LocalDate.of(1982, 1, 24);//1982-01-24
		
		System.out.println(spesifikTarih);
		
		System.out.println(spesifikTarih.getDayOfMonth()); //24
		
		// iki tarihi kiyaslamak icin 
		
		System.out.println(spesifikTarih.isAfter(guncelTarih));//false
		
		System.out.println(guncelTarih.isBefore(spesifikTarih));//false
		
		System.out.println(guncelTarih.isAfter(spesifikTarih));//true
		
		// yil + gun + ay  ===> yyyy-MM-dd => default format
		// M=> months, m => minutes
		
		//MM => ay sayisi (0-)
		//MMM => ay in isminin ilk karakteri => Haziran --> Haz
		//MMMM => Ay in butun alir --> Haziran
		
		LocalDate guncelDate = LocalDate.now();
		
		System.out.println(guncelDate);//2022-06-18
		
		
		DateTimeFormatter tarihFormatlama = DateTimeFormatter.ofPattern("dd/MMM/yyyy");//18/Jun/2022
		System.out.println(tarihFormatlama.format(guncelDate));
		
		DateTimeFormatter tarihFormatlama1 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");//18/June/2022
		System.out.println(tarihFormatlama1.format(guncelDate));
		
		
		DateTimeFormatter tarihFormatlama2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");//18/06/2022
		System.out.println(tarihFormatlama2.format(guncelDate));
		
		
		DateTimeFormatter tarihFormatlama3 = DateTimeFormatter.ofPattern("dd/M/yyyy");//18/6/2022
		System.out.println(tarihFormatlama3.format(guncelDate));
		
		DateTimeFormatter tarihFormatlama4 = DateTimeFormatter.ofPattern("dd/MMMM/yy");//18/June/22
		System.out.println(tarihFormatlama4.format(guncelDate));
		
		System.out.println(tarihFormatlama4.format(guncelDate.plusMonths(3)));//18/September/22
		
		
		LocalTime guncelSaat = LocalTime.now();
		
		System.out.println(guncelSaat);//15:52:28.620535500
		
		/*
		  hh => am - pm  format
		  HH => 24- saatlik format 
		 */
		
	
		DateTimeFormatter saatFormati = DateTimeFormatter.ofPattern("hh:mm");
		
		System.out.println(saatFormati.format(guncelSaat));//03:52
		
		
	DateTimeFormatter saatFormati1 = DateTimeFormatter.ofPattern("hh:mm a");
		
		System.out.println(saatFormati1.format(guncelSaat));//03:53 PM
		
		
	DateTimeFormatter saatFormati2 = DateTimeFormatter.ofPattern("HH:mm");
		
		System.out.println(saatFormati2.format(guncelSaat));//15:54
		
		
		// Iki tarih arasindaki farki bulmak icin 
		
		LocalDate t1 = LocalDate.now();
		
		LocalDate t2 = LocalDate.of(2010, 5, 29);
		
		Period fark = Period.between(t1, t2);
		
		System.out.println(fark);
		
		int yilFarki = Period.between(t1, t2).getYears();
		System.out.println(Math.abs(yilFarki));
		
		
		

	}

}
