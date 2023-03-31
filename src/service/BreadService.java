package service;

import model.Bread;

import java.util.Scanner;

public class BreadService extends Bread {
    public static void searchBread() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name: ");
        Bread bread = new Bread();
        bread.setName(scanner.nextLine());

        if (bread.getName().equals("Bread")||bread.getName().equals("bread")) {
            bread.setPrice(40);
            System.out.println("Enter amount: ");
            bread.setQolich(scanner.nextInt());
            int result = bread.getPrice() * bread.getQolich();
            System.out.println("Product name: " + bread.getName() + "\n" + "Price: " +
                    bread.getPrice() +" som"+  "\n" + "Amount: " + bread.getQolich()+" kg");
            System.out.println("Total: " + bread.getPrice() + " * " + bread.getQolich() + " = "
                    + result + " som");
        } else if (bread.getName().equals("cake")||bread.getName().equals("Cake")) {
            System.out.println("Enter amount: ");
            bread.setQolich(scanner.nextInt());
            bread.setPrice(50);
            int result = bread.getPrice() * bread.getQolich();
            System.out.println("Product name: " + bread.getName() + "\n" + "Price: " +
                    bread.getPrice() + "\n" + "Amount: " + bread.getQolich() + " kg");
            System.out.println("Total: " + bread.getPrice() + " * " + bread.getQolich() + " = " + result +
                    " som");

        } else {
            System.out.println("Error");
        }
    }
}