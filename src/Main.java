public class Main {
    public static void main(String[] args) {
        DTwenty d20 = new DTwenty(false, false, true);
        //d20.Message();

        DFour d4= new DFour(true);
        //d4.Message();

        DSix d6= new DSix(false);
        //d6.Message();

        DTen d10=new DTen();
        //d10.Message();

        PercentualDice d100= new PercentualDice();
        //d100.Message();
        PercentualDice d100Wild = new PercentualDice();
        //d100Wild.wildMagic();

        DEigth d8 = new DEigth(false);
        //d8.Message();

        SaveThrow salvezza= new SaveThrow();
       // salvezza.settingSaveRoll();

        DiceRoller diceRoller= new DiceRoller();
        diceRoller.addDice(new DSix(true));
        diceRoller.addDice(new DTwenty(false, false,false));
        diceRoller.addDice(new DTwenty(true, false, false));
        diceRoller.addDice(new DFour(true));
        diceRoller.addDice(new Dtwelve());
        diceRoller.addDice(new PercentualDice());
        diceRoller.addDice(new SaveThrow());
        diceRoller.addDice(new DFour(false));

        diceRoller.rollAll();
        diceRoller.printMessages();
    }

}
