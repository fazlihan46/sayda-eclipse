package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu01 {

	public static void main(String[] args) {
/*Kullanicidan yasadigi ulkenin ismini alin ve
   bu ulkenin bastan ikici harfi ile 
	sondan ikinci harfini buyuk harf olarak ekrana yazdirin.*/
		
Scanner scan=new Scanner(System.in);
System.out.println("Lutfen yasadiginiz ulkenin ismini giriniz.");
String ulke=scan.nextLine();
//Almanya==>length 7,y nin indexi 5


System.out.println(ulke.toUpperCase().charAt(1));        //2.harfin indexi 1 dir
System.out.println(ulke.toUpperCase().charAt(ulke.length()-2));
		
//Buyuk harfe cevirmek icin		
		
		
		
		
		
	}

}
