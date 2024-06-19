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

        java27.addStudente(studente1);
        java27.addStudente(studente2);
        java27.addStudente(studente3);
        java27.addStudente(studente4);
    }
}