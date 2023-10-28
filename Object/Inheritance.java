package Object;

public class Inheritance 
{
    public static void main(String args[])
    {
        Bird birds = new Bird();
        birds.eat();
        birds.fly();
    }
    
}
class Animal
{
    String color;
    
    void eat()
    {
        System.out.println("Eats");
    }

    void breathe()
    {
        System.out.println("breathes");
    }

}
//Derived Class
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("Swim in water");
//     }
//}

//Multiple level inheritance
class Mammals extends Animal
{
    void walk()
    {
        System.out.println("Walks");
    }
}
class Fish extends Animal
{
    void swim()
    {
        System.out.println("Walks");
    }
}
class Bird extends Animal
{
    void fly()
    {
        System.out.println("fly");
    }
}

//  class Dog extends Mammals
//  {
//      String breathe;
//  }