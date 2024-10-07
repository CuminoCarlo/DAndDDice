//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DTwenty twenty = new DTwenty();
        int r=twenty.Roll();
        twenty.D20Messagge(twenty.getResult(r));

        DEigth d8 = new DEigth();
        int s= d8.Roll();
        d8.D8Messagge(d8.getResult(s));

    }


}