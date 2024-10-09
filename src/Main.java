public class Main {
    public static void main(String[] args) {
        DTwenty twenty = new DTwenty();
        twenty.Message();

        DFour d4= new DFour(true);
        d4.Message();


        DEigth d8 = new DEigth();
        d8.Roll();
        d8.Message(d8.getResult());
    }


}
