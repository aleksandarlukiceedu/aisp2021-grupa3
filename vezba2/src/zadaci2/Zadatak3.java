package zadaci2;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite broj apartmana: ");
        int n = scanner.nextInt();

        double[] apartments = new double[n];

        double sum = 0;
        for (int i = 0; i < apartments.length; i++) {
            System.out.print("Unesite cenu apartmana " + (i+1) + ": ");

            double price = scanner.nextDouble();
            apartments[i] = price;
            sum += price;
        }

        double avgPrice = sum/n;
        System.out.println("Prosecna cena je: " + avgPrice);

        for (int i = 0; i < apartments.length; i++) {
            double diff = apartments[i] - avgPrice;

            if (diff < 0){
                System.out.println("Apartman "+ (i+1) + " je jeftiniji od proseka za " + Math.abs(diff) + "$");
            }
            else{
                System.out.println("Apartman "+ (i+1) + " je skuplji od proseka za " + Math.abs(diff) + "$");
            }
        }
    }
}
