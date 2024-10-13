import java.util.ArrayList;
import java.util.List;

public class DiceRoller {
    private List<Dice> diceList;
    public DiceRoller(){
        this.diceList= new ArrayList<>();
    }

    public void addDice(Dice dice) {
        diceList.add(dice);
    }

    public List<Integer> rollAll() {
        List <Integer>results = new ArrayList<>(); //ritorna la lista dei risultati
        for (Dice dice : diceList) {
            results.add(dice.Roll());
        }
        return results;
    }

    public void printMessages(){
        for (Dice dice: diceList){
            System.out.println(dice.message());
        }
    }
}
