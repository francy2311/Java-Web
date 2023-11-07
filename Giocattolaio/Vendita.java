package Giocattolaio;

/**
 * Vendita
 */
public class Vendita {
    public Giocattolo giocattolo;
    public Cliente cliente;

    public Vendita(Giocattolo giocattolo,Cliente cliente){
        this.giocattolo=giocattolo;
        this.cliente=cliente;
    }

    @Override
    public String toString() {
        return "Descrizione Giocattolo:"+"\n"+giocattolo.toString()+"\nDescrizione Cliente"+"\n"+cliente.toString();
    }

}
