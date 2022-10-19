package TicketToRide;

public class CartaTratta {
 
    
    private String colore;

    public CartaTratta(){

    }

    public CartaTratta(String colore){

        this.colore=colore;
    }

    public void setColore(String colore){

        this.colore=colore;
    }

    public String getColore(){
        return colore;
    }

    public Boolean isJolly(){

            if(colore!="jolly")
                return false;

            return true;
    }
    }

