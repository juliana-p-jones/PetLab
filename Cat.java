package io.zipcoder.polymorphism;

public class Cat extends Pet {

    public Cat(String name, String type) {
        super(name, type);
    }

    @Override
        public String speak(){
            return "meow!";
        }
    }
