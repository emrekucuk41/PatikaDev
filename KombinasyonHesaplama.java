/*Java ile faktöriyel hesaplayan program yazıyoruz.

Ödev
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
*/
import java.util.Scanner;
public class KombinasyonHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,r,nfaktoriyel=1,rfaktoriyel=1,faktoriyel1=1;
        double kombinasyon;
        System.out.print("Eleman sayısını giriniz:");
        n = input.nextInt();

        System.err.print("Kaç eleman seçilecek giriniz:");
        r = input.nextInt();

        for(int i = 1; i<=n;i++){
            nfaktoriyel *= i;
        }
        for(int i = 1; i<=r;i++){
            rfaktoriyel *= i;
        }
        for(int i = 1; i<=(n-r);i++){
            faktoriyel1 *= i;
        }
        kombinasyon = (nfaktoriyel / (rfaktoriyel*faktoriyel1));
        System.out.print("C("+ n +"," + r + ")="+kombinasyon);
    }
    
}
