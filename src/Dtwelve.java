public class Dtwelve extends Dice{
    public Dtwelve(){
        super(12);
    }

    public void message(){
        int result= super.Roll(); //settare result richiamanto direttamente Roll
        System.out.println("Il danno della tua arma è: "+result);
    }
}
