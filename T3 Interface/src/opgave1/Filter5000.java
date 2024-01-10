package opgave1;

public class Filter5000 implements Filter {

    @Override
    public Boolean accept(Mesurable x) {
        if(x.getmesurable() > 5000){
            return true;
        } else {
            return false;
        }
    }
}
