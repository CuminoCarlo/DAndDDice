public class DTen extends Dice {
    public DTen(){
        super(10);
    }


    @Override
    public String message() {
        int result=super.Roll();
        return "Il danno è "+result;
    }
}


