package tahminOyunu;
import java.util.Scanner;

public class to {
	public static void main(String[] args) {
		// Degerlerimizi tanimliyoruz.
		int kontrol = 0;
		double sayac = 50;
		double ekleCikar = 25;

		System.out.println("****TAHMIN OYUNUNA HOS GELDINIZ****");
		System.out.println("");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Aklinizdan 1 ile 100 arasinda bir sayi tutunuz.");
		
		// kontrol degiskeni 0 oldugu surece donguyu tekrarliyoruz.
	    while (kontrol==0) {
	    	
	    	// Buradaki ("%.0f") ifadesi double olan bir sayiyi integer gibi yazd�r�yor.
			System.out.format("Tahminim: " + "%.0f", sayac);
			System.out.println("");
			
			System.out.println("Yanlissa 0 degerini, dogruysa 1 degerini giriniz:");
		    kontrol = keyboard.nextInt();
		    
		    // Yukarida da belirtildigi gibi kontrol degiskeni uzerinde kontroller yapiliyor.
		    // Eger tutulan sayi bilinirse "break" komutuyla program sonlandiriliyor.
		    if (kontrol==1) {
		    	System.out.format("Tuttugunuz sayi: " + "%.0f", sayac);
		    	break;
		    }else if (kontrol != 0){
		    	// Kontrol 0 veya 1' den farkl� bir say� olursa uyar� verilir ve program sonland�r�l�r.
		    	System.out.println("Lutfen 0 ya da 1 girin!");
		    	break;
		    }	
		    
			System.out.print("Tahminim dusukse 0 degerini, yuksekse 1 degerini giriniz:");
			int azcok = keyboard.nextInt();
			// azcok degiskeni yapilan tahmin araligini daraltmak icin kullanilacak.
			
			// Kosullar uygulaniyor
			if (azcok==0) {
			    sayac = sayac - Math.ceil(ekleCikar);	
			    ekleCikar = ekleCikar / 2;
			}else if (azcok==1) {
			    sayac = sayac + Math.ceil(ekleCikar);
			    ekleCikar= ekleCikar / 2;
			}else {
			    System.out.println("Lutfen 0 ya da 1 girin!");
			    break;
			}    
	    }
	}
}
