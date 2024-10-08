import java.util.Random;

public abstract class Dice {
    Random random = new Random();
    private int facce;
    private int result;

    //Super method to override
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

    public int getResult(int result){
       return result;
    }

    public int Roll(){
        return result= 1+random.nextInt(facce);
    }
}
