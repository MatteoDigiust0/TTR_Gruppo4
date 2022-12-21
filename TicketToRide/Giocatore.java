package TicketToRide;

import java.util.*;

public class Giocatore {

    private Trenino []treniniDisponibili;
    private Tratta []trattePrese;
    private CartaObbiettivo []carteObbiettivo;
    private CartaTreno []carteTreno;
    private String colore;
    public int indexCarteTreno;

    public Giocatore(){}
    
    public Giocatore(String Colore, Mazzo mazzo){

        Trenino []treniniDisponibili= new Trenino[45];
        Tratta []trattePrese = new Tratta[83];
        CartaObbiettivo []carteObbiettivo= new CartaObbiettivo[30];
        CartaTreno []carteTreno = new CartaTreno[110];
        indexCarteTreno = 0;

    }


    public void setColore(String colore){
        this.colore=colore;
    }

    public String getColore(){
        return colore;
    }

    public void setIndexcarteTreno(int indexCarteTreno){
        this.indexCarteTreno=indexCarteTreno;
    }

    public int indexCarteTreno(){
        return indexCarteTreno;
    }
    

    public int PescaCartaTreno(CartaTreno carteTreno[], int index, Mazzo mazzo, int indexCarteTrenoPrese){

        Scanner input = new Scanner(System.in);
        int scelta;

        System.out.println("La carta treno pescata è di colore:"+ mazzo.getColoreTreno(mazzo.getIndexCarteTreno()));
        mazzo.setIndexCarteTreno(mazzo.getIndexCarteTreno() + 1);

        carteTreno[indexCarteTrenoPrese] = new CartaTreno(mazzo.getColoreTreno(mazzo.getIndexCarteTreno()));

        return indexCarteTrenoPrese;
    }

}
