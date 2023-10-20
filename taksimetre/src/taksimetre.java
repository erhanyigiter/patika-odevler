import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {

        int km, startPrice = 10;
        double total, kmPrice = 2.20;

        Scanner input = new Scanner(System.in);
        System.out.print("Gidilecek mesafeyi (KM) giriniz : ");
        km = input.nextInt();


        total = (km * kmPrice) + startPrice;
        total = (total <20) ? 20 : total;
        System.out.println("Toplam Ücret : " + total);


    }
}
