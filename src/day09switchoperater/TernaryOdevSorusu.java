package day09switchoperater;

import java.util.Scanner;

public class TernaryOdevSorusu {

	public static void main(String[] args) {
//Kullanicidan bir tamsayi girmesini isteyin'o tamsayi 3 basamakli ise ekrana"3 basamakli"
//3 basamakli degilse cift olup olmadigini kontrol edin
//Cift ise "3 basamakli olmayan cift sayi yazdirin.
//Cift degilse "3 basamakli olmayan tek sayi yazdirin"
		
Scanner scan=new Scanner (System.in);
	System.out.println("Lutfen bir tamsayi giriniz.");
int num=scan.nextInt();

String result=(num>99 && num<1000)?("Uc basamakli"):
	(num%2==0 ? "3 basamakli olmayan cift sayi":"3 basamakli olmayan tek sayi ");
		
System.out.println(result);		
		
	scan.close();	
		
		
	}

}
