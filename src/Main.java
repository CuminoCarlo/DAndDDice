public class Main {
    public static void main(String[] args) {
        DTwenty twenty = new DTwenty(false, false, true);
        twenty.Message();

        DFour d4= new DFour(true);
        d4.Message();

        DSix d6= new DSix(false);
        d6.Message();

        PercentualDice d100= new PercentualDice();
        d100.Message();


        DEigth d8 = new DEigth(false);
        d8.Message();
    }


}
