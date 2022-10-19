package TicketToRide;

public class CartaObbiettivo extends Carta{

    private Stazione inizio=new Stazione();
    private Stazione fine=new Stazione();
    private int punteggio;


    public CartaObbiettivo(){

        super();
        inizio=new Stazione();
        fine=new Stazione();
    }

    public CartaObbiettivo(Stazione inizio, Stazione fine, int punteggio){

        inizio=new Stazione();
        fine=new Stazione();

        this.inizio=inizio;
        this.fine=fine;
        this.punteggio=punteggio;
    }

    public void setInizio(Stazione inizio){

        this.inizio=inizio;
    }

    public void setFine(Stazione fine){

        this.fine=fine;
    }

    public void setPunteggio(int punteggio){

        this.punteggio=punteggio;
    }

    public Stazione getInizio(){
        return inizio.getNome();
    }

    public Stazione getFine(){
        return fine.getNome();
    }

    public int getPunteggio(){
        return punteggio;
    }

    public String toString(){
        return "Tratta "+getInizio()+"-"+getFine()+"; Punteggio "+getPunteggio();
    }
    
}
