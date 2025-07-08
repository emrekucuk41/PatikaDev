/*Artık Yıl Nasıl Hesaplanır?

Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:

1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:

Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.
Sadece 400'e tam olarak bölünebilenlerin artık yıl kabul edilmesinin nedeni, bir astronomik yılın 
365,25 gün değil, yaklaşık olarak 365,242 gün olmasından kaynaklanan hatayı gidermektir.*/

import java.util.Scanner;
public class ArtikYilHesaplama {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int yil;

        System.out.print("Yıl Giriniz :");
        yil = input.nextInt();

        if(yil%4 == 0){
            if(yil%100 == 0 && yil%400 != 0){
                System.out.print(yil + " artık yıl değildir.");
            }else{
                System.out.print(yil + " artık yıldır.");
            }
        }else{
            System.out.print(yil + " artık yıl değildir.");
        }



    }
    
}
