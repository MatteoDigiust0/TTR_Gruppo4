
package TicketToRide;

import javax.swing.*;
import java.util.*;

public class MainUI extends JFrame {

    private ContenutoGrafico cg;
    private Tabellone tabellone;
    private static Giocatore giocatore;

    public static Giocatore getGiocatore(){
        return giocatore;
    }

    public MainUI(){

        tabellone = new Tabellone(25,0);
        giocatore = new Giocatore();

        setExtendedState(JFrame.MAXIMIZED_BOTH);

        cg = new ContenutoGrafico();
        getContentPane().add(cg);
    }

}
