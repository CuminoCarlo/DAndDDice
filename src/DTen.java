public class DTen extends Dice {
    public DTen(){
        super(10);
    }

    public int Roll(){
        int result = super.Roll();
        this.setResult(result);
        return result;
    }

    @Override
    public void Message() {
        super.Message();
    }
}


