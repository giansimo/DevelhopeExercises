import java.util.ArrayList;
import java.util.Arrays;

public class Dottore {
    private String ID;
    private String nome;
    private String cognome;
    private Specializzazione specializzazione; //
    private int anniEsperienza;
    private String[] pazienti = new String[200]; // null, null, null ........ x200


    // Costruttore
    public Dottore(String ID, String nome, String cognome, Specializzazione specializzazione, int anniEsperienza) {
        this.ID = ID;
        this.nome = nome;
        this.cognome = cognome;
        this.specializzazione = specializzazione;
        this.anniEsperienza = anniEsperienza;
    }

    // null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null
    public void aggiungiPaziente(String pazienteDaAggiungere){
        for (int i=0; i < pazienti.length; i++){ // i=0, 1, 2, 3, 4, 5, 6 ... 199
            // se trovo una posizione libera, aggiungo il paziente
            if (pazienti[i] == null){
                pazienti[i] = pazienteDaAggiungere;
                break;
            }
        }
    }

    public void rimuoviPaziente(String pazienteDaRimuovere){
        for (int i=0; i < pazienti.length; i++){ // i=0, 1, 2, 3, 4, 5, 6 ... 199
            // se trovo il paziente da rimuovere, allora  risetto lo slot i-esimo a null (lo rendo nuovamente disponibile)
            if (pazienti[i] != null && pazienti[i].equals(pazienteDaRimuovere)){
                pazienti[i] = null;
            }
        }
    }

    public ArrayList<String> ricercaPaziente(String inputToSearch){  // inputToSearch = "Michele", "Marco", "Michele Verdi"
        ArrayList<String> pazientiTrovati = new ArrayList<>();
        for(int i=0; i < pazienti.length; i++){ // i=0, 1, 2, 3, 4, 5, 6 ... 199
            if (pazienti[i] != null && pazienti[i].contains(inputToSearch)){
                pazientiTrovati.add(pazienti[i]);
            }
        }
        return pazientiTrovati;
    }

    public int calcolaPazientiEffettivi(){
        int pazientiEffettivi = 0;
        for(int i=0; i < pazienti.length; i++){ // i=0, 1, 2, 3, 4, 5, 6 ... 199
            if (pazienti[i] != null){
                pazientiEffettivi++;
            }
        }
        return pazientiEffettivi;
    }
    public static void exampleStaticMethod(){
        System.out.println("Questo è un metodo statico");
    }

    @Override
    public String toString() {
        return "Dottore{" +
                "ID='" + ID + '\'' +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", specializzazione='" + specializzazione + '\'' +
                ", anniEsperienza=" + anniEsperienza +
                ", pazienti=" + Arrays.toString(pazienti) +
                '}';
    }

    // getter and setter
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Specializzazione getSpecializzazione() {
        return specializzazione;
    }

    public void setSpecializzazione(Specializzazione specializzazione) {
        this.specializzazione = specializzazione;
    }

    public int getAnniEsperienza() {
        return anniEsperienza;
    }

    public void setAnniEsperienza(int anniEsperienza) {
        this.anniEsperienza = anniEsperienza;
    }

    public String[] getPazienti() {
        return pazienti;
    }

    public void setPazienti(String[] pazienti) {
        this.pazienti = pazienti;
    }
}
