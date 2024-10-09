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

    public void MessageBonus(int result){
        System.out.println("Il tuo bonus è "+result);
    }

    public void MessageDanno(int result){
        System.out.println("Il tuo danno è "+result);
    }
}
