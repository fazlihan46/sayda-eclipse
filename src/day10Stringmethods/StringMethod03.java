package day10Stringmethods;

import java.util.Scanner;

public class StringMethod03 {

	public static void main(String[] args) {
	
//charAt() methodu, belli index deki characteri return eder.
		
		String str1="cimbombom";//str1 in 4.indexindeki karakteri bulan kodu yazin.
		System.out.println(str1.charAt(4));//indexi 4 olan karakter o harfidir.ekrana o yazdirir
		System.out.println(str1.charAt(0));//index 0 ilk harf demektir bu yuzden c return eder
		
		
		System.out.println(str1.charAt(6));//olmayan bir index ile islem yapmaya calisirsaniz 
		//konsolda exception alirsiniz.Buda buyuk bir hata yaptiniz demektir.
		
//length() methodu Stringin icinde kac character oldugunu verir	.	
	System.out.println(str1.length());//9 yazdirir.index saymaya 0 dan baslar.
//fakat lenght() saymaya 1 den baslar.
		
	//index her zaman buyuk olur.
	
//Son indexi 9 olan bir String in length i kactir?
//9+1=10lur.lenght=son index+1	
	
	

	//Kullanicidan ismini girmesini isteyin .
	//isminin son harfini ekrana yazdirin.
	
Scanner scan=new Scanner(System.in);
System.out.println("Lutfen isminizi giriniz.");
	
String isim=scan.nextLine();

int length=isim.length();
	
System.out.println(isim.charAt(length-1));

	scan.close();
	
	
	
	
	
	
	
	
	
	
		
	}

}
