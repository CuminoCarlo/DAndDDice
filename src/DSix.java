public class DSix extends Dice{
    private boolean isDamage;

    public DSix(boolean isDamage){
        super(6);
        this.isDamage=isDamage;
    }

    public boolean isDamage() {
        return isDamage;
    }

    public void setDamage(boolean damage) {
        isDamage = damage;
    }


    public String message() {
        int result = super.Roll();
        String type = isDamage ? "danno" : "ispirazione bardica";
        if (isDamage) {
            return "Il tuo " + type + " è " + result + ".";
        } else {
            return "La tua " + type + " è " + result + ".";
        }

    }
}
