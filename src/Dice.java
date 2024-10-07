import javax.xml.transform.Result;
import java.util.Random;

public class Dice {
    Random random = new Random();
    private int facce;
    private int result;

    public Dice() {

    }

    public void setFacce(int facce) {
        this.facce = facce;
    }

    public int getFacce() {
        return facce;
    }

    public void setResult(int result){
        this.result=result;
    }

    public int getResult(int facce){
        return result = 1+random.nextInt(facce);
    }


}
