package gun09;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		//  Kullanicidan bir ay ismi alalim 
		// bu ay ocak, subat, mart ise ilk ceyrek
		// eger nisan, mayis ve haziran dan birisi ise 2. ceyrek
		// eger temmuz, agustos, ve eylul den biri ise 3. ceyrek
		// eger ekim, kasim ve aralik ayindan biri ise 4. ceyrek olarak yazdiralim
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yilin bir ayinin ismini giriniz");
		 String ay = scan.next().toLowerCase();
		 
		 switch (ay) {
		 	case "ocak" :
		 	case "subat":
		 	case "mart":
		 		System.out.println("ilk ceyrektedir");
		 		break;
		 	case "nisan" :
		 	case "mayis":
		 	case "haziran":
		 		System.out.println("ikinci ceyrektedir");
		 		break;
		 	case "temmuz" :
		 	case "agustos":
		 	case "eylul":
		 		System.out.println("ucuncu ceyrektedir");
		 		break;
		 	case "ekim" :
		 	case "kasim":
		 	case "aralik":
		 		System.out.println("dorduncu ceyrektedir");
		 		break;
		 	default:
		 		System.err.println(" bir ayi ismi girmediniz, lutfen bir ay ismi giriniz");
		 }
		

	}

}
