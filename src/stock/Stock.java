/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stock;

import java.util.Scanner;

/**
 *
 * @author kevinesteff
 */
public class Stock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        
        //creating a new product
        Product product = new Product();
        
        System.out.println("Enter product data");
        
        //ask user the product name
        System.out.print("Product name: ");
        product.name = sc.nextLine();
        
        // ask user the product price
        System.out.print("Product price: ");
        product.price = sc.nextDouble();
        
        // ask user the total quantity in stock
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();
        
        // skip a line
        System.out.println();
        
        // output the info for user. Product name, price, units and total value.
        System.out.println(product);
        System.out.println();
        
        //adding products and update the total value
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        //updated output
        System.out.println("Updated data: "+ product);
        System.out.println();
        
        // removing products and update the total value
        System.out.println("Enter the number of products to be removed from the stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        //updated output
        System.out.println("Updated data: "+ product);
        
        
        
        // closing the scanner
        sc.close();
        
    }
    
}
