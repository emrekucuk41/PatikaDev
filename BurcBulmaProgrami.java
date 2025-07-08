/*  Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart

Ödev
Aynı örneği switch-case kullanmadan yapınız.
*/
import java.util.Scanner;
public class BurcBulmaProgrami {
    public static void main(String[] args){
        int gun,ay;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz günü giriniz:");
        gun = input.nextInt();

        System.out.print("Doğduğunuz ayı giriniz sayı olarak:");
        ay = input.nextInt();

        switch(ay){
            case 1:
            if(gun>0 && gun<=21){
                System.out.print("Burcunuz:Oğlak Burcu");
            }else{
                System.out.print("Burcunuz:Kova Burcu");
            }
            break;

            case 2:
            if(gun>0 && gun<=19){
                System.out.print("Burcunuz:Kova Burcu");
            }else{
                System.out.print("Burcunuz:Balık Burcu");
            }
            break;

            case 3:
            if(gun>0 && gun<=20){
                System.out.print("Burcunuz:Balık Burcu");
            }else{
                System.out.print("Burcunuz:Koç Burcu");
            }
            break;

            case 4:
            if(gun>0 && gun<=20){
                System.out.print("Burcunuz:Koç Burcu");
            }else{
                System.out.print("Burcunuz:Boğa Burcu");
            }
            break;

            case 5:
            if(gun>0 && gun<=21){
                System.out.print("Burcunuz:Boğa Burcu");
            }else{
                System.out.print("Burcunuz:İkizler Burcu");
            }
            break;

            case 6:
            if(gun>0 && gun<=22){
                System.out.print("Burcunuz:İkizler Burcu");
            }else{
                System.out.print("Burcunuz:Yengeç Burcu");
            }
            break;

            case 7:
            if(gun>0 && gun<=22){
                System.out.print("Burcunuz:Yengeç Burcu");
            }else{
                System.out.print("Burcunuz:Aslan Burcu");
            }
            break;

            case 8:
            if(gun>0 && gun<=22){
                System.out.print("Burcunuz:Aslan Burcu");
            }else{
                System.out.print("Burcunuz:Başak Burcu");
            }
            break;

            case 9:
            if(gun>0 && gun<=22){
                System.out.print("Burcunuz:Başak Burcu");
            }else{
                System.out.print("Burcunuz:Terzi Burcu");
            }
            break;

            case 10:
            if(gun>0 && gun<=22){
                System.out.print("Burcunuz:Terzi Burcu");
            }else{
                System.out.print("Burcunuz:Akrep Burcu");
            }
            break;

            case 11:
            if(gun>0 && gun<=21){
                System.out.print("Burcunuz:Akrep Burcu");
            }else{
                System.out.print("Burcunuz:Yay Burcu");
            }
            break;

            case 12:
            if(gun>0 && gun<=21){
                System.out.print("Burcunuz:Yay Burcu");
            }else{
                System.out.print("Burcunuz:Oğlak Burcu");
            }
            break;

        }
    }
    
}
