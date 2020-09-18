package day06ifstatement;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
	//Kullanicidan bir dikdortgenin en ve boyunu alin
	//en ve boy esit ise ekrana bu bir karedir yazdirin
	//en ve boy farkli ise ekrana bu bir dikdortgendir yazdirin
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Lutfen dkdortgenin enini giriniz.");
	double en=scan.nextDouble();
	System.out.println("dikdortgenin boyunu giriniz");
	double boy=scan.nextDouble();
	if(en==boy){System.out.println("Bu bir karedir");}
	if(en!=boy){System.out.println("Bu bir dikdortgendir");}
		
//else==diger ihtimallerin tamamidir.		
//en ile boy ya esittir yada degildir.iste bu tip sorular else ile yapilabilir.
	
if(en==boy)	{System.out.println("Bu bir karedir");}else{System.out.println("Bu bir dikdortgendir");
//boylece ikinci bir if kullanmama gerek kalmadi
	
}
		
		
	}

}
