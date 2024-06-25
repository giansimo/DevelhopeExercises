import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Contatto contatto1 = new Contatto("Gianpaolo", "Simone",
                "+39333333333", Tipologia.PERSONALE);
        Contatto contatto2 = new Contatto("Gianpaolo", "Bianchi",
                "+39333333334", Tipologia.LAVORO);
        Contatto contatto3 = new Contatto("Marco", "Rossi",
                "+39333333335", Tipologia.AMICI_STRETTI);
        Contatto contatto4 = new Contatto("Michele", "Verdi",
                "+39333333336", Tipologia.PERSONALE);
        Contatto contatto5 = new Contatto("Francesca", "Arancione",
                "+39333333337", Tipologia.LAVORO);

        Rubrica rubrica = new Rubrica();
        rubrica.aggiungiContatto(contatto1);
        rubrica.aggiungiContatto(contatto4);
        rubrica.aggiungiContatto(contatto3);
        rubrica.aggiungiContatto(contatto2);
        rubrica.aggiungiContatto(contatto5);

        rubrica.stampaRubrica();
        System.out.println("---------------------------------------");

        Contatto[] contattiTrovati = rubrica.ricercaContattiPerNome("Gianpaolo");
        System.out.println(Arrays.toString(contattiTrovati));

        System.out.println("---------------------------------------");


        Contatto contattoTrovato = rubrica.ricercaContattoPerNome("Marco");
        rubrica.rimuoviContatto(contattoTrovato);

        rubrica.stampaRubrica();

        System.out.println("---------------------------------------");

        Contatto nuovoContattoDopoCancellazione = new Contatto("Guarda dove sono finito", "Sono qui",
                "+39333333337", Tipologia.LAVORO);
        rubrica.aggiungiContatto(nuovoContattoDopoCancellazione);
        rubrica.stampaRubrica();


    }
}