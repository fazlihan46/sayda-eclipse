package day07nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
//Kullanicidan password girmesini isteyin
//password 4 basamakli bir sayi ise cift olup olmadigini kontrol edin
//cift sayi ise "password tamam" yazdirin,Tek sayi ise "Tekrar deneyin" yazdirin
//Passord 4 basamakli degil ise "Tekrar deneyin"yazdirin
//0123 Java icin 123 demektir.01234 seklinde yazmak icin String kullanmaliyiz
		
Scanner scan=new Scanner(System.in);

System.out.println("lutfen,password giriniz.");

int password=scan.nextInt();

if(password>999 && password<10000){if (password%2==0)
	
{System.out.println("Password tamam");

} else if (password%2!=0){System.out.println("Tekrar Deneyin ilk");
}}else {System.out.println("Tekrar deneyin son");} scan.close();}}
