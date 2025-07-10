/*Ödev
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.*/
import java.util.Scanner;
public class Odev1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sayi,toplam = 0;
        System.out.print("Sayı giriniz:");
        sayi = input.nextInt();
        while(sayi%2 ==0){
            if(sayi%2==0 && sayi%4==0){
                toplam += sayi;
                System.out.print("Sayı giriniz:");
                sayi = input.nextInt();
            }
        }
        System.out.print("Girilen değerlerden çift ve 4'ün katları olan sayıları toplanmıştır :" + toplam);
    }
    
} 