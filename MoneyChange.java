import java.util.Scanner;

public class MoneyChange {
    public static void main(String[] args) {
        final float RATE = 23000;
        double usd, vnd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien USD: ");
        usd = sc.nextDouble();
        vnd = usd*RATE;
        System.out.printf("%.2f USD bang %.2f VND", usd, vnd);
    }
}
