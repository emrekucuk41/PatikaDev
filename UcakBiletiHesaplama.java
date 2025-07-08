import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args){
        double mesafe, toplamTutar;
        int yas, yolculukTipi;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        mesafe = input.nextDouble();

        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
        yolculukTipi = input.nextInt();

        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        toplamTutar = mesafe * 0.10;

        if (yas < 12) {
            toplamTutar *= 0.5; // %50 indirim
        } else if (yas >= 12 && yas <= 24) {
            toplamTutar *= 0.9; // %10 indirim
        } else if (yas > 65) {
            toplamTutar *= 0.7; // %30 indirim
        }

        if (yolculukTipi == 2) {
            toplamTutar *= 0.8; // %20 indirim
            toplamTutar *= 2;   // gidiş + dönüş
        }

        System.out.println("Toplam Tutar = " + toplamTutar + " TL");
    }
}
