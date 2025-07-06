/*Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
*/
import java.util.Scanner;
public class UcgeninAlaniniHesapla {
    public static void main(String[] args){
        int a,b,c,cevre,u;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Üçgenin 1.kenar uzunluğunu giriniz:");
        a = input.nextInt();

        System.out.print("Üçgenin 2.kenar uzunluğunu giriniz:");
        b = input.nextInt();

        System.out.print("Üçgenin 3.kenar uzunluğunu giriniz:");
        c = input.nextInt();

        cevre = a+b+c;
        u = cevre/2;

        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.print("Üçgenin Alanı:"+ alan);


    }

    
}
