package Object;

public class Super {
    public static void main(String args[]) {
        Horse h = new Horse();
        System.out.println(h.color);

    }

}

class Animal {
    String color;
    Animal() {
        System.out.println("animal constructor is called");
    }

}

class Horse extends Animal{
    Horse() {
        super.color="brown";    //java called dy default super class
        System.out.println("horse constructor is called");
    }
}