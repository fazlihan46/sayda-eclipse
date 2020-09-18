package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement02 {

public static void main(String[] args) {
//Kullanicidan bir tamsayi isteyin ve o tamsayinin mutlak degerini ekrana yazdirin
//Mutlak deger sayinin kendi isareti ile carpilmasidir
	//=3 un mutlak degeri:-1*-3=3
	//+5*+1=5
//0 in mutlak degeri 0
Scanner scan=new Scanner(System.in);
System.out.println("Lutfen bir tam sayi giriniz.");
int num=scan.nextInt();
if(num>0) {System.out.println(num*(+1));}else{System.out.println(num*(-1));}


		
		
		
		
		

	}

}
