package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement03 {

	public static void main(String[] args) {
//Kullanicidan 6 basamakli bir sayi giriniz.0 ile de baslayabilir
//Kazanma ihtimali %20,amorti ihtimali %30,kaybetme ihtimali%34 olan bir
//jackpot oyunu icin bir program yaziniz
//000000-00001-000002-000003	..-	999998-999999-1000000
	
Scanner scan=new Scanner(System.in);
System.out.println("Lutfen 6 basamakli bir sayi giriniz.");
int num=scan.nextInt();
if(num<200000) {
	System.out.println("Kazandiniz");
}else if(num<500000) {System.out.println("Tekrar deneyin");	//1000000 un %30 u 300000 eder.
//300000 i elde etmem icin500000 demem lazim(500000-300000=200000)
}else {System.out.println("Kaybettiniz");}
		
		
		
		
	}

}
