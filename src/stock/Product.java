/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stock;

/**
 *
 * @author kevinesteff
 */
public class Product {
    
    //attributes
    public String name;
    public double price;
    public int quantity;
    
    // return the total value of the entire stock of one product.
    //methods
    public double totalValueInStock(){
        return price * quantity;
    }
    
    
    // add a product and sum to the previous total number of product.
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    
    // remove a product and subtract from the previous total number of product.
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    
    
    public String toString(){
        //return and print the stock info
        return name
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " unit(s), Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
    
    
}


