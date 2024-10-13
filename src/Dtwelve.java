public class Dtwelve extends Dice{
    public Dtwelve(){
        super(12);
    }

    public String message(){
        int result= super.Roll(); //settare result richiamanto direttamente Roll
       return "Il danno della tua arma è: "+result;
    }
}
