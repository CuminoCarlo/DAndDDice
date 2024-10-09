public class DTwenty extends Dice{
    private boolean isSkill;
    private boolean isAttack;
    private boolean isInitiative;

    public DTwenty(boolean isSkill, boolean isAttack, boolean isInitiative){
        super(20); //Set the faces
        this.isSkill=isSkill;
        this.isAttack=isAttack;
        this.isInitiative =isInitiative;
    }


    public void Message(){
        int result= Roll();
        String type = "";
        String message;

        if(isSkill){
            type = "tiro abilità";
        } else if  (isAttack){
            type="attacco";
        } else if (isInitiative){
            type="tiro iniziativa";
        } else {
            type="tiro normale";
        }
        message = switch (result) {
            case 1 -> result + "! Fallimento critico su "+type+"!";
            case 20 -> result + "! Complimenti! 20 naturale su +"+type+"!";
            default -> "Il tuo "+type+" è risultato " + result;
        };
        System.out.println(message);
    }
}
