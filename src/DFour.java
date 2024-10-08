public class DFour extends Dice {
    public DFour(){
        super();
        setFacce(4);
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
        String message= "Il tuo bonus è "+result;
        System.out.println(message);
    }
}
