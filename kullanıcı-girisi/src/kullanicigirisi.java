import java.util.Scanner;

public class kullanicigirisi {
    public static void main(String[] args) {
        // Kullanıcı adı ve şifre bilgileri
        String kullaniciAd = "kodluyoruz";
        String dogruSifre = "123456";
        String unutulanSifre= "";

        // Kullanıcıdan kullanıcı adı ve şifre bilgilerini al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcı Adı: ");
        String girilenKullaniciAd = scanner.nextLine();
        System.out.print("Şifre: ");
        String girilenSifre = scanner.nextLine();

        // Kullanıcı adını kontrol et
        if (girilenKullaniciAd.equals(kullaniciAd)) {
            // Kullanıcı adı doğruysa şifreyi kontrol et
            if (girilenSifre.equals(dogruSifre)) {
                System.out.println("Giriş başarılı.");
            } else {
                System.out.println("Şifre hatalı.");

                // Şifre sıfırlama işlemi
                System.out.print("Şifrenizi sıfırlamak ister misiniz? (E/H): ");
                String sifreSifirla = scanner.nextLine();

                if (sifreSifirla.equalsIgnoreCase("E")) {
                    System.out.print("Yeni Şifre: ");
                    String yeniSifre = scanner.nextLine();

                    // Yeni şifrenin eski şifre veya unutulan şifre ile aynı olup olmadığını kontrol et
                    if (!yeniSifre.equals(dogruSifre) && !yeniSifre.equals(unutulanSifre)) {
                        System.out.println("Şifre oluşturuldu.");
                    } else {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz. (Şifreniz eski şifreniz ile aynı olamaz)");
                    }
                }
            }
        } else {
            System.out.println("Kullanıcı adı hatalı. Şifre sıfırlama için kullanıcı adı doğru olmak zorunda!");
        }
    }
}
