/*Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
Ödev
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
*/
import java.util.Scanner;
public class EtkinlikOnerme {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sicaklik;

        System.out.print("Hava sıcaklığını giriniz:");
        sicaklik = input.nextInt();

        if(sicaklik<5){
            System.out.print("Bugün kayak yapabilirsiniz.");
        } else if(5<=sicaklik && sicaklik<=15){
            System.out.print("Bugün sinemaya gidebilirsin.");
        } else if(15<sicaklik && sicaklik<=25){
            System.out.print("Bugün pikniğe gidebilirsin.");
        } else if(sicaklik>25){
            System.out.print("Bugün yüzmeye gidebilirsin.");
        } else {
            System.out.print("Bu sıcaklık değerine ait etkinlik bulunmamaktadır.");
        }

    }
    
}
