import java.util.Scanner;
public class hipotenus {
    public static void main(String[] args) {

        //int a,b,c;
        double a,b,c;
        Scanner hipotenus = new Scanner(System.in);
        System.out.print("1. Kenar Uzunluğunu Giriniz: ");
        a = hipotenus.nextDouble();

        System.out.print("2. Kenar Uzunluğunu Giriniz: ");
        b = hipotenus.nextDouble();

        System.out.print("3. Kenar Uzunluğunu Giriniz: ");
        c = hipotenus.nextDouble();

        double u = (a + b + c) / 2;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println(" Alan: " + alan);

    }
}
