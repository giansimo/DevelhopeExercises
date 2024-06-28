import java.util.Arrays;

public class SettoreOspedaliero {
    private String identificativo;
    private String nome;
    private Dottore[] dottori = new Dottore[50]; // Object 1, Object 2....
    private int numeroDottoriPresenti = 0;


    public SettoreOspedaliero(String identificativo, String nome) {
        this.identificativo = identificativo;
        this.nome = nome;
    }

    public void aggiungiDottore(Dottore dottore){
        for (int i=0; i < dottori.length; i++){ // i=0, 1, 2, 3, 4, 5, 6 ... 199
            // se trovo una posizione libera, aggiungo il dotto
            if (dottori[i] == null){
                dottori[i] = dottore;
                numeroDottoriPresenti++;
                break;
            }
        }
    }

    public void rimuoviDottore(Dottore dottore){
        for (int i=0; i < dottori.length; i++){ // i=0, 1, 2, 3, 4, 5, 6 ... 199
            // se trovo una posizione libera, aggiungo il dotto
            if (dottori[i] == dottore){
                dottori[i] = null;
                numeroDottoriPresenti--;
                break;
            }
        }
    }


    public float calcolaMediaPazientiPerSettore(){
        // il numero totale dei pazienti
        // il numero dei dottori
        int totalePazienti = 0;
        for (Dottore dottore: dottori){
            if (dottore != null) {
                totalePazienti += dottore.calcolaPazientiEffettivi();
            }
        }
        return (float) totalePazienti / numeroDottoriPresenti;
    }

    public String getIdentificativo() {
        return identificativo;
    }

    public void setIdentificativo(String identificativo) {
        this.identificativo = identificativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Dottore[] getDottori() {
        return dottori;
    }

    public void setDottori(Dottore[] dottori) {
        this.dottori = dottori;
    }

    @Override
    public String toString() {
        return "SettoreOspedaliero{" +
                "identificativo='" + identificativo + '\'' +
                ", nome='" + nome + '\'' +
                ", dottori=" + Arrays.toString(dottori) +
                ", numeroDottoriPresenti=" + numeroDottoriPresenti +
                '}';
    }
}
