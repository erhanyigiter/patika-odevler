import  java.util.Scanner;
public class etkinlik {
    public static void main(String[] args) {

    int sicaklik;

    Scanner input = new Scanner(System.in);
    System.out.print("Sıcaklık giriniz: ");
    sicaklik  = input.nextInt();

    switch (sicaklik){
        case 1:
        case 2:
        case 3:
        case 4:
            System.out.println("Kayak yapabilirsiniz");
            break;
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        case 11:
        case 12:
        case 13:
        case 14:
            System.out.println("Bugün sinemaya gitmek güzel olabilir");
            break;
        case 15:
        case 16:
        case 17:
        case 18:
        case 19:
        case 20:
        case 21:
        case 22:
        case 23:
        case 24:
            System.out.println("Bu hava da piknik fena olmazdı");
            break;
        default:
            System.out.println("Çok sıcak denize gitmelisin");

    }

    }
}
// Hoca farklı bir yapı ile ödevi yapın dediği için böyle yaptım. Yoksa if else yapısı ile daha kolay olabilirdi.
