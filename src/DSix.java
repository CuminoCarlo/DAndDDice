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


    public void Message() {
        int result = super.Roll();
        String type = isDamage ? "danno" : "ispirazione bardica";
        if (isDamage) {
            System.out.println("Il tuo " + type + " è " + result + ".");
        } else {
            System.out.println("La tua " + type + " è " + result + ".");
        }
    }
}
