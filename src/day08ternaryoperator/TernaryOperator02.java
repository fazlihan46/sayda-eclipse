package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator02 {

	public static void main(String[] args) {
	
//Kullanicidan iki sayi alin
//Bu sayilar birbirine esitse toplamlarini ekrana yazdirin
//Bu sayilar birbirinden farkliysa carpimlarini ekrana yazdirin.
		
Scanner scan=new Scanner (System.in);
System.out.println("Lutfen birinci sayiyi giriniz.");
double num1=scan.nextDouble();
System.out.println("Lutfen ikinci sayiyi giriniz.");
double num2=scan.nextDouble();

double sonuc=(num1==num2) ? (num1+num2):(num1*num2);
System.out.println(sonuc);	
			
	}

}
