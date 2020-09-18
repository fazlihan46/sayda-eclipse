package day03operators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {
	// Kullanicidan ad ve soyadini alalim ekrana yazdiralim
		//Kullanicidan adresi alalim ekrana yazdiralim(2.cadde Bakirkoy Istanbul Turkiye)
		//Kullanicidan yasini alalim ekrana yazdiralim
		//Kullaniciya Turkiye'de yasiyorum.dogru/yanlis diye soralim
		//cevabini ekrana yazdiralim true yada false olarak
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen,adinizi ve soyadinizi giriniz.");
		String tamIsim=scan.nextLine();
		System.out.println(tamIsim);
		
		System.out.println("Lutfen adresinizi giriniz");
		String adres=scan.nextLine();
		System.out.println(adres);
		
		System.out.println("yasinizi giriniz");
		int yas=scan.nextInt();
		System.out.println(yas);
		
		System.out.println("Turkiyede yasiyorum.true/false");
		boolean blTr=scan.nextBoolean();
		
		System.out.println(blTr);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
	}

}
