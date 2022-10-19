package TicketToRide;

public class Tratta {

    int lunghezza;
    String colore;
    Stazione inizio;
    Stazione fine;
    Boolean StazioneOccupata;

    public Tratta(int lunghezza){   //lunghezza
        this.lunghezza=lunghezza;
    }

    public void setLunghezza(int lunghezza){
        this.lunghezza=lunghezza;
    }

    public int getlunghezza(){
        return lunghezza;
    }

    public Tratta(String colore){   //colore
        this.colore=colore;
    }

    public void setColore(String colore){
        this.colore=colore;
    }

    public String getColore(){
        return colore;
    }

    public Stazione setInizio(String inizio){   //Inizio
        this.inizio=inizio;
    }

    public Stazione getInizio(){
        return inizio;
    }

    public Stazione setFine(String fine){   //fine
        this.fine=fine;
    }

    public Stazione getFine(){
        return fine;
    }
}
