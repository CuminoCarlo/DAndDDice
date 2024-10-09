public class Dtwelve extends Dice{
    public Dtwelve(){
        super(12);
    }

    @Override
    public int Roll(){
        int result = super.Roll();
        this.setResult(result);
        return result;

    }

    public void message(){
        int result= Roll(); //settare result richiamanto direttamente Roll
        System.out.println("Il danno della tua arma è: "+result);
    }
}
