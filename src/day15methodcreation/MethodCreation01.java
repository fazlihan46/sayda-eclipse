package day15methodcreation;

public class MethodCreation01 {

	public static void main(String[] args) {
		System.out.println(toplama(11,15));//26
		System.out.println(carpma(13,5));//65

	}
	
//Bir methodu main methodun icinden cagirmak icin mutlaka static kelimesini kullanmalisiniz
//Method parentezinin icinde olusturulan variable lara "parametre" denir.
//Methodu cagirirkenmethod parantezinin icine yazilan degerlere"Argument" denir
	//Parametrenin data type i ile Argumentin data type i birebir eslesmeli.
	public static int toplama(int num1,int num2) {
		return num1+num2;
	
	}
	public static int carpma(int num1,int num2) {
	return	num1*num2;
	}

}
