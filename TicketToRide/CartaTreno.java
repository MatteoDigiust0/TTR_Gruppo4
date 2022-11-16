package TicketToRide;

public class CartaTreno extends Carta{
 
    
    private String colore;

    public CartaTreno(){
        super();
    }

    public CartaTreno(String colore){

        this.colore=colore;
    }

    public void setColore(String colore){

        this.colore=colore;
    }

    public String getColore(){
        return colore;
    }

    public Boolean isJolly(){

            if(colore!="Jolly")
                return false;

            return true;
    }

    public CartaTreno copiaTreno(){
        
    }
    }

