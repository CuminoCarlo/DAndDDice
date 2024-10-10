# D&DDice
Questo progetto è una simulazione del lancio di vari tipi di dadi utilizzati nei giochi di ruolo, come Dungeons & Dragons. Il codice è stato implementato e migliorato con l'aiuto di un'intelligenza artificiale (AI).

## Funzionalità

- **Dadi Supportati**: D4, D6, D8, D20, D100
- **Tipi di Lancio**:
  - D6: Danni e Ispirazione Bardica
  - D8: Danni e Dadi di Superiorità del Battlemaster
  - D10: Danni da armi inastate, armi versatili a due mani e danni da truchetti (dardo di fuoco e deflagrazione)
  - D12: Danni da armi pesanti (ascia pesante)
  - D20: Tiri di Abilità, Attacchi e Iniziativa
  - D100: Tiri Percentuali e Magia Selvaggia
  - D20 - Tiro salvezza: Per i tiri salvezza su carisma, costituzione ecc...
  - Tiro multiplo: per tirare più dadi insieme


## Struttura del Progetto

- `Dice.java`: Classe astratta base per tutti i dadi
- `DSix.java`: Classe per il dado a 6 facce (D6)
- `DEight.java`: Classe per il dado a 8 facce (D8)
- `DTen.java`: Classe per il dado a 10 facce (D10)
- `DTwelve.java`: Clsse per il dado a 12 facce (D12)
- `DTwenty.java`: Classe per il dado a 20 facce (D20)
- `PercentualDice.java`: Classe per il dado percentuale (D100)
- `SaveThrow.java`: Classe per i tiri salvezza
- `DiceRoller.java`: Classe per creare una lista di dadi tirati insieme

## Utilizzo

### Prerequisiti

- Java 8 o superiore


### Esecuzione del Progetto

1. **Compilazione**:
   ```sh
   javac *.java
2. **Esecuzione**:
    ```sh
   java Main

### Contributi
Questo progetto è stato sviluppato e migliorato con l’aiuto di un’intelligenza artificiale (AI). Se desideri contribuire, sentiti libero di fare una fork del repository e inviare una pull request.

### Contatti
Per qualsiasi domanda o suggerimento, puoi contattarmi all’indirizzo email: ccumino89@gmail.com