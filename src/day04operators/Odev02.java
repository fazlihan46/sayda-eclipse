package day04operators;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		//Kullanicinin girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini
		//ekrana yazdiran bir program yaziniz
Scanner scan=new Scanner (System.in);
System.out.println("Lutfen 4 basamakli bir sayi giriniz");
int s=scan.nextInt();
 int ilkRakam=s%10;
 int sonRakam=s/1000;
 System.out.println(ilkRakam+sonRakam);
		
		
	}	
		

}
