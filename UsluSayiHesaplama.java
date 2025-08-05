import java.util.Scanner;
public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int taban,us,uslusayi=1;
        Scanner input = new Scanner(System.in);

        System.out.print("Üslü ifadenin tabanının değerini giriniz:");
        taban = input.nextInt();

        System.out.print("Üslü ifadenin üs değerini giriniz:");
        us = input.nextInt();

        for(int i =1;i<=us;i++){
            uslusayi *= taban;
        }
        System.err.println(taban + "^" + us + "=" + uslusayi);
        
    }
    
}