package ba.unsa.etf;

import java.util.Scanner;

public class Main {

    private static int sumaCifara(int n) {
        int suma = 0;
        while (n > 0) {
            suma += n % 10;
            n /= 10;
        }

        return suma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite broj n: ");
        int n = scanner.nextInt();

        System.out.println("Brojevi izmedju 1 i n koji su djeljivi sa sumom svojih cifara su: ");
        for (int i = 1; i < n; i++) {
            if (i % sumaCifara(i) == 0) {
                System.out.println(i);
            }
        }
    }
}
