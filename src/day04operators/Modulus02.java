package day04operators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {
	//Kullanicinin verdigi 4 basamakli sayinin ilk ve son rakaminin toplamini veren program yaz.
	
		Scanner scan=new Scanner(System.in);
		
	System.out.println("Dort basamakli bir tamsayi giriniz.");
	
		int s=scan.nextInt();// Bir tam sayinin 1 ler basamagini bulmak icin 10 a boleriz
		int sonRakam=s%10;
		int ilkRakam=s/1000;
		System.out.println(sonRakam+ilkRakam);//1+4=5
		
	

		
		

	}

}
