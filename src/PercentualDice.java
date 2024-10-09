public class PercentualDice extends Dice{
    public PercentualDice(){
        super(100);
    }

    @Override
    public int getFacce() {
        return super.getFacce();
    }

    @Override
    public int getResult() {
        return super.getResult();
    }

    public void Message(){
        int result= Roll();
        System.out.println("La tua percentuale su questo tiro è: "+getResult());
    }
}
