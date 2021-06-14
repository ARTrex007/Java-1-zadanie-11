public class Animal
{
    public String imie;
    public final String species;
    public boolean najedzony;
    public int wiek;
    private double WEIGHT;
    public static int counter=0;

    public Animal(String imie, String gatunek, boolean najedzony, int wiek) {
        this.imie = imie;
        this.species = gatunek;
        this.najedzony = najedzony;
        this.wiek = wiek;

        if(species == "Pies")
            WEIGHT = 15;
        else if(species == "Kot")
            WEIGHT = 4;
        else if(species == "Koń")
            WEIGHT = 100;
        else
            WEIGHT = 10;

        System.out.println("Utworzono obiekt ANIMAL numer: " + counter);
        counter++;
    }

    public String toString()
    {
        return imie+" "+species+" "+najedzony+" "+wiek+" "+WEIGHT;
    }

    void Feed()
    {
        if(WEIGHT>0)
        {
            WEIGHT++;
            System.out.println("Nakarmiłeś " + species + " " + imie);
        }
        else
            System.out.println(species + " " + imie + " Nie żyje ;(");
    }

    void Take_for_a_walk()
    {
        if(WEIGHT>0)
        {
            WEIGHT--;
            System.out.println("Wyprowadziłeś " + species + " " + imie + " na spacer");
        }
        else
            System.out.println(species + " " + imie + " Nie żyje ;(");
    }
}
