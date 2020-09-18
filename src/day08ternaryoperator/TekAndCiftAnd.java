package day08ternaryoperator;

public class TekAndCiftAnd {

	public static void main(String[] args) {
System.out.println(3<2 && 5>4);	
//&& kullanirsaniz 	Java ilk false u bulduktan sonra diger kontrolleri yapmaz.
//Bu da Javanin yukunu azaltir.Yukun azaltilmasi sure kazandirir ve
//Javanin hata yapma riskini azaltir		
System.out.println(3<2 & 5>4);	
//& kullanirsaniz 	Java ilk false u bulduktan sonra diger kontrolleri yapar
//Buda Java icin iyi degildir.Cunku sonucu belli olan bir islem icin hala emek sarfediyor.
		
		
		
	}

}
