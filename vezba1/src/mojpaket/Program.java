package mojpaket;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite broj od 1-5: ");
        int broj = scanner.nextInt();

        switch (broj){
            case 1:
                System.out.println("Opcija 1");
            case 2:
                System.out.println("Opcija 2");
                break;
            case 3:
                System.out.println("Opcija 3");
                break;
            default:
                System.out.println("Default");
        }
    }
}
