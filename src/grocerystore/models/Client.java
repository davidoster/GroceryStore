/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocerystore.models;

/**
 *
 * @author mac
 */
public class Client extends Human {

    @Override
    public void buy(Product p) {
        System.out.println("Just bought product : " + p);
    }

    @Override
    public void talk(String text) {
        System.out.println(text);
    }
    
}
