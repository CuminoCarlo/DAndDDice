import java.util.Random;

public abstract class Dice {
    Random random;
    private int facce;
    private int result;

    //Super method to override
    public Dice(int facce) {
        this.facce=facce;
        this.random= new Random();
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

    public int getResult(){
       return result;
    }

    public int Roll(){
        return result= 1+random.nextInt(facce);
    }
}
