package gun09;

import java.util.Scanner;

public class Switch01 {
	/*
	 * swithc(?)==> ? = String, char, byte, int, short yazilabilir
	 * boolean, long , float, ve double yazilmaz
	 */

	public static void main(String[] args) {
		
	// Kullanicinin girmis oldugu ayin kacinci ay oldugunu kullaniciya soyleyelim
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yilin bir ayinin ismini giriniz");
		 String ay = scan.next().toLowerCase();
		 
		 
		 switch(ay) {
		 
		 	case "ocak":
		 		System.out.println("yilin 1.ayidir");
		 		break;
		 	case "subat":
		 		System.out.println("yilin 2.ayidir");
		 		break;
		 	case "mart":
		 		System.out.println("yilin 3.ayidir");
		 		break;
		 	case "nisan":
		 		System.out.println("yilin 4.ayidir");
		 		break;
			case "mayis":
		 		System.out.println("yilin 5.ayidir");
		 		break;
		 	case "haziran":
		 		System.out.println("yilin 6.ayidir");
		 		break;
		 	case "temmuz":
		 		System.out.println("yilin 7.ayidir");
		 		break;
		 	case "agustos":
		 		System.out.println("yilin 8.ayidir");
		 		break;
			case "eylul":
		 		System.out.println("yilin 9.ayidir");
		 		break;
		 	case "ekim":
		 		System.out.println("yilin 10.ayidir");
		 		break;
		 	case "kasin":
		 		System.out.println("yilin 11.ayidir");
		 		break;
		 	case "aralik":
		 		System.out.println("yilin 12.ayidir");
		 		break;
		 	default:
		 		System.err.println(" bir ayi ismi girmediniz, lutfen bir ay ismi giriniz");
		 }
		
		

	}

}
