package io.zipcoder.polymorphism;
public abstract class Pet {

    //ivars - Global Variables
    public String name, type;

    //Constructor same name as class
    public Pet(String name, String type){
        this.name = name;
        this.type = type;
    }


    //getter
    public String getType(){
        return type;
    }

    //getter
    public String getName(){
        return name;
    }



    //Method
    public abstract String speak();

    class Dog extends Pet {

        public Dog(String name, String type) {
            super(name, type);
        }
        @Override
        public String speak(){
            return "woof";
        }
    }
    class Bird extends Pet {

        public Bird(String name, String type) {
            super(name, type);
        }
        @Override
        public String speak() {
            return "cockadoodledooo";
        }
    }

}


