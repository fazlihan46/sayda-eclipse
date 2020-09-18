package day14dowhileloop;

import java.util.Scanner;

public class DoWhile05 {

	public static void main(String[] args) {
//Kullanicidan ismini alin.
		//Ilk Harf buyuk harf ise "Dogru Giris Yaptiniz".
		//Ilk hsrf kucuk ise "Ilk harfi buyuk harf giriniz." yazsin
		
		Scanner scan=new Scanner (System.in);
		String isim="";
		
	do {
		System.out.println("Lutfen ilkisminizi giriniz");
		 isim=scan.nextLine();
		 
	if(isim.charAt(0)>='A'&& isim.charAt(0)<='Z') {
		System.out.println("Dogru Giris yaptiniz");
	}else {
		System.out.println("Ilk harfi buyuk harf olarak giriniz");
		}
	}while(!(isim.charAt(0)>='A'&& isim.charAt(0)<='Z'));
	 	 
		
		
	}

}
