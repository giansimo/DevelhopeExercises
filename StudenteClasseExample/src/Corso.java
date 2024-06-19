public class Corso {
    // Attributi
    private Studente[] studenti = new Studente[20]; //["Gianpaolo", "null", null, null, null, null...x20 volte]
    private String nome;
    private String topic;

    // Costruttori
    public Corso(String nome, String topic) {
        this.nome = nome;
        this.topic = topic;
    }

    public Corso(String nome, String topic, Studente[] studenti) {
        this.nome = nome;
        this.topic = topic;
        this.studenti = studenti;
    }

    // metodi
    public void addStudente(Studente studente){
        for (int idx = 0; idx < studenti.length ; idx++) {
            if (studenti[idx] == null){
                studenti[idx] = studente;
                break;
            }
        }
    }

    public Studente removeStudente(Studente studente){
        //TODO
        return null;
    }

    // Setter and getter
    public Studente[] getStudenti() {
        return studenti;
    }

    public void setStudenti(Studente[] studenti) {
        this.studenti = studenti;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
