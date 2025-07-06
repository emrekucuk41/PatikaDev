/* Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360
*/
import java.util.Scanner;
public class DaireninAlaniniveCevresiniHesaplama {
    public static void main(String[] args){
        final double Pi = 3.14;
        double r,alan;
        int aci;
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz:");
        r = input.nextDouble();

        System.out.print("Açı değeri:");
        aci = input.nextInt();

        alan = (Pi*r*r*aci)/360;
        System.out.print(aci+ " dereceli açılı dairenin alanı:"+ alan);


    }
    
}
