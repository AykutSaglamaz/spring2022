package gun06_if_ifelse_ifelseif;

import java.util.Scanner;

public class IfElseIfSatetment_Sart_Cumleleri_03 {

	public static void main(String[] args) {
		// bir okulda grading/notlandirma sistemi su sekildedir
		// 1. 50 altinda ise notu -D, 50-59 ise notu -C, 60-79 ise notu -B, 
		// 80-100 notu -A
		// kullaniciya rakam notunu soralim ve ona harf notunu soyleyelim
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen Notunuzu girin");	
		
		int not = scan.nextInt();
				
		if(not>79 && not<101 ) {
			System.out.println("A");
			
		}else if(not>59 && not<80) {
			System.out.println("B");
			
		}else if(not>49 && not<60) {
			System.out.println("C");
		
		}else if(not> 0 && not<50) {
			System.out.println("D");
		
		}else {
			System.err.println("luften negatif veya sifir girmeyiniz");
		}
		
		
	
		

	}

}
