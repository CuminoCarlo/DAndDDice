public class PercentualDice extends Dice{
    public PercentualDice(){
        super();
        setFacce(99);
    }

    @Override
    public int getFacce() {
        return super.getFacce();
    }

    public int getResult(int result) {
        return super.getResult(result);
    }

    public void Message(int result){
        System.out.println("La tua percentuale su questo tiro è: "+result);
    }
}
