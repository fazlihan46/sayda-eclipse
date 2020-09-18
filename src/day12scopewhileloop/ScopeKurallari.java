package day12scopewhileloop;

public class ScopeKurallari {

	public static void main(String[] args) {
//Scope kapsam demektir.Olusturdugunuz bir variable nerelerde kullanabileceginizi gosterir.				
		
	}

public void toplama() {System.out.println("Toplama");	}
	
	public void carpma(int num,String str,char ch) {System.out.println("Carpma");}
	
}
//1.Kural:Class in icinde methodlarin disinda olan variable lari
//butun methodlar istedikleri zaman istedikleri kadar kullanabilirler
//Bu variabllara "Class Variable" veya "Instance Variable" denir
//Class Variable lara deger atamasi yapmazsak 
//Java onlara default degerler verir(kafasina gore).
//Java tum sayilar icin default olarak 0 degerini verir

//2.Kural:Bir methodun body si icinde olusturulan variablelar sadece o methodun icinde kullanilabilir
//o methodun disindaki methodlar o variable i kullanamaz.Bu variable lara "Local variable" denir.
//Body icinde olusturulan variable lara deger atamak ZORUNDAYIZ.java onlara default value vermez



//3.Kural:Methodlarin parantezleri icinde olusturulan Variable lar local variablar gibi sadece
//o methodlarin bodyleri icinde kullanilabilir.Bu variabllara da" local variable" denir
//Parantez icinde olusturulan variable lara ise deger atamasi yapmayiniz


//4.Kural:Bir variable i kullanmaya baslamadan once tanimlamaliyiz
//once num=num+2 sonra int num=12 diyemeyiz
//once int num=12,sonra num=num+2 demeliyiz


