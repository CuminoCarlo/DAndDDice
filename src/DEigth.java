public class DEigth extends Dice{
    private boolean isMasterWeapon;
    public DEigth(boolean isMasterWeapon){
        super(8); // Passa il numero di facce direttamente al costruttore della superclasse
        this.isMasterWeapon=isMasterWeapon;
    }

    // Non è necessario sovrascrivere getFacce() e getResult() se non aggiungi funzionalità extra

    public void Message(){
        int result= Roll(); //settare result richiamanto direttamente Roll
        String type = isMasterWeapon ? "dado di superiorità" : "danno";
        System.out.println("Il tuo "+type+" è "+result);
    }
}
