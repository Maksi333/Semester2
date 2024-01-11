public class ThreadClass extends Thread{

    String dyrelyd;

    public ThreadClass(String dyrelyd){
        super();
        this.dyrelyd = dyrelyd;
    }

    public void run(){
        System.out.println(dyrelyd);
    }
}
