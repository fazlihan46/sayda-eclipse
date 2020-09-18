package day06ifstatement;

public class IfStatement03 {

	public static void main(String[] args) {
//Bir char variable olsturun ve bir buyuk deger atayin	
//eger atanan deger haftanin gunlerinden herhangi birinin ilk harfiyse o gunleri yazdirin

//Pazar Pazartesi,Persembe  Sali CArsamba Cuma Cumartesi
		//eger atanan deger haftanin gunlerinden herhangi birinin ilk harfi degilse
		//'boyle bir gun yok" yazdirin	
	
char gun='L';
if (gun=='P') {System.out.println("Pazar,Pazartesi,Persembe");}
if (gun=='S') {System.out.println("Sali");}
if (gun=='C') {System.out.println("Carsamba,Cuma,Cumartesi");}
		

//"P" olmamak VEYA "C"olmamak VEYA"S" olmamak==> VEYA ISLEMI ICIN ||
//Veya isleminden True sonucu alabilmek icin bir tanesinin True olmasi yeterlidir
//True||True=True  <-> True||False=True <-> False||False=False.


//"P" olmamak VE "C"olmamak VE "S" olmamak==>&&
//Ve isleminden True sonucu alabilmek icin tum condition lar True olmalidir
//herhangi bir condition false olursa sonuc false olur.
//True&&True=True<->True&&False=False<->False&&False=false

if(gun!='P' && gun!='C' && gun!='S') {System.out.println("Boyle bir gun yok");}




	}

}
