package day04operators;

import java.util.Scanner;

public class OdevSorusuCozumu01 {

	public static void main(String[] args) {
	//Kullanicidan Integer aldiktan sonra String alamiyoruz.
		Scanner scan=new Scanner(System.in);
		
	//Java da nextInt()kullandiktan sonra nextLine() kullanirsak kod calismiyor.
		//nextInt() yerine nextLine() kullan sonra elde ettigin Stringi 
		//Integer.parseInt() kullanarak integera cevir.
		
		System.out.println("Yasinizi giriniz.");
		String yas=scan.nextLine();
		int yeniYas=Integer.parseInt(yas);//Stringi tam sayiya cevirme methodu
		                                //Integer.parseInt() sadece rakam iceren
		// stringler icin calisir.
		
System.out.println(yeniYas+1);//34 toplama yapiyormu diye merak ettigimiz icin +1 ekledik.
		
System.out.println("Adinizi ve Soyadinizi giriniz.");
String isim=scan.nextLine();
System.out.println(isim);
		
		
		
		

	}

}
