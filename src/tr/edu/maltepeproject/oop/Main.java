package tr.edu.maltepeproject.oop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double pearKg, appleKg, tomatoKg, bananaKg, eggplantKg;
        double pearPerKg = 2.14, applePerKg = 3.67, tomatoPerKg = 1.11, bananaPerKg = 0.95, eggplantPerKg = 5.00;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the kilograms of pear: ");
        pearKg = input.nextDouble();

        System.out.print("Enter the kilograms of apple: ");
        appleKg = input.nextDouble();

        System.out.print("Enter the kilograms of tomato: ");
        tomatoKg = input.nextDouble();

        System.out.print("Enter the kilograms of banana: ");
        bananaKg = input.nextDouble();

        System.out.print("Enter the kilograms of eggplant: ");
        eggplantKg = input.nextDouble();

        double totalPrice = (pearKg * pearPerKg) + (appleKg * applePerKg) + (tomatoKg * tomatoPerKg) + (bananaKg * bananaPerKg) + (eggplantKg * eggplantPerKg);
        System.out.print("Total Price: " + totalPrice + " TL ");


    }
}
