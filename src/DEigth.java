public class DEigth extends Dice{

    public DEigth(){
        super();
        setFacce(8);
    }

    public void D8Messagge(int result){
        String messagge= "Il tuo danno è "+result;
        System.out.println(messagge);
    }
}
