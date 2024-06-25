public class Rubrica {
    private Contatto[] contatti;

    public Rubrica() {
         this.contatti = new Contatto[100];
    }

    public Rubrica(Contatto[] contatti) {
        this.contatti = contatti;
    }

    public void aggiungiContatto(Contatto contatto){
        for (int i = 0; i < contatti.length; i++) {
            if (contatti[i] == null){
                contatti[i] = contatto;
                break;
            }
        }
    }

    public void rimuoviContatto(Contatto contatto){
        for (int i = 0; i < contatti.length; i++) {
            if (contatti[i] == contatto){
                contatti[i] = null; // rendo nuovamente disponibile lo spazio nell'array
                break;
            }
        }
    }

    public void stampaRubrica(){
        for (int i = 0; i < contatti.length; i++) {
            if (contatti[i] != null) {
                System.out.println(contatti[i]);
            }
        }
    }

    public Contatto[] ricercaContattiPerNome(String name){
        Contatto[] contattiTrovati = new Contatto[10];
        for (Contatto contatto : contatti) {    // ciclando la struttura dati interna alla mia classe
            if (contatto != null && contatto.getNome().equals(name)){    // se trovo un match della mia ricerca
                for (int i = 0; i < contattiTrovati.length; i++) {  // ciclo l'array temporaneo
                    if (contattiTrovati[i] == null){                // per trovare il primo slot
                        contattiTrovati[i] = contatto;              // utile per inserire il contatto
                        break;
                    }
                }
            }
        }

        return contattiTrovati; // null, null, null, null, null ....x10
    }

    public Contatto ricercaContattoPerNome(String name){
        for (Contatto contatto : contatti) {    // ciclando la struttura dati interna alla mia classe
            if (contatto != null && contatto.getNome().equals(name)){    // se trovo un match della mia ricerca
                 return contatto;
            }
        }
        return null; // null, null, null, null, null ....x10
    }



    public Contatto[] getContatti() {
        return contatti;
    }

    public void setContatti(Contatto[] contatti) {
        this.contatti = contatti;
    }
}
