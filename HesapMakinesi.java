
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args){
        double a,b;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz:");
        a = input.nextDouble();

        System.out.print("İkincinci sayıyı giriniz:");
        b = input.nextDouble();

        System.out.println("""
            Yapacağınız işlemini seçiniz:
            1-Toplama İşlemi
            2-Çıkarma İşlemi
            3-Çarpma İşlemi
            4-Bölme İşlemi
            5-Mod Alma İşlemi
            """);
        int islem = input.nextInt();

        switch(islem){
            case (1):
             System.out.print("Sonuç:"+ (a+b));
             break;
            case (2):
             System.out.print("Sonuç:"+ (a-b));
             break;
            case (3):
             System.out.print("Sonuç:"+ (a*b));
             break;
            case (4):
             System.out.print("Sonuç:"+ (a/b));
             break;
            case (5):
             System.out.print("Sonuç:"+ (a%b));
             break;
            default:
             System.out.print("Yanlış seçenek seçtiniz.Lütfen tekrar deneyiniz.");


        }
        

    }
    
}
