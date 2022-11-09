package TicketToRide;

import java.util.*;

public class Giocatore {

    private Trenino []treniniDisponibili;
    private Tratta []trattePrese;
    private CartaObbiettivo []carteObbiettivo;
    private CartaTreno []carteTreno;
    private String colore;

    public Giocatore(){}
    public Giocatore(String Colore){

        Trenino []treniniDisponibili= new Trenino[45];
        Tratta []trattePrese = new Tratta[83];
        CartaObbiettivo []carteObbiettivo= new CartaObbiettivo[30];
        CartaTreno []carteTreno = new CartaTreno[110];




    }

    public static void PescaCartaTreno(int index){

        Scanner input = new Scanner(System.in);

        System.out.println("La carta treno pescata è di colore:" Mazzo.treno[index].getColore());
    }

}
