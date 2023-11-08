package Giocattolaio;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
    Scanner sc=new Scanner(System.in);
    public void aggiungiGioco(ArrayList<Giocattolo> giochi){
        System.out.println("--Hai scelto di aggiumgere un giocattolo all'interno del tuo inventario--");
        System.out.println("Inserisci l'id del gioco:");
        int id=sc.nextInt();
        //aggiungo un utilizzo del nextLine in quanto lo scanner dopo un utilizzo per interi si bagga
        sc.nextLine();
        System.out.println("Inserisci il nome del gioco: ");
        String nome=sc.nextLine();
        System.out.println("Inserisci il prezzo del gioco:");
        double prezzo=sc.nextDouble();
        System.out.println("Inserisci l'età consigliata: ");
        int età_consigliata=sc.nextInt();
        giochi.add(new Giocattolo(id, nome, prezzo, età_consigliata));
    }

    public void rimuoviGioco(ArrayList<Giocattolo> giochi){
        System.out.println("Inserisci l'identificativo del gioco da rimuovere: ");
        int IdDaRimuovere=sc.nextInt();

        for (int i = 0; i < giochi.size(); i++) {
            if (giochi.get(i).getId() == IdDaRimuovere) {
                giochi.remove(i);
                break; //Eseguo un break in modo che dopo che abbiamo trovato il gioco con l'id da rimuovere non continui il ciclo
            }
        }
    }

    public void visualizzaGiochi(ArrayList<Giocattolo> giochi){
        System.out.println("-------Elenco Giocattoli---------");
        for (Giocattolo giocattolo : giochi) {
            System.out.println(giocattolo.toString());
        }
    }
}
