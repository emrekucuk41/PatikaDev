/*Manav Kasa Programı

Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
*/

import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args){
        double toplam,armut,elma,domates,muz,patlican;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kilo Armut Aldınız:");
        armut = input.nextDouble();

        System.out.print("Kaç kilo Elma Aldınız:");
        elma = input.nextDouble();

        System.out.print("Kaç kilo Domates Aldınız:");
        domates = input.nextDouble();

        System.out.print("Kaç kilo Muz Aldınız:");
        muz = input.nextDouble();

        System.out.print("Kaç kilo Patlıcan Aldınız:");
        patlican = input.nextDouble();

        toplam = armut*2.14+elma*3.67+domates*1.11*muz*0.95+patlican*5 ;
        System.out.print("Aldığınız meyveleri fiyatı:"+ toplam);



    }
    
}
