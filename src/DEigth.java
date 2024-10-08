public class DEigth extends Dice{
    public DEigth(){
        super();
        setFacce(8);
    }

    @Override
    public int getFacce() {
        return super.getFacce();
    }

    @Override
    public int getResult(int result) {
        return super.getResult(result);
    }

    public void Message(int result){
        String message= "Il tuo danno è "+result;
        System.out.println(message);
    }
}
