package day11stringmethods;

public class StringMethod02 {

	public static void main(String[] args) {
	//substring() methodu bir stringin	belli bir bolumunu kesip almak icin kullanilir.
		
		
	String str1="Java calisana kolaydir";
	//1.Versiyon
	System.out.println(str1.substring(5));//calisana kolaydir.5 indexi gosterir.
	System.out.println(str1.substring(8));	//isan kolaydir.index 8 dahildir(inclusive)
	System.out.println(str1.substring(22));//ekranda hic bir sey goremezsiniz
	
	
	//System.out.println(str1.substring(23));//Exception. hata.cunku index23 yok
		
	System.out.println(str1.substring(0));//str1.substring(0)=str1 oldugundan str1.substring(0)
	//hic kullanilmaz.
		
//Substring 2.Versiyon
	System.out.println(str1.substring(5, 13));//ilk yazdigimiz index dahil,
	//ikinci yazdigimiz dahil degil.[5,13)....ekranda calisana gorulur

System.out.println(str1.substring(6, 12));	//alisan
	
System.out.println(str1.substring(6,6));//ekranda hic bir sey goremezsiniz.substring(6,6) kullanilmaz

//System.out.println(str1.substring(7,6));//hata verir.exception,Bu hatayi yapmayin
//her zaman ilk index kucuk veya esit olur.
	
	
		

	}

}
