package TicketToRide;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class ContenutoGrafico extends JPanel implements ActionListener{

    private Timer timer;
    private final int DELAY = 10;

    public ContenutoGrafico() {

        initBoard();
    }

    private void initBoard() {

        addMouseListener(new TAdapter());
        setBackground(Color.black);
        setFocusable(true);

        setSize(1100, 749);
        setLocation(230, 0);
        //spaceShip = new SpaceShip();

        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);

        Toolkit.getDefaultToolkit().sync();

    }

    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(loadImage(), 0, 0, this);

        //disegna tutte le immagini delle carte treno in possesso del giocatore
        for(int i=0; i<MainUI.getGiocatore().getCartatreno().length; i++ )
            g2d.drawImage(MainUI.getGiocatore().getCartatreno()[i].getImage(), MainUI.getGiocatore().getCartatreno()[i].getX(), MainUI.getGiocatore().getCartatreno()[i].getY(), this);

        //disegna tutte le carte obiettivo del giocatore
        for(int i=0; i<MainUI.getGiocatore().getCarteObiettivo().length; i++ )
            g2d.drawImage(MainUI.getGiocatore().getCarteObiettivo()[i].getImage(), MainUI.getGiocatore().getCarteObiettivo()[i].getX(), MainUI.getGiocatore().getCarteObiettivo()[i].getY(), this);

        //disegna il trenino del giocatore
        g2d.drawImage(MainUI.getGiocatore().getTreniniDisponibili()[0].getImage(), MainUI.getGiocatore().getTreniniDisponibili()[0].getX(), MainUI.getGiocatore().getTreniniDisponibili()[0].getY(), this);

    }

    private BufferedImage loadImage(){

        URL imagePath = getClass().getResource("TTR_img/board.png");
        BufferedImage result = null;

        try{
            result = ImageIO.read(imagePath);
        }catch(IOException e){
            System.err.println("Errore, immagine non trovata");
        }

        return result;

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        step();
    }

    private void step() {

        spaceShip.move();

        repaint(spaceShip.getX()-1, spaceShip.getY()-1,
                spaceShip.getWidth()+2, spaceShip.getHeight()+2);
    }

    private class TAdapter extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {
            spaceShip.keyPressed(e);
        }
    }
}