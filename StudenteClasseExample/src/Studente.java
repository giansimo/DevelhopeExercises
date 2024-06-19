public class Studente extends Persona{
    // attributi
    private String materiaPreferita;


    // costruttori
    public Studente(String nome, String cognome) {
        super(nome, cognome);   //invoca il costruttore della classe padre "Persona"
    }

    public Studente(String nome, String cognome, String materiaPreferita) {
        super(nome, cognome);   //invoca il costruttore della classe padre "Persona"
        this.materiaPreferita = materiaPreferita;
    }

    public Studente(String nome, String cognome, String luogoDiNascita, int annoDiNascita) {
        //invoca il costruttore della classe padre "Persona"
        super(nome, cognome, luogoDiNascita, annoDiNascita);
    }

    // getter and setter
    public String getMateriaPreferita() {
        return materiaPreferita;
    }

    public void setMateriaPreferita(String materiaPreferita) {
        this.materiaPreferita = materiaPreferita;
    }
}
