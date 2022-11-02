package TicketToRide;

import java.util.*;

public class Mazzo{


    private int tipo;
    CartaObbiettivo obbiettivo[]=new CartaObbiettivo[30];
    CartaTreno treno[]=new CartaTreno[110];

    public Mazzo(){

    }

    public Mazzo(int tipo){

        if(tipo==1){
             //inizzializzaObbiettivo(obbiettivo, i, "inizio", "fine", punteggio);  
        }

        if(tipo==2){        

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


    public void mescolaObbiettivi(){

        List<CartaObbiettivo> listaObbiettivi= Arrays.asList(obbiettivo);
        Collections.shuffle(listaObbiettivi);
        listaObbiettivi.toArray(obbiettivo);
    }

    public void mescolaTreno(){

        List<CartaTreno> listaTreno= Arrays.asList(treno);
        Collections.shuffle(listaTreno);
        listaTreno.toArray(treno);
    }


    public void inizializzaObbiettivo(CartaObbiettivo obbiettivo[],int i ,String inizio, String fine, int punteggio ){

        obbiettivo[i].setInizio(inizio);
        obbiettivo[i].setFine(fine);
        obbiettivo[i].setPunteggio(punteggio);
    }

}
