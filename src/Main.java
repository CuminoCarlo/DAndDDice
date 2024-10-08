//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DTwenty twenty = new DTwenty();
        int r=twenty.Roll();
        twenty.Message(twenty.getResult(r));

        DFour dfour = new DFour();
        int re= dfour.Roll();
        dfour.Message(dfour.getResult(re));

        DEigth d8 = new DEigth();
        int s= d8.Roll();
        d8.Message(d8.getResult(s));

    }


}