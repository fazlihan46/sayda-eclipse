package day15methodcreation;

import java.util.Scanner;

public class OdevSorusu01 {

	public static void main(String[] args) {
//Kullaniciya sayi girmesini soyleyin.Kullanici 0 girdiginde,ekrana o ana kadar girmis
		//oldugu tum sayilarin tioplamini yazdiriniz
		//Or:5,4,7,0 ise 5+4+7=16 oldugundan ekrana 16 yazdirin.
		
		Scanner scan=new Scanner(System.in);
		int num=0;
		int sum=0;
		do {
			System.out.println("Sayi giriniz");
			 num=scan.nextInt();
			 sum=sum+num;
		}while(num!=0);
		System.out.println(sum);
		scan.close();
		
		
		
		
	}

}
