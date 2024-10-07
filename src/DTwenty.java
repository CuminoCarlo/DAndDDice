public class DTwenty extends Dice{
    public DTwenty(){
        super();
        setFacce(20);
    }

    public void D20Messagge(int result){
        String message;

        message = switch (result) {
            case 1 -> result + "! Fallimento critico";
            case 20 -> result + "! Complimenti! 20 naturale!";
            default -> "Il tuo risultato è " + result;
        };
        System.out.println(message);
    }
}
