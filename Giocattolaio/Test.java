package Giocattolaio;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        
        ArrayList<Giocattolo> giocattoli=new ArrayList<>();
        ArrayList<Cliente> clienti=new ArrayList<>();
        ArrayList<Vendita> vendite=new ArrayList<>();

        giocattoli.add(new Giocattolo(1,"Ferrari", 15, 3));
        giocattoli.add(new Giocattolo(2,"Mercedes", 20, 3));

        clienti.add(new Cliente(1,"Francesco","francesco.alo....."));

        vendite.add(new Vendita(giocattoli.get(0),clienti.get(0)));

        System.out.println(vendite.toString());


    }
}

