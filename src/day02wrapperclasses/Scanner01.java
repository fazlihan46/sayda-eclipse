package day02wrapperclasses;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
	//Kullanici iki tam sayi versin
		//program bu tamsayilarin toplamini ve carpimini ekrana yazdirsin.
		Scanner scan = new Scanner(System.in);// Scanner Classini import ettik
	System.out.println("iki tam sayi giriniz.");
	
	int sayi1=scan.nextInt();
	int sayi2=scan.nextInt();
	System.out.println(sayi1 + sayi2);
	System.out.println(sayi1*sayi2);
	
	
		
		
	}
 
}
