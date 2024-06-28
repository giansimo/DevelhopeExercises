import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Dottore è la classe
        // doc è l'istanza/l'oggetto
        // Un metodo statico è un metodo di classe Dottore.exampleStaticMethod()
        // Un metodo non statico è un metodo di istanza doc.aggiungiPaziente()

        Dottore doc = new Dottore("0001", "Costanza", "Rossi", Specializzazione.ONCOLOGO, 5);
        doc.aggiungiPaziente("Michele Verdi");
        doc.aggiungiPaziente("Michele Rossi");
        doc.aggiungiPaziente("Michele Bianchi");
        doc.aggiungiPaziente("Francesco Bianchi");
        doc.aggiungiPaziente("Alessandra Rossi");

        Dottore doc2 = new Dottore("0002", "Gianpaolo", "Rossi", Specializzazione.CARDIOLOGO, 5);
        doc2.aggiungiPaziente("Michele Verdi");
        doc2.aggiungiPaziente("Michele Rossi");
        doc2.aggiungiPaziente("Michele Bianchi");
        doc2.aggiungiPaziente("Francesco Bianchi");
        doc2.aggiungiPaziente("Alessandra Rossi");
        doc2.aggiungiPaziente("Alessandra Rossi");
        doc2.aggiungiPaziente("Alessandra Rossi");
        doc2.aggiungiPaziente("Alessandra Rossi");
        doc2.aggiungiPaziente("Michele Bianchi");
        doc2.aggiungiPaziente("Francesco Bianchi");
        System.out.println(doc);

        System.out.println("Effettuo una ricerca sui pazienti");
        ArrayList<String> fra = doc.ricercaPaziente("Michele");
        System.out.println(fra);

        //doc.rimuoviPaziente("Michele Bianchi");

        System.out.println("Stato del doc dopo la rimozione!");
        System.out.println(doc);

        SettoreOspedaliero settoreOspedaliero = new SettoreOspedaliero("SET01",
                "Settore 1 dell'Ospedale di Torino");

        settoreOspedaliero.aggiungiDottore(doc);
        settoreOspedaliero.aggiungiDottore(doc2);

        settoreOspedaliero.rimuoviDottore(doc2);
        System.out.println(settoreOspedaliero.calcolaMediaPazientiPerSettore());

    }
}