/*Çin Zodyağı nasıl hesaplanır?

Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

Doğum Tarihi %12 = 0 ➜ Maymun

Doğum Tarihi %12 = 1 ➜ Horoz

Doğum Tarihi %12 = 2 ➜ Köpek

Doğum Tarihi %12 = 3 ➜ Domuz

Doğum Tarihi %12 = 4 ➜ Fare

Doğum Tarihi %12 = 5 ➜ Öküz

Doğum Tarihi %12 = 6 ➜ Kaplan

Doğum Tarihi %12 = 7 ➜ Tavşan

Doğum Tarihi %12 = 8 ➜ Ejderha

Doğum Tarihi %12 = 9 ➜ Yılan

Doğum Tarihi %12 = 10 ➜ At

Doğum Tarihi %12 = 11 ➜ Koyun
*/
import java.util.Scanner;
public class CinZodyagiHesaplama {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int dogumyili,kalan = 0;

        System.out.print("Lütfen doğum yılınızı giriniz:");
        dogumyili = input.nextInt();

        kalan = dogumyili % 12;

        switch(kalan){
            case 0:
            System.out.print("Çin Zodyağı Burcunuz : Maymun");
            break;
            case 1:
            System.out.print("Çin Zodyağı Burcunuz : Horoz");
            break;
            case 2:
            System.out.print("Çin Zodyağı Burcunuz : Köpek");
            break;
            case 3:
            System.out.print("Çin Zodyağı Burcunuz : Domuz");
            break;
            case 4:
            System.out.print("Çin Zodyağı Burcunuz : Fare");
            break;
            case 5:
            System.out.print("Çin Zodyağı Burcunuz : Öküz");
            break;
            case 6:
            System.out.print("Çin Zodyağı Burcunuz : Kaplan");
            break;
            case 7:
            System.out.print("Çin Zodyağı Burcunuz : Tavşan");
            break;
            case 8:
            System.out.print("Çin Zodyağı Burcunuz : Ejderha");
            break;
            case 9:
            System.out.print("Çin Zodyağı Burcunuz : Yılan");
            break;
            case 10:
            System.out.print("Çin Zodyağı Burcunuz : At");
            break;
            case 11:
            System.out.print("Çin Zodyağı Burcunuz : Koyun");
            break;
        }
    }
    
}
