package TicketToRide;

public class Stazione extends Sprite {

    String nome;

    public Stazione(){

        super();
    }

 
    public Stazione (String nome, int x, int y){
        super(x, y);
        this.nome=nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return nome;
    }

    @Override

    public String toString(){
        return "Stazione: " + nome + ".";
    }
}
