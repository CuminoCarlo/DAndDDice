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

    public void Message(){
        int result= Roll();
        String type = isBonus ? "bonus" : "danno";
        System.out.println("Il tuo "+type+" è "+ result+".");
    }


}
