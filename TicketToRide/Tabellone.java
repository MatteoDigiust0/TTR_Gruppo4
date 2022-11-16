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

        InizializzazioneTratte(tratte, 0, 3, "Vancouver", "Calgary"); // grigia
        InizializzazioneTratte(tratte, 1, 2, "Vancouver", "Seattle"); // doppia, grgigia
        InizializzazioneTratte(tratte, 2, 4, "Seattle", "Calgary"); // grigia
        InizializzazioneTratte(tratte, 3, 6, "Calgary", "Winnipeg");// bianca
        InizializzazioneTratte(tratte, 4, 4, "Calgary", "Helena");//grigia
        InizializzazioneTratte(tratte, 5, 6, "Seattle", "Helena");//gialla
        InizializzazioneTratte(tratte, 6, 5,  "Sault St.Marie", "Montrèal");//nera
        InizializzazioneTratte(tratte, 7, 2, "Montrèal", "Boston" );//doppia grigia
        InizializzazioneTratte(tratte, 8, 3, "Montrèal", "New York" );//blu
        InizializzazioneTratte(tratte, 9, 3, "Montrèal", "Toronto");//grigia
        InizializzazioneTratte(tratte, 10, 2, "Sault St.Marie", "Toronto" );//grigia
        InizializzazioneTratte(tratte, 11, 3,  "Sault St.Marie", "Duluth" );//grigia
        InizializzazioneTratte(tratte, 12, 4,  "Winnipegh", "Duluth");//nera
        InizializzazioneTratte(tratte, 13, 4, "Helena", "Winnipeg" );//blu
        InizializzazioneTratte(tratte, 14, 6, "Winnipeg", "Sault St.Marie");//grigia
        InizializzazioneTratte(tratte, 15, 6, "Toronto", "Duluth");//rosa
        InizializzazioneTratte(tratte, 16, 2, "Boston", "New York");//doppia, gialla, rossa
        InizializzazioneTratte(tratte, 17, 2, "New York", "Pittsburg");//doppia, bianca, verde
        InizializzazioneTratte(tratte, 18, 2, "Toronto", "Pittsburg");//grigia
        InizializzazioneTratte(tratte, 19, 4, "Toronto", "Chicago" );//bianca
        InizializzazioneTratte(tratte, 20, 3, "Chicago", "Duluth");//rossa
        InizializzazioneTratte(tratte, 21, 3, "Pittsburg", "Chicago");//doppia, rancione, nero
        InizializzazioneTratte(tratte, 22, 4, "Chicago", "Omaha");//blu
        InizializzazioneTratte(tratte, 23, 2, "Duluth", "Omaha");//doppia grigia
        InizializzazioneTratte(tratte, 24, 5,  "Omaha", "Helena" );//rossa
        InizializzazioneTratte(tratte, 25, 4, "Denver", "Helena");//verde
        InizializzazioneTratte(tratte, 26, 3, "Helena", "Salt Lake City");//rosa
        InizializzazioneTratte(tratte, 27, 6, "Portland", "Salt Lake City");//blu
        InizializzazioneTratte(tratte, 28, 2, "Portland", "Seattle");//doppia, grigia
        InizializzazioneTratte(tratte, 29, 5, "Portland", "San Francisco" );//doppia, verdem rosa
        InizializzazioneTratte(tratte, 30, 5, "San Francisco", "Salt lake City");//doppia, arancione, bianco
        InizializzazioneTratte(tratte, 31, 3,  "Salt Lake City", "Denver");//doppia, rossa, giallo
        InizializzazioneTratte(tratte, 32, 4, "Denver", "Omaha");//rosa
        InizializzazioneTratte(tratte, 33, 3, "San Francisco", "Los Angeles");//doppia, rosa. gialla
        InizializzazioneTratte(tratte, 34, 2, "Las Vegas", "Los Angeles");//grigia
        InizializzazioneTratte(tratte, 35, 3, "Salt Lake City", "Las vegas");//arancione
        InizializzazioneTratte(tratte, 36, 3, "Los Angeles", "Phoenix" );//grigia
        InizializzazioneTratte(tratte, 37, 5, "Phoenix", "Denver");//bianca
        InizializzazioneTratte(tratte, 38, 2, "Denver", "Santa Fe" );//grigia
        InizializzazioneTratte(tratte, 39, 3, "Phoenix", "Santa Fe");//grigia
        InizializzazioneTratte(tratte, 40, 6, "Los Angeles", "El Paso" );//nera
        InizializzazioneTratte(tratte, 41, 3, "Phoenix", "El Paso");//grigia
        InizializzazioneTratte(tratte, 42, 2, "El Paso", "Santa Fe");//grigia
        InizializzazioneTratte(tratte, 43, 6, "El Paso", "Houston");//verde
        InizializzazioneTratte(tratte, 44, 4, "El Paso", "Dallas");//rossa
        InizializzazioneTratte(tratte, 45, 4, "Denver", "Oklahoma City");//rossa
        InizializzazioneTratte(tratte, 46, 1, "Omaha", "Kansas City");//doppia grigia
        InizializzazioneTratte(tratte, 47, 4, "Denver", "Kansas City");//doppia, nera, arancione
        InizializzazioneTratte(tratte, 48, 3, "Santa Fe", "Oklahoma City");  //blu
        InizializzazioneTratte(tratte, 49, 5, "El Paso", "Oklahoma City");//gialla
        InizializzazioneTratte(tratte, 50, 2, "Kansas City", "Oklahoma City");//grigia
        InizializzazioneTratte(tratte, 51, 2, "Kansas City", "Saint Louis");//doppia, blu, rosa
        InizializzazioneTratte(tratte, 52, 2, "Saint Louis", "Nashville");//grigis
        InizializzazioneTratte(tratte, 53, 2, "Oklahoma City", "Dallas");//doppia, grigia
        InizializzazioneTratte(tratte, 54, 1, "Dallas", "Houston");//doppia grigia
        InizializzazioneTratte(tratte, 55, 2, "Oklahoma City", "Little Rock");//grigia
        InizializzazioneTratte(tratte, 56, 2, "Dallas", "Little Rock");//grigia
        InizializzazioneTratte(tratte, 57, 2, "Saint Louis", "Little Rock");//grigia
        InizializzazioneTratte(tratte, 58, 2, "Houston", "New Orleans");//grigia
        InizializzazioneTratte(tratte, 59, 6,  "New Orleans", "Miami");//rossa
        InizializzazioneTratte(tratte, 60, 4, "New Orleans", "Atlanta" );//doppia, gialla, arancione
        InizializzazioneTratte(tratte, 61, 3, "New Orleans", "Little Rock" );//verde
        InizializzazioneTratte(tratte, 62, 5, "Miami", "Atlanta");//blu
        InizializzazioneTratte(tratte, 63, 4, "Miami", "Charlenston");//rosa
        InizializzazioneTratte(tratte, 64, 2, "Charlentston", "Atlanta");//grigia
        InizializzazioneTratte(tratte, 65, 2, "Charleston", "Raleigh");//grigia
        InizializzazioneTratte(tratte, 66,  1, "Nashville", "Atlanta");//grigia
        InizializzazioneTratte(tratte, 67, 3, "Little Rock", "Nashville");//bianca
        InizializzazioneTratte(tratte, 68, 2, "Chicago", "Saint Louis");//doppia, verde, bianca
        InizializzazioneTratte(tratte, 69, 2, "Atlanta", "Raleigh");//doppia, grigia
        InizializzazioneTratte(tratte, 70, 5, "Saint Louis", "Pittsburgh");//verde
        InizializzazioneTratte(tratte, 71, 2, "Pittsburgh", "Washingston");//grigia
        InizializzazioneTratte(tratte, 72, 2, "New York", "Washingston");//doppia, arancione, nera
        InizializzazioneTratte(tratte, 73, 4, "Nashville", "Pittsburgh");//gialla
        InizializzazioneTratte(tratte, 74, 2, "Pittsburgh", "Raleigh" );//grigia
        InizializzazioneTratte(tratte, 75, 2, "Washington", "Raleigh");//doppia, grigia
        InizializzazioneTratte(tratte, 76, 3, "Nashville", "Raleigh");//nera
        InizializzazioneTratte(tratte, 77, 6, "Helena", "Duluth");//arancione
        









    }

    public static void InizializzazioneTratte(Tratta tratte[], int i, int lunghezza, String inizio, String fine){

        tratte[i] = new Tratta(lunghezza, inizio, fine);

    }
}
