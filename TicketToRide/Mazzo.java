package TicketToRide;

public class Mazzo{


    private int tipo;
    
    

    public Mazzo(){

    }

    public Mazzo(int tipo){

        if(tipo==1){
            
            CartaObbiettivo obbiettivo[]=new CartaObbiettivo[30];
        }

        if(tipo==2){

            CartaTreno treno[]=new CartaTreno[110];

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
    }

}
