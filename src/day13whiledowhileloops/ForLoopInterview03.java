package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview03 {

	public static void main(String[] args) {
	
//Kullanicidan bir sayi alin 
		//bu sayiyinin tersinin iki fazlasini ekrana yazdirin
		
Scanner scan=new Scanner(System.in);
System.out.println("Lutfen bir sayi giriniz");
		String num=scan.nextLine();
		
	String ters="";	
		
		for (int i=num.length()-1;i>=0;i--) {
			
		ters=ters+num.charAt(i)+"";//char i Stringe cevirmek icin sonuna+"" ekleyebilirsiniz
		
		}
		
	System.out.println(ters);	
		
	int tersInt=Integer.valueOf(ters);
	tersInt=tersInt+2;
	System.out.println(tersInt);
		
		
		
		
	}

}
