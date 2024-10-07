import javax.xml.transform.Result;
import java.util.Random;

public class Dice {
    Random random = new Random();
    private int facce;
    private int result;

    public Dice(int s){
        facce=s;
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

    public void D20Messagge(int facce, int result){
        String message;
        if (facce == 20) {
            message = switch (result) {
                case 1 -> result + "! Fallimento critico";
                case 20 -> result + "! Complimenti! 20 naturale!";
                default -> "Your value is " + result;
            };
            System.out.println(message);
        }

    }
}
