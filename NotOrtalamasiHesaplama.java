import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args){
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunu Giriniz:");
        mat = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz:");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz:");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz:");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuzu Giriniz:");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz:");
        muzik = input.nextInt();

        double ortalama = (mat+fizik+kimya+turkce+tarih+muzik)/6;

        String sonuc = (ortalama >= 60) ? "Geçtiniz." : "Kaldınız.";
        System.out.println(sonuc);


    }
}