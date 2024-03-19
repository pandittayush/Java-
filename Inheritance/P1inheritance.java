
import java.util.*;

class Animal{
    public void makeSound(){
        System.out.println("Ooo!!! No");
    }
}
class cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Dog is barking");
        // super.makeSound();
    }
}

public class P1inheritance {
    public static void main(String[] args) {
        Animal a =  new Animal();
        cat c = new cat();
        a.makeSound();
        c.makeSound();
    }
}
