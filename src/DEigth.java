public class DEigth extends Dice{
    public DEigth(){
        super(8); // Passa il numero di facce direttamente al costruttore della superclasse
    }

    // Non è necessario sovrascrivere getFacce() e getResult() se non aggiungi funzionalità extra

    public void Message(){
        int result= Roll();
        System.out.println("Il tuo danno è "+result);
    }
}
