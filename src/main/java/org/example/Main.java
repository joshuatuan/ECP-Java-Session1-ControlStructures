package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
membership "Regular", the price is $50 for users under 18, $100 for users aged 18 to 64, and $75 for users over 64.
membership "VIP", the price is $75 for users under 18, $150 for users aged 18 to 64, and $112.5 for users over 64.
membership "Premium", the price is $100 for users under 18, $200 for users aged 18 to 64, and $150 for users over 64.
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter membership status (Regular, VIP, premium): ");
        String membership = scanner.next().toLowerCase();

        float price = 0.0f;

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        if (membership.equals("regular")) {
            if (age < 18) { // below 18
                price = 50;
            } else if (age >= 18 && age <= 64) { // between 18 and 64
                price = 100;
            } else { // over 64
                price = 75;
            }
        } else if (membership.equals("vip")) {
            if (age < 18) {
                price = 75;
            } else if (age >= 18 && age <= 64) {
                price = 150;
            } else {
                price = 112.5f;
            }
        } else if (membership.equals("premium")) {
            if (age < 18) {
                price = 100;
            } else if (age >= 18 && age <= 64) {
                price = 200;
            } else {
                price = 150;
            }
        } else {
            System.out.println("Invalid membership status entered.");
        }
        String formattedPrice = String.format("%.2f", price);
        System.out.print("Price: $" + formattedPrice);
    }
}