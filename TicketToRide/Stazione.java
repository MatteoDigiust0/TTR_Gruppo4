package TicketToRide;

public class Stazione {

    String nome;

    public Stazione(){}  
    
    public Stazione (String nome){
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
