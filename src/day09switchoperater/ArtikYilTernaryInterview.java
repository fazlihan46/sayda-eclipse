package day09switchoperater;

import java.util.Scanner;

public class ArtikYilTernaryInterview {

	public static void main(String[] args) {
//Kullanicidan yil girmesini isteyin
		//Girilen yil artik yil ise ekrana"Artik Yil"
		//Girilen yil artik yil degil ise ekrana"Artik Yil Degil"
		
//Artik Yil=1)Yil 100 e bolunurse 400 e de bolunmeli==>1300 artik yil degil.
		//cunku 100 e bolundugu halde 400 e bolunmez.
		//2)Yil 100 e bolunmezse 4 e bolunmeli	
Scanner scan=new Scanner (System.in);
System.out.println("Lutfen bir yil giriniz");
	int year=scan.nextInt();
			
String result =(year%100==0) ?(year%400==0?"Artik yil":"Artik Yil degildir")
		:(year%4==0?"Artik yil":"Artik Yil degildir");

System.out.println(result);		
		
		scan.close();
		
		
		
		

	}

}
