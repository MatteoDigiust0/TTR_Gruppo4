package TicketToRide;

public class Trenino {

    String colore;

    public Trenino(){}

    public Trenino(String colore){
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
