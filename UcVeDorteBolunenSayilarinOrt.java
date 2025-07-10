import java.util.Scanner;

public class UcVeDorteBolunenSayilarinOrt {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sayi, toplam = 0, sayac = 0;

        System.out.println("0 ile gireceğiniz sayı arasında 3 ve 4'e tam bölünen sayıların ortalaması alınacaktır.");
        System.out.print("Sayı giriniz: ");
        sayi = input.nextInt();

        for(int i = 1; i <= sayi; i++){
            if((i % 3 == 0) && (i % 4 == 0)){
                toplam += i;
                sayac++;
            }
        }

        if(sayac > 0){
            double ortalama = (double) toplam / sayac;
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
        } else {
            System.out.println("Bu aralıkta 3 ve 4'e tam bölünen sayı yok.");
        }
    }
}
