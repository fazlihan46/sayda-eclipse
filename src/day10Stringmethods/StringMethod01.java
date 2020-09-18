package day10Stringmethods;

public class StringMethod01 {

	public static void main(String[] args) {
	//indexOf() methodu string in icindeki karakterin yerini belirlemek icin kullanilir.
		
String str1="Javva World";// mesela burda v harfinin yerini belirleyecegim.

System.out.println(str1.indexOf('v'));//ekrana 2 yazdirir
System.out.println(str1.indexOf('W'));		
//ekrana 6 yazdirir.cunku index sayimi sifirdan baslar.space java icin bir karakterdir.

System.out.println(str1.indexOf('w'));	//kucuk w Stringe de yok.Java karakter bulamayinca -1 return eder.	
System.out.println(str1.indexOf('a'));	//java soldan saga calistigi icin ilk a nin yerini soyler	
//ekrana bir yazar.Birden fazla kullanilan karakterler icin Java ilk karakterin indexini verir.Ikinciye bakmaz
		
	//INDEXOF IKINCI METHOD	
		
//indexOf()	methodu diger versiyonu
System.out.println(str1.indexOf('a',2));//Stringdeki ikinci 'a'	characterinin indexini bulunuz
		//Ekrana 3 yazdirmali..index i 2 olan harften sonra a yi ara.//4 yazdiracak

System.out.println(str1.indexOf('a',4));//ekrana 4 yazdirir

System.out.println(str1.indexOf('a',1));//1 yazdirir

System.out.println(str1.indexOf('a',5));// -1 yazdirir.Cunku stringe a olmasina ragmen
//benim aramaya basla dedigim yerden itibaren a yok

//"Alamanya" stringteki ikinci a karakterinin indexini bulunuz

String str2="Alamanya";
System.out.println(str2.indexOf('a'));//Bu birinci a nin indexi==>2
int idx=str2.indexOf('a');
System.out.println(str2.indexOf('a',idx+1));//ekrana 4 yazdirmali

//indexOf ucuncu versiyonu

String str3= "Missisipi";
System.out.println(str3.indexOf("is"));//ilk "is" stringini bulur ve ilk harfin indexini return eder
//i harfinin indexi olan 1 i return eder


System.out.println(str3.indexOf("si"));//ekrana 3 yazdirir.

	}

}
