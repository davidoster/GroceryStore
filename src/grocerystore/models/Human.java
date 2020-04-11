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
public abstract class Human implements HumanInterface {
    private String name;
    private float age;

    public Human() {}
    
    public Human(String name) {
        this.name = name;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", age=" + age + '}';
    }
}
