public class DTwenty extends Dice{

    int result;

    public DTwenty(){
        super();
        setFacce(20);
    }

    @Override
    public int getFacce() {
        return super.getFacce();
    }

    @Override
    public int getResult(int result) {
        return super.getResult(result);
    }

    public void Messagge(int result){
        String message;

        message = switch (result) {
            case 1 -> result + "! Fallimento critico";
            case 20 -> result + "! Complimenti! 20 naturale!";
            default -> "Il tuo risultato è " + result;
        };
        System.out.println(message);
    }
}
