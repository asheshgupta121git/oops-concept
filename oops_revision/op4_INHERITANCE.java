package oops_revision;
// import oops_revision.*;
public class op4_INHERITANCE {
    public static void main(String[] args) {
        //object of fish
        // Fish nemo= new Fish();
        // nemo.eat();

        // Dog pug = new Dog();
        // pug.eat();
        // pug.legs = 4;
        // System.out.println(pug.legs);
        // Peacock peco = new Peacock();
        // peco.eat();


    }
    
}

//base class/ parents class
class Animal{
    //property of animal
    String color;
    //functions of animal
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breaths");
    }
}

class Mammels extends Animal{
    // int legs;
    void walk(){
        System.out.println("walks");
    }
}

class Reptyle extends Animal{
    // int legs;
    void rengna(){
        System.out.println("reganing");
    }
}

class Bird extends Animal{
    // int legs;
    void fly(){
        System.out.println("flies");
    }
}

// //derived class/ child class
class Fish extends Animal{
    //property of fish
    int fins;

    //function of fish
    void swim(){
        System.out.println("swims");
    }
}


class Dog extends Mammels{
    String breed;
}

class Cat extends Mammels{
    String color;
}
class Human extends Mammels{
    String legs;
}

class Peacock extends Bird{
    String wings;
}
class Tuna extends Fish{
    String size;
}
class Shark extends Fish{
    String teeth;
}