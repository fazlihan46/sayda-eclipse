package day14dowhileloop;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {
	//Kullanicidan bir sayi alin ve bu sayinin bolenlerini ekrana yazdirin.
		//ornegin;12 nin bolenleri 1,2,3,4,6, ve 12 dir.
	
Scanner scan =new Scanner(System.in);
System.out.println("Lutfen pozitif bir tamsayi giriniz");
//for loop ile cozumu:
int num=scan.nextInt();

for(int i=1;i<=num;i++) {
	if(num%i==0) {System.out.print(i+" ");
}
}
System.out.println();
//while loop ile cozumu
int i=1;

while(i<=num) {
	if(num%i==0) {
	
	System.out.print(i+" ");
}
	i++;
}

scan.close();


	}

}
