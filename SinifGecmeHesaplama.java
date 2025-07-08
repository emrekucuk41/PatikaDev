/* Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın. */

import java.util.Scanner;

public class SinifGecmeHesaplama {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int mat,fizik,turkce,kimya,muzik;
        int toplam=0,sayac=0;
        double ort;

        System.out.print("Matematik notunuzu giriniz:");
        mat = input.nextInt();
        if(0<=mat && mat<=100){
            toplam += mat;
            sayac++;
        }

         System.out.print("Fizik notunuzu giriniz:");
        fizik = input.nextInt();
        if(0<=fizik && fizik<=100){
            toplam += fizik;
            sayac++;
        }

         System.out.print("Türkçe notunuzu giriniz:");
        turkce = input.nextInt();
        if(0<=turkce && turkce<=100){
            toplam += turkce;
            sayac++;
        }

         System.out.print("Kimya notunuzu giriniz:");
        kimya = input.nextInt();
        if(0<=kimya && kimya<=100){
            toplam += kimya;
            sayac++;
        }

         System.out.print("Müzik notunuzu giriniz:");
        muzik = input.nextInt();
        if(0<=muzik && muzik<=100){
            toplam += muzik;
            sayac++;
        }

        ort = (toplam)/sayac;
        if(ort>=55){
            System.out.print("Sınıfı geçmeye hak kazandınız.");
        } else {
            System.out.print("Malesef sınıfta kaldınız.");
        }
        

    }
    
}
