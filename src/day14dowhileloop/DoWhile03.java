package day14dowhileloop;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
//Kullanicidan sayi alin.Sayi 10 dan kucuk ise'ekrana"Kazandiniz"
	//sayi 10 veya 10 dan buyukse ekrana"Tekrar deneyiniz" yazdirin.
		
	Scanner scan=new Scanner (System.in);
	int num;
	do {
	System.out.println("Lutfen bir tam sayi giriniz.");
	 num=scan.nextInt();}while(num>=10);//Donguyu kirmak icin condition i yanlis girmem lazim.
	System.out.println(("Kazandiniz"));
	
	
		
		
		
		
		
		
	}

}
