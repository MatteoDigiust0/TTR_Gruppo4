package TicketToRide;

public class Tratta {

    int lunghezza;
    String colore;
    Stazione inizio;
    Stazione fine;
    Boolean StazioneOccupata;

    public Tratta(){}

    public Tratta(int lunghezza, String inizio, String fine, String colore){
        this.lunghezza=lunghezza;
        this.inizio= new Stazione(inizio);
        this.fine=new Stazione(fine);
        this.colore=colore;
    }

    public void setLunghezza(int lunghezza){
        this.lunghezza=lunghezza;
    }

    public int getlunghezza(){
        return lunghezza;
    }

    public void setColore(String colore){
        this.colore=colore;
    }

    public String getColore(){
        return colore;
    }

    public void setInizio(String inizio){   //Inizio
        this.inizio.setNome(inizio);
    }

    public String getInizio(){
        return inizio.getNome();
    }

    public void setFine(String fine){   //fine
        this.fine.setNome(fine);
    }

    public String getFine(){
        return fine.getNome();
    }

}
