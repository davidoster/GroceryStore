/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocerystore;

import grocerystore.models.GroceryStore;
import grocerystore.models.Potatoe;
import grocerystore.models.Product;
import grocerystore.models.Vegetable;

/**
 *
 * @author mac
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        create Building
        create a GroceryStore extends Building
        create Human
        create Owner extends Human
        create Client extends Human
        create Product
        create Vegetable extends Product
        create Dairy extends Product
        create Potato extends Vegetable
        create Tomatoe extends Vegetable
        */
        GroceryStore gs = new GroceryStore("Fresh Vegetables");
        Product p1 = new Product("Potatoe", 20.0f);
//        Product p2a = new Vegetable();
//        Product p2 = new Vegetable("Potatoe", 20.0f);
        Product p3 = new Potatoe();
        
        
        
        
    }
    
}
