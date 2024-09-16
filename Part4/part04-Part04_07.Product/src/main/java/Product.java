/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabri
 */
public class Product {
    private String name;
    private int quantity;
    private double price;
    
    public Product(String initialName, double initialPrice, int initialQuantity){
        name = initialName;
        quantity = initialQuantity;
        price = initialPrice;
    }
    
    public void printProduct(){
        System.out.println(name + ", price " + price + ", " + quantity + " pcs");
    }
    
}
