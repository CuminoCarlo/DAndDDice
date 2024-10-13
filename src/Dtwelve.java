public class Dtwelve extends Dice{
    public Dtwelve(){
        super(12);
    }

    public String message(){
        int result= super.Roll(); //settare result richiamando direttamente Roll
       return "Il danno della tua arma è: "+result;
    }
}
