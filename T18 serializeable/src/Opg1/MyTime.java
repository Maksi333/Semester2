package Opg1;

import java.io.Serializable;

public class MyTime implements Serializable {
    private int time = 0;

    public MyTime(int time){
        this.time = time;
    }

    public void increase(){
        time++;
    }
    public void resetTime(){
        time = 0;
    }

    public int getTime(){
        return time;
    }

    @Override
    public String toString() {
        return "MyTime{" +
                "time=" + time +
                '}';
    }
}
