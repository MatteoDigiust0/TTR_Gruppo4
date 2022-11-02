package TicketToRide;

public class Tabellone {

    private Stazione []stazioni;        //NStazione = 38;
    private Tratta []tratte;        //NTratte = 83;

    public Tabellone(){


        Stazione stazioni[] =new Stazione[38];

        stazioni[0].setNome("Vancouver");
        stazioni[1].setNome("Calgary");
        stazioni[2].setNome("Winnipeg");
        stazioni[3].setNome("Sault St.Marie");
        stazioni[4].setNome("Motréal");
        stazioni[5].setNome("Seattle");
        stazioni[6].setNome("Duluth");
        stazioni[7].setNome("Toronto");
        stazioni[8].setNome("Boston");
        stazioni[9].setNome("Portland");
        stazioni[10].setNome("Helena");
        stazioni[11].setNome("Omaha");
        stazioni[12].setNome("Chicago");
        stazioni[13].setNome("Pittsburg");
        stazioni[13].setNome("New York");
        stazioni[14].setNome("San Francisco");
        stazioni[15].setNome("Salt Lake City");
        stazioni[16].setNome("Denver");
        stazioni[17].setNome("Kansas City");
        stazioni[18].setNome("Saint Louis");
        stazioni[19].setNome("Washington");
        stazioni[20].setNome("Las Vegas");
        stazioni[21].setNome("Santa Fe");
        stazioni[22].setNome("Oklahoma City");
        stazioni[23].setNome("Little Rock");
        stazioni[24].setNome("Nashville");
        stazioni[25].setNome("Raleigh");
        stazioni[26].setNome("Los Angeles");
        stazioni[27].setNome("Phoenix");
        stazioni[27].setNome("El Paso");
        stazioni[28].setNome("Dallas");
        stazioni[29].setNome("Atlanta");
        stazioni[30].setNome("Charleston");
        stazioni[31].setNome("Houston");
        stazioni[32].setNome("New Orleans");
        stazioni[32].setNome("Miami");


        Tratta tratte[] = new Tratta[83];

        //InizializzazioneTratte(tratte, 0, 3, "Vancouver", "Calgary");
        InizializzazioneTratte(tratte, 1, 2, "Vancouver", "Seattle");
        InizializzazioneTratte(tratte, 2, 4, "Seattle", "Calgary");
        InizializzazioneTratte(tratte, 3, 6, "Calgary", "Winnipeg");
        InizializzazioneTratte(tratte, 4, 4, "Calgary", "Helena");
        InizializzazioneTratte(tratte, 5, 6, "Seattle", "Helena");
        InizializzazioneTratte(tratte, 6, 5,  "Sault St.Marie", "Montrèal");
        InizializzazioneTratte(tratte, 7, 2, "Montrèal", "Boston" );
        InizializzazioneTratte(tratte, 8, 3, "Montrèal", "New York" );
        InizializzazioneTratte(tratte, 9, 3, "Montrèal", "Toronto");
        InizializzazioneTratte(tratte, 10, 2, "Sault St.Marie", "Toronto" );
        InizializzazioneTratte(tratte, 11, 3,  "Sault St.Marie", "Duluth" );
        InizializzazioneTratte(tratte, 12, 4,  "Winnipegh", "Duluth");
        InizializzazioneTratte(tratte, 13, 4, "Helena", "Winnipeg" );
        InizializzazioneTratte(tratte, 14, 6, "Winnipeg", "Sault St.Marie");
        InizializzazioneTratte(tratte, 15, 6, "Toronto", "Duluth");
        InizializzazioneTratte(tratte, 16, 2, "Boston", "New York");
        InizializzazioneTratte(tratte, 17, 2, "New York", "Pittsburg");
        InizializzazioneTratte(tratte, 18, 2, "Toronto", "Pittsburg");
        InizializzazioneTratte(tratte, 19, 4, "Toronto", "Chicago" );
        InizializzazioneTratte(tratte, 20, 3, "Chicago", "Duluth");
        InizializzazioneTratte(tratte, 21, 3, "Pittsburg", "Chicago");
        InizializzazioneTratte(tratte, 22, 4, "Chicago", "Omaha");
        InizializzazioneTratte(tratte, 23, 2, "Duluth", "Omaha");
        InizializzazioneTratte(tratte, 24, 5,  "Omaha", "Helena" );
        InizializzazioneTratte(tratte, 25, 4, "Denver", "Helena");
        InizializzazioneTratte(tratte, 26, 3, "Helena", "Salt Lake City");
        InizializzazioneTratte(tratte, 27, 6, "Portland", "Salt Lake City");
        InizializzazioneTratte(tratte, 28, 2, "Portland", "Seattle");
        InizializzazioneTratte(tratte, 29, 5, "Portland", "San Francisco" );
        InizializzazioneTratte(tratte, 30, 5, "San Francisco", "Salt lake City");
        InizializzazioneTratte(tratte, 31, 3,  "Salt Lake City", "Denver");
        InizializzazioneTratte(tratte, 32, 4, "Denver", "Omaha");
        InizializzazioneTratte(tratte, 33, 3, "San Francisco", "Los Angeles");
        InizializzazioneTratte(tratte, 34, 2, "Las Vegas", "Los Angeles");
        InizializzazioneTratte(tratte, 35, 3, "Salt Lake City", "Las vegas");
        InizializzazioneTratte(tratte, 36, 3, "Los Angeles", "Phoenix" );
        InizializzazioneTratte(tratte, 37, 5, "Phoenix", "Denver");
        InizializzazioneTratte(tratte, 38, 2, "Denver", "Santa Fe" );
        InizializzazioneTratte(tratte, 39, 3, "Phoenix", "Santa Fe");
        InizializzazioneTratte(tratte, 40, 6, "Los Angeles", "El Paso" );
        InizializzazioneTratte(tratte, 41, 3, "Phoenix", "El Paso");
        InizializzazioneTratte(tratte, 42, 2, "El Paso", "Santa Fe");
        InizializzazioneTratte(tratte, 43, 6, "El Paso", "Houston");
        InizializzazioneTratte(tratte, 44, 4, "El Paso", "Dallas");
        InizializzazioneTratte(tratte, 45, 6, "Portland", "Helena");









    }

    public static void InizializzazioneTratte(Tratta tratte[], int i, int lunghezza, String inizio, String fine){

        tratte[i] = new Tratta(lunghezza, inizio, fine);

    }
}
