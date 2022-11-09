package TicketToRide;

public class CartaObbiettivo extends Carta{

    private Stazione inizio=new Stazione();
    private Stazione fine=new Stazione();
    private int punteggio;


    public CartaObbiettivo(){

        super();
    }

    public CartaObbiettivo(String inizio, String fine, int punteggio){

        this.inizio.setNome(inizio);
        this.fine.setNome(fine);
        this.punteggio=punteggio;
    }

    public void setInizio(String inizio){

        this.inizio.setNome(inizio);
    }

    public void setFine(String fine){

        this.fine.setNome(fine);
    }

    public void setPunteggio(int punteggio){

        this.punteggio=punteggio;
    }

    public String getInizio(){
        return inizio.getNome();
    }

    public String getFine(){
        return fine.getNome();
    }

    public int getPunteggio(){
        return punteggio;
    }

    public String toString(){
        return "Tratta "+getInizio()+"-"+getFine()+"; Punteggio "+getPunteggio();
    }

    public void setObbiettivo(String inizio, String fine, int punteggio){

        this.inizio.setNome(inizio);
        this.fine.setNome(fine);
        this.punteggio=punteggio;
    }

    public CartaObbiettivo copiaObbiettivo(){

        return new CartaObbiettivo(getInizio(), getFine(), punteggio);
    }
    
}
