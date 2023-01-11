
package TicketToRide;

import javax.swing.*;
import java.util.*;

public class UI_Digiusto extends JFrame {

    private ContenutoGrafico cg;
    private Tabellone tabellone;

    public UI_Digiusto(){

        tabellone = new Tabellone(25,0);

        setExtendedState(JFrame.MAXIMIZED_BOTH);

        cg = new ContenutoGrafico();
        getContentPane().add(cg);
    }

}
