public class DFour extends Dice {
    private boolean isBonus;

    public DFour(boolean isBonus){
        super(4);
        this.isBonus=isBonus;
    }

    public boolean isBonus(){
        return isBonus;
    }

    public void setBonus(boolean bonus) {
        this.isBonus = bonus;
    }

    public int Roll(){
        int result = super.Roll();
        this.setResult(result);
        return result;
    }

    public void Message(){
        int result= Roll();
        String type = isBonus ? "bonus" : "danno";
        System.out.println("Il tuo "+type+" è "+ result+".");
    }


}
