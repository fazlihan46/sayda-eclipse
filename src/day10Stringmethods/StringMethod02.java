package day10Stringmethods;

public class StringMethod02 {

	public static void main(String[] args) {
		
//lastIndexOf() methodu aradiginiz karakterin String icindeki son gorunumunun indexini return eder.
		
		//lastIndexOf() methodu 1.versiyonu
		
String str1="Sivrihisar";		
System.out.println(str1.lastIndexOf('i'));//ekrana 6 yazdirir.
//cunku i karakterinin string icinde son gorunumunun indexi 6 dir.		
	
System.out.println(str1.lastIndexOf('r'));//9 yazdirir.
		
//lastIndexOf() methodu 2.versiyonu
		
		
System.out.println(str1.lastIndexOf('i', 5));//ilk 5 indexin icinde i harfinin son gorumununun indexini

//return eder.ekrana 4 yazdirir
		
//lastIndexOf() methodu 3.versiyonu
String str2="rivrihisari";

System.out.println(str2.lastIndexOf("ri"));//String icindeki "ri" nin son gorunumunu bulacak.
//son 'ri'deki r harfinin indexi olan 9 u return edecek





		

	}

}
