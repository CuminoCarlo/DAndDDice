import java.util.Scanner;

public class SaveThrow extends DTwenty{
    //private DTwenty d20;
    private Scanner scanner;


    public SaveThrow(){
        super(false,false,false);
        this.scanner= new Scanner(System.in);
    }

    public String message(){
        return settingSaveRoll();
    }

    private String settingSaveRoll(){
        String type=isValidType();
        String mode=isValidMode();
        String message;
        scanner.close();
        int result;
        if(mode.equalsIgnoreCase("vantaggio")){
            result= rollWithAdvantage();
            message="Il tuo tiro salvezza con "+mode+" su "+type+" è "+result;
        } else if (mode.equalsIgnoreCase("svantaggio")) {
            result=rollWithDisadvantage();
            message="Il tuo tiro salvezza con "+mode+" su "+type+" è "+result;
        } else {
            result=Roll();
            message="Il tuo tiro salvezza su "+type+" è "+result;
        }
        return message;
    }

    private int rollWithAdvantage(){ //metodo private perchè richiamato solo da questa classe
        int roll1=Roll();
        int roll2= Roll();
        return Math.max(roll1,roll2);
    }

    private int rollWithDisadvantage(){
        int roll1=Roll();
        int roll2= Roll();
        return Math.min(roll1,roll2);
    }

    private String isValidType(){
        System.out.println("Inserisci il tipo di tiro salvezza (Forza, Destrezza, " +
                "Costituzione, Intelligenza, Saggezza, Carisma)");
        String type =scanner.nextLine().trim();
        while(true) {
            if (type.equalsIgnoreCase("forza") || type.equalsIgnoreCase("destrezza") ||
                    type.equalsIgnoreCase("costituzione") || type.equalsIgnoreCase("intelligenza")
                    || type.equalsIgnoreCase("saggezza")
                    || type.equalsIgnoreCase("Carisma")) {
                break;
            } else {
                System.out.println("Tipo di tiro non valido. Riprova.");
                type=scanner.nextLine().trim();
            }
        }
        return type;
    }

    private String isValidMode(){
        System.out.println("Che modalità di tiro vuoi effettuare? (vantaggio, svantaggio o normale)");
        String mode =scanner.nextLine().trim();
        while(true) {
            if (mode.equalsIgnoreCase("vantaggio") || mode.equalsIgnoreCase("svantaggio") ||
                    mode.equalsIgnoreCase("normale")) {
                break;
            } else {
                System.out.println("Modalità di tiro non valida. Riprova.");
                mode=scanner.nextLine().trim();
            }
        }
        return mode;
    }

}
