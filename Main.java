package io.zipcoder.polymorphism;

//imports
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //initiate code w/ psvm
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! How many pets do you have?");
        int numberOfPets = scanner.nextInt();

        //Exit code if no pets
            if(numberOfPets == 0){
                System.out.println("Pets aren't for everyone. Bye!");
                return;
            }

//        creating string array, set length to numberOfPets, loop through, ask for name of each
        String[] nameOfPets = new String[numberOfPets];
        for (int x = 0; x < numberOfPets; x++){
            System.out.println("What is your pet's name?");
            String name = scanner.next();
            nameOfPets[x] = name;
        }
//        creating string array, set length to #ofPets, loop through ask for name of each in order
        String[] typeOfPets = new String[numberOfPets];
        for (int x = 0; x < numberOfPets; x++){
            System.out.println("What kind of pet is pet " + (x+1) + " ?");
            typeOfPets[x] = scanner.next();
//            typeOfPets.add(type);
        }

        //Create an array list called pets, this is
        // checking our previous string arrays for type like "bird"
        // to create new bird objects to add to pets array list, then
        //assigning the type it's corresponding name according to element position

        ArrayList<Pet> pets = new ArrayList<>(); // be used later to hold pets
        for (int x = 0; x < typeOfPets.length; x++){
            if (typeOfPets[x].equalsIgnoreCase("bird")){
                pets.add(new Bird(nameOfPets[x], typeOfPets[x]));
            } else if (typeOfPets[x].equalsIgnoreCase("dog")){
                pets.add(new Dog(nameOfPets[x], typeOfPets[x]));
            } else if (typeOfPets[x].equalsIgnoreCase("cat")){
                pets.add(new Cat(nameOfPets[x], typeOfPets[x]));
            }
        }
        //my for each loop
        for (Pet pet : pets){ // for each pet inside of pets do xyz
            System.out.println(pet.getName() + " says: " + pet.speak());
        }
    }
}

// Steps:
// Need to collect int #ofpets
// Need to collect names in String[]- loop until all names have been collected
// Need to collect types in String[]- loop til all types have been collected
// Create Pet Class, assign Pet (name, type). Create Pet method speak.
// Create Bird, Dog, Cat subclasses. They need constructors. Override the speak method w what each animal should say
// Loop through pet types to find keywords. if keyword is found, add this new object (pets.add) (with corresponding name, type) to pets array list
// Do this for each type using else if
// Loop through arraylist pets, print their name and what each would say
// Name says .speak()!

///Users/julianajones/IdeaProjects/petlab/src/main/java/io/zipcoder/polymorphism