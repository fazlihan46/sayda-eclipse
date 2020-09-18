package day02wrapperclasses;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		/*Kullanici Karenin bir kenar uzunlugunu girsin.
		//Biz karenin cevresini ve alanini ekrana yazdiralim
		//Karenin cevresi dort kenarinin toplamidir.
		Alani a*a dir.*/
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen karenin bir kenar uzunlugunu giriniz");
		int kenarUzunlugu= scan.nextInt();
		
		System.out.println(kenarUzunlugu+kenarUzunlugu+kenarUzunlugu+kenarUzunlugu);//40
		System.out.println(kenarUzunlugu*kenarUzunlugu);//100
		
		
		
		
		
		

	}

}
