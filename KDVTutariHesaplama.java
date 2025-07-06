import java.util.Scanner;
public class KDVTutariHesaplama {
    public static void main(String[] args){
        double kdvOrani,kdvliFiyat,kdvFiyati,urunFiyati ;
        Scanner input = new Scanner(System.in);

        System.out.print("Kdv'si hesaplanacak ürününü fiyatını giriniz:");
        urunFiyati = input.nextDouble();
        kdvOrani = (urunFiyati<=1000) ? 0.18 : 0.08;

        kdvliFiyat = (urunFiyati*kdvOrani)+urunFiyati;

        kdvFiyati = kdvliFiyat - urunFiyati;

        System.out.println("Ürünün KDV'li fiyatı:"+ kdvliFiyat);
        System.out.print("Ürünün KDV fiyatı:"+ kdvFiyati);


    }

    
}
