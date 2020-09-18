package day10Stringmethods;

import java.util.Scanner;

public class SinavSorusu10 {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);	
System.out.println("Yil Giriniz");
int yil=scan.nextInt();
if(yil%100==0 && yil%400==0){System.out.println(yil+" artik yildir.");
}else if(yil%100!=0 && yil%4==0) {System.out.println(yil+" artik yildir");
}else {System.out.println(yil+" Artik Yil degildir");
}                                                                 
}}
		
		 

	            


