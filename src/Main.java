public class Main {
    public static void main(String[] args) {
        DTwenty twenty = new DTwenty();
        int r=twenty.Roll();
        twenty.Message(twenty.getResult(r));

        DFour dfour = new DFour();
        int re= dfour.Roll();
        dfour.MessageBonus(dfour.getResult(re));
        dfour.MessageDanno(dfour.getResult(re));

        DEigth d8 = new DEigth();
        int s= d8.Roll();
        d8.Message(d8.getResult(s));

    }


}
