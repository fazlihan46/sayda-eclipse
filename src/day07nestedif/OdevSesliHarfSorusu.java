package day07nestedif;

import java.util.Scanner;

public class OdevSesliHarfSorusu {

	public static void main(String[] args) {

//Kullanicidan bir harf alin eger harf"a,e'i'o'u" dan biri ise ekrana "Sesli Harf" yazdirin.
//"b,c,d,f" den biri ise ekrana "Sessiz Harf" yazdirin
		
Scanner scan=new Scanner(System.in)	;
System.out.println("Lutfen a,e,i,o,u,b,c,d,f harflerinden birini giriniz.");
char harf=scan.next().charAt(0);	

if(harf=='a' || harf=='e' || harf=='i' || harf=='o' || harf=='u')
{System.out.println(harf+" sesli harftir.");
}else if(harf=='b' || harf=='c' || harf=='d' || harf=='f') 
{System.out.println(harf+" sessiz harftir.");}else {System.out.println("Yanlis harf girdiniz.");}
						
	}

}
