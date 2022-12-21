package TicketToRide;

import java.util.Random;

public class Mazzo extends Sprite{

    private CartaObbiettivo obbiettivo[]=new CartaObbiettivo[30];
    private CartaTreno treno[]=new CartaTreno[110];

    private int indexCarteTreno;
    private int indexCarteObiettivi;


    public Mazzo(){
        super();
    }

    public Mazzo(int x, int y){

        super(x, y);
        
        for(int i=0; i<30; i++)
        obbiettivo[i]=new CartaObbiettivo();
        
        for(int i=0; i<110; i++)
        treno[i] = new CartaTreno();

        indexCarteTreno = 0;
        indexCarteObiettivi = 0;


            obbiettivo[0].setObbiettivo("Denver", "Pittsburgh", 11);
            obbiettivo[1].setObbiettivo("Winnipeg", "Houston", 12);
            obbiettivo[2].setObbiettivo("Chicago", "Santa Fe", 9);
            obbiettivo[3].setObbiettivo("Duluth", "El Paso", 10);
            obbiettivo[4].setObbiettivo("Sault San.Marie", "Oklahoma City", 9);
            obbiettivo[5].setObbiettivo("Calgary", "Phoenix", 13);
            obbiettivo[6].setObbiettivo("Los Angeles", "New York", 21);
            obbiettivo[7].setObbiettivo("Seattle", "New York", 22);
            obbiettivo[8].setObbiettivo("Vancouver", "Montreal", 20);
            obbiettivo[9].setObbiettivo("Montreal", "New Orleans", 13);
            obbiettivo[10].setObbiettivo("Boston", "Miami", 12);
            obbiettivo[11].setObbiettivo("Sault St.Marie", "Nashville", 8);
            obbiettivo[12].setObbiettivo("Kansas City", "Houston", 5);
            obbiettivo[13].setObbiettivo("Toronto", "Miami", 10);
            obbiettivo[14].setObbiettivo("Chicago", "New Orleans", 7);
            obbiettivo[15].setObbiettivo("Duluth", "Houston", 8);
            obbiettivo[16].setObbiettivo("Dallas", "New York", 11);
            obbiettivo[17].setObbiettivo("Winnipeg", "Little Rock", 11);
            obbiettivo[18].setObbiettivo("Denver", "El Paso", 4);
            obbiettivo[19].setObbiettivo("Portland", "Phoenix", 11);
            obbiettivo[20].setObbiettivo("Helena", "Los Angeles", 8);
            obbiettivo[21].setObbiettivo("New York", "Atlanta", 6);
            obbiettivo[22].setObbiettivo("Montreal", "Atlanta", 9);
            obbiettivo[23].setObbiettivo("Portland", "Nashville", 17);
            obbiettivo[24].setObbiettivo("Seattle", "Los Angeles", 9);
            obbiettivo[25].setObbiettivo("Vancouver", "Santa Fe", 13);
            obbiettivo[26].setObbiettivo("Calgary", "Salt Lake City", 7);
            obbiettivo[27].setObbiettivo("Los Angeles", "Chicago", 16);
            obbiettivo[28].setObbiettivo("Los Angeles", "Miami", 20);
            obbiettivo[29].setObbiettivo("San Francisco", "Atlanta", 17);

            


            for(int i=0; i<110; i++){

                if(i<12)
                treno[i].setColore("Viola");

                if(i>=12 && i<24)
                treno[i].setColore("Bianco");

                if(i>=24 && i<36)
                treno[i].setColore("Blu");

                if(i>=36 && i<48)
                treno[i].setColore("Giallo");

                if(i>=48 && i<60)
                treno[i].setColore("Arancione");

                if(i>=60 && i<72)
                treno[i].setColore("Nero");

                if(i>=72 && i<84)
                treno[i].setColore("Rosso");

                if(i<84 && i<96)
                treno[i].setColore("Verde");

                else
                treno[i].setColore("Jolly");

            }

        }
    

    public int getIndexCarteTreno() {
        return indexCarteTreno;
    }

    public int getIndexCarteObiettivi() {
        return indexCarteObiettivi;
    }

    public void setIndexCarteTreno(int indexCarteTreno) {
        this.indexCarteTreno = indexCarteTreno;
    }

    public void setIndexCarteObiettivi(int indexCarteObiettivi) {
        this.indexCarteObiettivi = indexCarteObiettivi;
    }

    public String getColoreTreno(int i){

        return treno[i].getColore();
    }


    
    public void mescolaMazzi(){

        CartaObbiettivo temporaneoO= new CartaObbiettivo();
        CartaTreno temporaneoT = new CartaTreno();

        Random random= new Random();

        //mescola gli obbiettivi
        for(int i=0; i<1000; i++){

            int n_random= random.nextInt(29);
            int n_random2=random.nextInt(29);

            temporaneoO=obbiettivo[n_random];
            obbiettivo[n_random]=obbiettivo[n_random2];
            obbiettivo[n_random2]=temporaneoO;
        }

        //mescola i treni
        for(int i=0; i<1000; i++){

            int n_random= random.nextInt(29);
            int n_random2=random.nextInt(29);

            temporaneoT=treno[n_random];
            treno[n_random]=treno[n_random2];
            treno[n_random2]=temporaneoT;
        }
    }

}
