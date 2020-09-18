package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
		//Kullanicidan ad ve soyadini alip ekrana yazdiran bir program yaziniz
		//(String kullaniniz)
Scanner scan=new Scanner(System.in);
System.out.println("lufen,adinizi ve soyadinizi giriniz");

String isim=scan.nextLine();
//Stringe leri kullanicidan almak icin iki yol vardir.ya sadece next()
//kullanirsiniz ya da nextLine().Farki next() tek kelimelik Stringler icin kullanilir
//nextLine() tum cumleyi almak icin kullanilir.

System.out.println(isim);


		
	}

}
