public class DTen extends Dice {
    public DTen(){
        super(10);
    }


    @Override
    public void Message() {
        int result=super.Roll();
        System.out.println("Il danno è "+result);
    }
}


