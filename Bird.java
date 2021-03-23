package io.zipcoder.polymorphism;

public class Bird extends Pet {
    public Bird(String name, String type) {
        super(name, type);
    }
    @Override
    public String speak(){
        return "chirp chirp!";
    }
}
