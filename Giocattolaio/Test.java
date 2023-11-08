package Giocattolaio;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        final String N_UTENTE="Francy308";
        
        String n_utente=" ";
        int scelta=0;

        ArrayList<Giocattolo> giocattoli=new ArrayList<>();
        ArrayList<Cliente> clienti=new ArrayList<>();
        ArrayList<Vendita> vendite=new ArrayList<>();
        Inventario inventario=new Inventario();

        giocattoli.add(new Giocattolo(1,"Ferrari", 15, 3));
        giocattoli.add(new Giocattolo(2,"Mercedes", 20, 3));

        clienti.add(new Cliente(1,"Francesco","francesco.alo....."));

        // questi sono i parametri per cercare le vendite
        vendite.add(new Vendita(giocattoli.get(0),clienti.get(0))); 
        
        // System.out.println(vendite.toString());

        // inventario.visualizzaGiochi(giocattoli);

        System.out.println("--------------------------------------------------");
        System.out.println("Inserisci Nome Utente");
        n_utente=s.nextLine();

        if (n_utente.equals(N_UTENTE)) {
            System.out.println("Scegli le operazioni da eseguire \n Aggiungi Giocattolo(1)\nRimuovi Giocattolo(2)\nVisualizza Elenco giocattoli");
            scelta=s.nextInt();
            switch (scelta) {
                case 1:
                    inventario.aggiungiGioco(giocattoli);
                    break;
                case 2:
                    inventario.rimuoviGioco(giocattoli);
                    break;
                case 3:
                    inventario.visualizzaGiochi(giocattoli);
                    break;
                default:
                    break;
            }
        }else{
            System.out.println("Non sei un admin\n");
            System.out.println("Vuoi acquistare un giocattolo(si/no)");
            String risp=s.nextLine();
            if (risp.equals("si")) {
                inventario.visualizzaGiochi(giocattoli);
                System.out.println("Scegli giocattolo");
                int idGiocattolo=s.nextInt();
                    for (Giocattolo giocattolo :giocattoli) {
                        if (idGiocattolo==giocattolo.getId()) {
                            System.out.println("Hai acquistato"+giocattolo.getNome());
                            giocattoli.remove(giocattolo);
                        }
                    }
                }
            }
            
        }
    }



