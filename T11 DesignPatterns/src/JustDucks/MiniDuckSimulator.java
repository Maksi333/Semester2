package JustDucks;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck rocketDuck = new ModelDuck();
        rocketDuck.performFly();
        rocketDuck.setFlyBehavior(new FlyRocketPowered());
        rocketDuck.performFly();
    }
}
