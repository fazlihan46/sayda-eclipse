package day07nestedif;

import java.util.Scanner;

public class OdevCharSorusu {

	public static void main(String[] args) {
//Kullanicidan bir Character alin eger Character bir harf ise ekrana "Harf " yazdirin.
//Diger durumlarda ekrana "Harf Degil" yazdirin.
		
Scanner scan =new Scanner(System.in);
System.out.println("lutfen bir cahracter giriniz");
char harf=scan.next().charAt(0);//Kullanicidan char almak icin next().charAt(0) kullanilir.

if((harf<=122 && harf>=97)||(harf<=90 && harf>=65)) {System.out.println("Bu bir harftir");
}else {System.out.println("Bu bir harf degildir");

}
//ACII table a bakarak araligi ayarladim
//Buyuk harf ve kucuk harfleri ayri ayri		
		

	}

}
