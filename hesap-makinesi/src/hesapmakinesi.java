import java.util.Scanner;
public class hesapmakinesi {
    public static void main(String[] args) {
        int n1,n2,select;

        System.out.println("Merhaba Hoşgeldiniz. Başlamak için lütfen ");
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("Yapmak istediğiniz işlemi seçiniz: \n1. Toplama ( + ) \n2. Çıkarma ( - )\n3. Çarpma ( * ) \n4. Bölme ( / )");
        select = input.nextByte();

        switch (select) {
            case 1:
                System.out.println("Toplama sonucunuz: " + ( n1 + n2 ));
                    break;
            case 2:
                System.out.println("Çıkarma sonucunuz: " + ( n1 - n2 ));
                    break;
            case 3:
                System.out.println("Çarpma sonucunuz: " + ( n1 * n2 ));
                    break;
            case 4:
                System.out.println("Bölme sonucunuz: " + ( n1 / n2 ) );
                break;
            case 5:
                System.out.println("Hatalı bir tuşlama yaptınız! Lütfen sadece 4 işlemden birini seçiniz.");
        }
        System.out.println("Programımız bitmiştir ilginiz için teşekkür ederiz.");


    }
}
