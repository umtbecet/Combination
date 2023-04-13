import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, r;
        Scanner input = new Scanner(System.in);

        System.out.print("C(n,r) kombinasyonundan n sayısını giriniz : ");
        n = input.nextInt();

        System.out.print("C(n,r) kombinasyonundan r sayısını giriniz : ");
        r = input.nextInt();
        int nR = n - r;
        int sumN = 1;
        int sumR = 1;
        int sumNR = 1;
        for (int i = 1; i <= n; i++) {
            sumN = sumN * i;
        }

        for (int j = 1; j <= r; j++) {
            sumR = sumR * j;
        }

        for (int k = 1; k <= nR; k++) {
            sumNR = sumNR * k;
        }

        int total = sumN / (sumR * sumNR);

        System.out.print("Kombinasyon hesabı sonucu : " + total);

    }
}