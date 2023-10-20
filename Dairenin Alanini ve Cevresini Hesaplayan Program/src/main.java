import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        int r;
        double pi = 3.14, a;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz: ");
        r = input.nextInt();

        System.out.print("Merkez açısının ölçüsünü giriniz: ");
        a = input.nextDouble();
        double radians = Math.toRadians(a); //merkez açısı olan "a" değerimizi radyan cinsine çevirdik

        double alan  =  pi * r * r;
        System.out.println("Daire alanı: " + alan  );
        double daireDilimi =  (pi * ( r * r) * a /360);
        System.out.println("Daire dilimi: " + daireDilimi);
        double dairecevresi =  2 * pi * r ;
        System.out.println("Daire çevresi: " + dairecevresi);


    }
}
