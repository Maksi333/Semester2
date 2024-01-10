package opgave2;

public abstract class Dog  {

    BarkinBehavior barkingbehavior;
    EatingBehavior eatingBehavior;
    FlyingBehavior flyingBehavior;


    public void setBarkingbehavior(BarkinBehavior barkingbehavior) {
        this.barkingbehavior = barkingbehavior;
    }

    public void setEatingBehavior(EatingBehavior eatingBehavior) {
        this.eatingBehavior = eatingBehavior;
    }

    public void setFlyingBehavior(FlyingBehavior flyingBehavior) {
        this.flyingBehavior = flyingBehavior;
    }

    public void performFly(){
        flyingBehavior.flyingBehavior();
    }

    public void performBark(){
        barkingbehavior.barking();
    }
    public void performEat(){
        eatingBehavior.eating();
    }
}
