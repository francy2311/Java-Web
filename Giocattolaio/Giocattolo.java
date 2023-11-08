package Giocattolaio;

/**
 * Giocattolo
 */
public class Giocattolo {

    private int id;
    private String nome;
    private double prezzo;
    private int età_cons;//età consiglitata
    
    public Giocattolo(int id,String nome,double prezzo,int eta_cons){
        this.id=id;
        this.nome=nome;
        this.prezzo=prezzo;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        String descrizione="";
        
        descrizione+="Id Giocattolo:"+this.id;
        descrizione+="\nNome Giocattolo:"+this.nome;
        descrizione+="\nPrezzo:"+this.prezzo;
        descrizione+="\nEtà consigliata:"+this.età_cons;

        return descrizione;
    }
}
