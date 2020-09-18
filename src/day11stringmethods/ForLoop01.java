package day11stringmethods;

public class ForLoop01 {

	public static void main(String[] args) {
//4,3, ve 2 yi ekrana yazdiran bir for loop olusturun
		for(int i=4;i>1;i--) {System.out.println(i);}
		
	//4,3,2,1,-1
		
		for(int i=4;i>-2;i--) {System.out.println(i);}	
	
//3,4,5,6,7 sayilarini ekrana yazdiran for loop olusturun
		
for(int i=3;i<8;i++) {System.out.println(i);}	//Baslangic degeri kucuk bitis degeri buyukse i++,
//aksi durumda i--	kullanin.
		
		
//ilk yuz sayma sayisini ekrana yan yana ve aralarina bosluk koyan programi for loop yazarak kullaniniz		
		
for(int i=1;i<101;i++) {System.out.print((" "+i));}	
System.out.println();
//ilk yuz sayma sayisini geriye dogru
//ekrana yan yana ve aralarina bosluk koyan programi for loop yazarak kullaniniz		

for(int i=100;i>0;i--) {System.out.print(i+" ");}
System.out.println();
//ilk 50 cift sayma sayisini ekrana yazdirin for loop olusturun

for(int i=2;i<101;i=i+2) {System.out.print(i+" ");}
System.out.println();
//ilk 50 tek sayma sayisini ekrana yazdirin for loop olusturun

for(int i= 1;i<100;i=i+2) {System.out.print(i+" ");}


	
}
		
	}


