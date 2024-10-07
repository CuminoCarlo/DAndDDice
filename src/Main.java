//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Dice six=new Dice(6);
        //System.out.println(six.Result(six.getFacce()));

       Dice twenty=new Dice(20);
       int result= twenty.getResult(twenty.getFacce());

       twenty.D20Messagge(twenty.getFacce(),result);;



    }


}