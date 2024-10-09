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

    public int Roll(){
        int result = super.Roll();
        this.setResult(result);
        return result;
    }

    public void Message(){
        int result= Roll();
        System.out.println("La tua percentuale su questo tiro è: "+result);
    }

    public void wildMagic(){
        int result= Roll();
        System.out.println("Il tuo tiro sulla magia selvaggia è: "+result);
        String effect = "Effetto: ";
        if (result <= 10){
            effect+="Esplosione di fuoco";
        } else if (result <= 20) {
            effect+="Trasformazione in pecora";
        } else if (result <=30) {
            effect+="Crescita di una barba di piume";
        } else if (result <=40) {
            effect +="Teletrasporto casuale";
        } else if (result <= 50) {
            effect +="Guarigione improvvisa";
        } else {
            effect ="Nessun effetto in particolare";
        }
        System.out.println(effect);
    }
}
