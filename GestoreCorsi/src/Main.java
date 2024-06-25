//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Studente studente1 = new Studente("Gianpaolo", "Simone");
        Studente studente2 = new Studente("Costanza", "Piraino");
        Studente studente3 = new Studente("Sara", "Perri", "Comunicazione");
        Studente studente4 = new Studente("Donato", "Aletta", "Ingegneria");

        studente1.setMateriaPreferita("Informatica");
        studente2.setMateriaPreferita("Inglese");

        Corso java27 = new Corso("Java27", "Corso di back-end in cui si " +
                "approfondisce la programmazione in Java");


        studente1.setAnnoDiNascita(1994);
        studente2.setAnnoDiNascita(1985);
        studente3.setAnnoDiNascita(1986);
        studente4.setAnnoDiNascita(2000);


        studente1.setLuogoDiNascita("Lombardia");
        studente2.setLuogoDiNascita("Puglia");
        studente3.setLuogoDiNascita("Piemonte");
        studente4.setLuogoDiNascita("Sicilia");

        // aggiungo studenti
        java27.addStudente(studente1);
        java27.addStudente(studente2);
        java27.addStudente(studente3);
        java27.addStudente(studente4);

        // stampo studenti
        java27.stampaStudenti();
        System.out.println("------------------------------");


        // rimuovo qualche studente
        java27.removeStudente(studente1);
        java27.removeStudente(studente2);


        // stampo gli studenti del corso rimanenti
        java27.stampaStudenti();
    }
}