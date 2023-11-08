package Giocattolaio;

/**
 * Giocattolo
 */
public class Giocattolo {
    private final String codiceGiocattolo;
    private static int id=1;
    private String nome;
    private double prezzo;
    private int età_cons;//età consiglitata
    
    public Giocattolo(int id,String nome,double prezzo,int eta_cons){
        this.id=id;
        this.nome=nome;
        this.prezzo=prezzo;
        codiceGiocattolo=nome+"Prod"+id;
        id++;
    }

    public static int getId() {
        return id;
    }

    @Override
    public String toString() {
        String descrizione=" ";

        descrizione+="Nome Giocattolo:"+this.nome;
        descrizione+="\nPrezzo:"+this.prezzo;
        descrizione+="\nEtà consigliata:"+this.età_cons;

        return descrizione;
    }
}
