import java.util.Scanner;

public class SaveThrow extends DTwenty{
    //private DTwenty d20;
    private final Scanner scanner;

    enum Mode{ NORMALE, SVANTAGGIO, VANTAGGIO}

    enum Type {FORZA, DESTREZZA, COSTITUZIONE, SAGGEZZA, INTELLIGENZA, CARISMA}


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
        String message = "Il tuo tiro salvezza ";
        scanner.close();
        int result;
        if(mode.equalsIgnoreCase("vantaggio")){
            result= rollWithAdvantage();
            message+="con "+mode+" su "+type+" è "+result;
        } else if (mode.equalsIgnoreCase("svantaggio")) {
            result=rollWithDisadvantage();
            message+="con "+mode+" su "+type+" è "+result;
        } else {
            result=super.Roll();
            message+="su "+type+" è "+result;
        }
        return message;
    }

    private int rollWithAdvantage(){ //metodo private perché richiamato solo da questa classe
        int roll1=super.Roll();
        int roll2= super.Roll();
        return Math.max(roll1,roll2);
    }

    private int rollWithDisadvantage(){
        int roll1=Roll();
        int roll2= Roll();
        return Math.min(roll1,roll2);
    }

//    private String isValidType(){
//        System.out.println("Inserisci il tipo di tiro salvezza (Forza, Destrezza, " +
//                "Costituzione, Intelligenza, Saggezza, Carisma)");
//        String type =scanner.nextLine().trim();
//        while(true) {
//            if (type.equalsIgnoreCase("forza") || type.equalsIgnoreCase("destrezza") ||
//                    type.equalsIgnoreCase("costituzione") || type.equalsIgnoreCase("intelligenza")
//                    || type.equalsIgnoreCase("saggezza")
//                    || type.equalsIgnoreCase("Carisma")) {
//                break;
//            } else {
//                System.out.println("Tipo di tiro non valido. Riprova.");
//                type=scanner.nextLine().trim();
//            }
//        }
//        return type;
//    }

    private String isValidType(){
        System.out.println("Inserisci il tipo di tiro salvezza (Forza, Destrezza, " +
                "Costituzione, Intelligenza, Saggezza, Carisma)");
        Type type = null;
        do {
            String userInput= scanner.nextLine().trim().toUpperCase();
            try {
                type=Type.valueOf(userInput);
            } catch (IllegalArgumentException e) {
                System.err.println("Tipo di tiro non valido. Riprova.");
            }
        } while (type==null);
        return type.name().toLowerCase();
    }
    private String isValidMode(){
        System.out.println("Che modalità di tiro vuoi effettuare? (vantaggio, svantaggio o normale)");
        Mode mode = null;
        do {
            String userInput= scanner.nextLine().trim().toUpperCase();
            try {
                mode=Mode.valueOf(userInput);
            } catch (IllegalArgumentException e) {
                System.err.println("Valore non valido riprova");
            }
        } while (mode==null);
        return mode.name().toLowerCase();
    }

//    private String isValidMode(){
//        System.out.println("Che modalità di tiro vuoi effettuare? (vantaggio, svantaggio o normale)");
//        String mode =scanner.nextLine().trim();
//        while(true) {
//            if (mode.equalsIgnoreCase("vantaggio") || mode.equalsIgnoreCase("svantaggio") ||
//                    mode.equalsIgnoreCase("normale")) {
//                break;
//            } else {
//                System.out.println("Modalità di tiro non valida. Riprova.");
//                mode=scanner.nextLine().trim();
//            }
//        }
//        return mode;
//    }

}
