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
public class GroceryStore extends Building {
    private String name;
    final int STARTHOURSHIFT = 9;
    final int ENDHOURSHIFT = 17;
    
    public GroceryStore() {
        super();
        System.out.println("My Grocery Store " + name + " has just created!");
    }
    
    public GroceryStore(String name) {
        super();
        this.name = name;
        System.out.println("My Grocery Store " + this.name + " has just created!");
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void startShift() {
        System.out.println("Shift has just started, time is : " + STARTHOURSHIFT);
    };
    
    public void endShift() {
        System.out.println("Shift has just ended, time is : " + ENDHOURSHIFT);
    };

    
}
