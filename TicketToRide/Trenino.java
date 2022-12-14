package TicketToRide;

public class Trenino extends Sprite{

    String colore;

    public Trenino(){

        super();
    }

    public Trenino (String colore, int x, int y){
        super (x, y);
        this.colore=colore;
    }
    
    public void setColore(String colore){
        this.colore=colore;
    }

    public String getColore(){
        return colore;
    }

    @Override

    public String toString(){
        return "Colore: " + colore + ".";
    }
}
