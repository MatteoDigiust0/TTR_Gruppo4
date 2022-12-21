package TicketToRide;

public class CartaTreno extends Sprite{
 
    
    private String colore;


    public CartaTreno(){
        super();
    }

    public CartaTreno(String colore, int x, int y){

        super(x, y);

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
        
        return new CartaTreno(colore, x, y);
    }
    }

