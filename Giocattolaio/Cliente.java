package Giocattolaio;

/**
 * Cliente
 */
public class Cliente {
    private int id;
    private String nome;
    private String email;

    public Cliente(int id,String nome,String email){
        this.id=id;
        this.nome=nome;
        this.email=email;
    }

    @Override
    public String toString() {
        String descrizione="";

        descrizione+="Nome Cliente:"+this.nome;
        descrizione+="\nEmail:"+this.email;

        return descrizione;
    }
}