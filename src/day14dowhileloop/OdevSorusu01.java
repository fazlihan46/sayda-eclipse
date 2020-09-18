package day14dowhileloop;

import java.util.Scanner;

public class OdevSorusu01 {

	public static void main(String[] args) {
//Kullanicidan bir String alin ve 
//bu stringin ilk harfi ile son harfinin yerlerini degistirerek ekrana yazdirin	
	//or:Java==>aavJ
		Scanner scan =new Scanner(System.in);
	System.out.println("Lutfen kelime veya cumle yazin");
	String str=scan.nextLine();
	
	char ilk=str.charAt(0);
	char son=str.charAt(str.length()-1);
	
	System.out.println(son+str.substring(1,str.length()-1)+ilk);
		
		
		
		
		
		
		
		
		
		
	}

}
