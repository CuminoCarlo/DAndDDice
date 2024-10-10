import java.util.Scanner;

public class SaveThrow{
    private DTwenty d20;
    private Scanner scanner;
    private String type;
    private String mode;

    public SaveThrow(){
        this.d20=new DTwenty(false, false, false);
        this.scanner= new Scanner(System.in);
    }

    public void settingSaveRoll(){
        System.out.println("Inserisci il tipo di tiro salvezza (Forza, Destrezza, " +
                "Costituzione, Intelligenza, Saggezza, Carisma)");
         type=scanner.nextLine();
        System.out.println("Che modalità di tiro vuoi effettuare? (vantaggio, svantaggio o normale)");
        mode=scanner.nextLine();
        scanner.close();
        int result;
        if(mode.equalsIgnoreCase("vantaggio")){
            result= rollWithAdvantage();
            System.out.println("Il tuo tiro salvezza con "+mode+" su "+type+" è "+result);
        } else if (mode.equalsIgnoreCase("svantaggio")) {
            result=rollWithDisadvantage();
            System.out.println("Il tuo tiro salvezza con "+mode+" su "+type+" è "+result);
        } else {
            result=d20.Roll();
            System.out.println("Il tuo tiro salvezza su "+type+" è "+result);
        }

    }

    private int rollWithAdvantage(){ //metodo private perchè richiamato solo da questa classe
        int roll1=d20.Roll();
        int roll2= d20.Roll();
        return Math.max(roll1,roll2);
    }

    private int rollWithDisadvantage(){
        int roll1=d20.Roll();
        int roll2= d20.Roll();
        return Math.min(roll1,roll2);
    }


}
