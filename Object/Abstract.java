package Object;

public class Abstract {
    public static void main(String args[]) {
        Mustang myHorse =new Mustang();
        //Animal -> Horse -> Mustang
       
        // Horse h = new Horse();
        // h.eat();
        // h.walk();

        // // Chicken c = new Chicken();
        // // c.eat();
        // // c.walk();
        // System.out.println(h.color);

    }

}

abstract class Animal {
    String color;

    // constructor
    Animal(){
        System.out.println("animal constructor called");
        //color="brown";
    }

    // non abstract method
    void eat() {
        System.out.println("animal eat");
    }
   // abstract method
    abstract void walk(); // can't make object in this (no implementation in this only it give an idea)
}

class Horse extends Animal {
    Horse(){
          System.out.println("horse constructor called");
    }

    void changeColor(){
        color = "dark brown";    //default it print brown because first it print parents class object not print child class object 
    }

    void walk() {
        System.out.println("walk on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
          System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal {

     void changeColor(){
        color = "Yellow";
    }

    void walk() {
        System.out.println("walk on 2 legs");
    }
}
