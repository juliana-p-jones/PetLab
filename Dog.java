package io.zipcoder.polymorphism;

public class Dog extends Pet {
    public Dog(String name, String type) {
        super(name, type);
    }
    @Override
    public String speak(){
        return "woof woof!";
    }
}
