package day07nestedif;

import java.util.Scanner;

public class OdevKutsalGunSorusu {

	public static void main(String[] args) {
//Kullanicidan bir gun alin.Eger gun "Cuma" ise ekrana "Muslumanlar icin kutsal gun" yazdirin.
//"Cumartesi ise ekrana "Yahudiler icin kutsal gun" yazdirin.
//"Pazar" ise "Hiristiyanlar icin kutsal gun "yazdirin
//Diger gunler icin "kutsal gun degil" yazdirin
Scanner scan=new Scanner (System.in);
System.out.println("Lutfen bir gun giriniz");
String gun= scan.next();

if(gun.equalsIgnoreCase("Cuma"))
//equalsIgnoreCase() buyuk kucuk harf dikkate  almadan esitlige bakar
//equalsIgnoreCase() icin cuma=Cuma=CUMA CuMa nin, hic bir farki yok
	
	
	
{System.out.println("Muslumanlar icin kutsal gun");
}else if(gun.equalsIgnoreCase("Cumartesi"))
{System.out.println("Yahudiler icin kutsal gun");
}else if(gun.equalsIgnoreCase("Pazar")) 
{System.out.println("Hiristiyanlar icin kutsal gun");
}else {System.out.println("Kutsal Gun Degil.");
}
		
		
		
	}

}
