public class Contatto {
    private String nome;
    private String cognome;
    private String cell; //+39333333333
    private String email;
    private Tipologia tipologia;

    public Contatto(String nome, String cognome, String cell, String email, Tipologia tipologia) {
        this.nome = nome;
        this.cognome = cognome;
        this.cell = cell;
        this.email = email;
        this.tipologia = tipologia;
    }

    public Contatto(String nome, String cognome, String cell, Tipologia tipologia) {
        this.nome = nome;
        this.cognome = cognome;
        this.cell = cell;
        this.tipologia = tipologia;
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

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Tipologia getTipologia() {
        return tipologia;
    }

    public void setTipologia(Tipologia tipologia) {
        this.tipologia = tipologia;
    }

    @Override
    public String toString() {
        return "Contatto{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", cell='" + cell + '\'' +
                ", email='" + email + '\'' +
                ", tipologia=" + tipologia +
                '}';
    }
}

