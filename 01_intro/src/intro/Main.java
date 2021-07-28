package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String introInmternetMusteriHizmetleri = "Hoþgeldiniz!...";
		double dolar = 8.65;
		double dolarYeni = 8.10;
		System.out.println("Hello World!");
		System.out.println(introInmternetMusteriHizmetleri);
		if(dolar<dolarYeni) {
			System.out.println("Dolar Yükseldi");
		}
		else {
			System.out.println("Dolar düþtü");
		}
		System.out.println(" ");
		String[] krediler = 
			{"Hýzlý Kredi","Mutlu Emekli Kredisi","Konut Kredisi","Çiftçi Kredisi","MSB Kredisi","MEB Kredisi"};
		
		for(int i=0;i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		System.out.println(" ");
		/*foreach */
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
		String sehir1 = "Ankara";
		String sehir2 = "Ýstanbul";
		sehir1 = sehir2;
		sehir2 ="Ýzmir";
		System.out.println(sehir1);
		
	}

}
