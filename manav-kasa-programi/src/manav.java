import java.util.Scanner;
public class manav {
    public static void main(String[] args) {

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, kg ;

        System.out.println("Merhaba, manavımıza hoşgeldiniz");

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç kilo Armut almak istersiniz ? : ");
        kg = input.nextDouble();
        double total1 = kg* armut;
        System.out.println("Armut fiyatınız: " + total1 + " TL");

        System.out.print("Kaç kilo Elma almak istersiniz ? : ");
        kg = input.nextDouble();
        double total2 = kg* elma;
        System.out.println("Elma fiyatınız: " + total2 + "TL");

        System.out.print("Kaç kilo Domates almak istersiniz ? : ");
        kg = input.nextDouble();
        double total3 = kg* domates;
        System.out.println("Domates fiyatınız: " + total3 + "TL");

        System.out.print("Kaç kilo Muz almak istersiniz ? : ");
        kg = input.nextDouble();
        double total4 = kg* muz;
        System.out.println("Muz fiyatınız: " + total4 + "TL");

        System.out.print("Kaç kilo Patlican almak istersiniz ? : ");
        kg = input.nextDouble();
        double total5 = kg* patlican;
        System.out.println("Patlican fiyatınız: " + total5 + "TL");

        double toplamFiyat = total1 + total2 + total3 + total4 + total5;
        System.out.println("Alışverişiniz toplam ücreti: " + toplamFiyat + "TL Alışverişiniz için teşekkürler  :)");







    }
}
