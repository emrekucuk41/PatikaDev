/* Taksimetre Programı

Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
*/
import java.util.Scanner;
public class TaksimetreProgrami {
    public static void main(String[] args){
        double kmBasi = 2.2,odenecekTutar;
        int km,baslangicdegeri = 10;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç km yol gidilecek:");
        km = input.nextInt();

        odenecekTutar = km>=5 ? baslangicdegeri+(km*kmBasi) : 20 ;
        System.out.print("Toplam ödenecek tutar:" + odenecekTutar);

    }
    
}
