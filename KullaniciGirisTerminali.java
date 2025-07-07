/*Ödev
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse
yeni girdiği şifrenin unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip, şifreler aynı ise ekrana 
"Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
*/
import java.util.Scanner;

public class KullaniciGirisTerminali {
    public static void main(String[] args) {
        String sifre, yenisifre;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen şifrenizi giriniz: ");
        sifre = input.nextLine();

        if ("emreemre".equals(sifre)) {
            System.out.println("Başarıyla giriş yaptınız.");
        } else {
            System.out.println("""
                    Seçeneklerden birini seçiniz:
                    0 - Şifreyi yenilemek istemiyorum
                    1 - Şifreyi yenilemek istiyorum
                    """);

            String secenek = input.nextLine();

            switch (secenek) {
                case "0":
                    System.out.println("Giriş işlemi başarısız.");
                    break;
                case "1":
                    System.out.print("Yeni şifre belirleyiniz: ");
                    yenisifre = input.nextLine();

                    if (yenisifre.equals("emreemre")) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        System.out.println("Şifre oluşturuldu.");
                    }
                    break;
                default:
                    System.out.println("Geçersiz seçenek.");
            }
        }
    }
}

