package service;

import model.Bread;
import model.FruitVegetables;

import java.util.Scanner;

public class ServiceFruit extends FruitVegetables {
    public static void searchFruit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name: ");
        FruitVegetables fruit = new FruitVegetables();
        fruit.setName(scanner.nextLine());
        if (fruit.getName().equals("Apple")) {
            fruit.setPrice(56);
            System.out.println("Enter amount: ");
            fruit.setQolich(scanner.nextInt());
            int result = fruit.getPrice() * fruit.getQolich();
            System.out.println("Product name: " + fruit.getName() + "\n" + "Price: " +
                    fruit.getPrice() + "\n" + "Amount: " + fruit.getQolich()+" kg");
            System.out.println("Summa: " + fruit.getPrice() + "*" + fruit.getQolich() + "=" + result + " som");
        } else if (fruit.getName().equals("Grape")) {
            System.out.println("Enter amount: ");
            fruit.setQolich(scanner.nextInt());
            fruit.setPrice(70);
            int result = fruit.getPrice() * fruit.getQolich();
            System.out.println("Product name: " + fruit.getName() + "\n" + "Price: " +
                    fruit.getPrice() + "\n" + "Amount: " + fruit.getQolich() + " kg");
            System.out.println("Total: " + fruit.getPrice() + "*" + fruit.getQolich() + "=" + result +
                    " som");

        } else {
            System.out.println("Error");
        }

    }
}