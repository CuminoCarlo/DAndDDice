public class DEigth extends Dice{
    private boolean isMasterWeapon;
    public DEigth(boolean isMasterWeapon){
        super(8); // Passa il numero di facce direttamente al costruttore della superclasse
        this.isMasterWeapon=isMasterWeapon; //Per determinare la superiorità del battle master
    }

    // Non è necessario sovrascrivere getFacce() e getResult() se non aggiungi funzionalità extra

    public String  Message(){
        int result= super.Roll(); //settare result richiamanto direttamente Roll
        String type = isMasterWeapon ? "dado di superiorità" : "danno";
        return "Il tuo "+type+" è "+result;
    }
}
