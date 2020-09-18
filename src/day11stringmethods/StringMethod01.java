package day11stringmethods;

public class StringMethod01 {

	public static void main(String[] args) {
//startsWith() methodu bir stringin istenen harfle baslayip baslamadigini kontrol eder.
		//istenen harfle basliyorsa true,istenen harfle baslamiyorsa false return eder. 		
		
	String str1="Ali Can";	
		
//startsWith() 1.Versiyon		
		
	System.out.println(str1.startsWith("A"));	//true
	System.out.println(str1.startsWith("B"));	//false ,gorurum.cunku byuk b ile baslamiyor
	System.out.println(str1.startsWith("a"));//false.cunku java case sensetive dir.
	System.out.println(str1.startsWith("Ali"));	//true
	
	//2.Versiyonu
	
System.out.println(str1.startsWith("a", 3));//false	
	
System.out.println(str1.startsWith("a", 5));//true
System.out.println(str1.startsWith("Can", 4));	//true
	
	
//endsWith() methodu==>bir stringin istenen harfle bitip bitmedigini kontrol eder.
//istenen harfle bityorsa true,bitmiyorsa false return eder

String str2="Ayse Canan";

System.out.println(str2.endsWith("n"));//true

System.out.println(str2.endsWith("Canan"));//true

System.out.println(str2.endsWith("CANAN"));//false
System.out.println(str2.endsWith(""));//"" ve" "  tamamiyle farkli.
//ikincinin icinde bosluk karakteri var.birincinin icinde yok
//true verir.cunku kelime bitince n nin sonrasinda hicbisey yokve tirnak kapaniyor.

String str3="Ali ";
System.out.println(str3.endsWith(" "));//true verir
System.out.println(str3.endsWith(""));//true verir
System.out.println(str3.startsWith(""));//true verir

	}

}
