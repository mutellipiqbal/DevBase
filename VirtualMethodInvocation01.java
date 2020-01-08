public class VirtualMethodInvocation01 {

    /*
    in java, we have virtual method invocation concept.
    in order to use virtual method, the super and subclass method should be static
    there should be inheritance relationships
    we also need polymorphism
     */

    //the below method is very advanced. it directly call the animal instance's feed method.

    public void feedingAnimal(Animal animal){
        animal.feed();
    }

}

// we start virtual method concept here.

abstract class Animal {
    public void feed(){
        System.out.println("feeding animal");

    }
}
class cat extends Animal{

    @Override
    public void feed() {
        addMouse();
    }
    private void addMouse(){
        System.out.println("adding mouse to cat");

    }
}
class Lion extends Animal{

    @Override
    public void feed() {
        addAnimal();
    }
    private void addAnimal(){
        System.out.println("adding animal to lion");

    }

    public static void main(String[] args) {
        Animal animal=new Lion();
        animal.feed();

        // the animal instance call the Lion feed's method instead of calling Animal's feed method.
        //this is what we call virtual method invocation in java.
    }
}
