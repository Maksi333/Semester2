package Opgave3;

public class Foreman extends Person {
    public double tillæg;
    public int årForUdnævnelse;

    public Foreman(double tillæg, int årForUdnævnelse){
        super(name,adress);
        this.tillæg = tillæg;
        this.årForUdnævnelse = årForUdnævnelse;
    }
}
