/*Ödev
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
*/
import java.util.Scanner;

public class DortVeBesinKatlariniBulma {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen sayı giriniz:");
        sayi = input.nextInt(); 
        
        System.out.println("Girilen sayıya kadar olan 4'ün katları:");
        for(int i = 1; i <= sayi; i *= 4){
            System.out.println(i);
        }
        System.out.println("Girilen sayıya kadar olan 5'in katları:");
        for(int i = 1; i <= sayi; i *= 5){
            System.out.println(i); 
        }
    }
}
    

