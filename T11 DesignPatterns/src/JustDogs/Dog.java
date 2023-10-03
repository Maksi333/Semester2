package JustDogs;

public abstract class Dog {

    EatingBehavior eatingBehavior;
    BarkingBehavior barkingBehavior;


    public void perfromBark(){
        barkingBehavior.bark();
    }
    public void performEating(){
        eatingBehavior.eat();
    }

    public void setEatingBehavior(EatingBehavior eb){
        eatingBehavior = eb;
    }

    public void setBarkingBehavior(BarkingBehavior bb){
        barkingBehavior = bb;
    }
}
