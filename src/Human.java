import devices.Car;

import java.time.LocalDateTime;

public class Human
{
    public boolean equals(Object obj)
    {
        return this.wiek == ((Human)obj).wiek;
    }

    public int hashCode()
    {
        return this.wiek;
    }

    public String imie, nazwisko, zawod, animal_pet;
    public int wiek;
    public double masa;
    public static int counter=0;

    private double salary;
    void Get_Salary()
    {
        System.out.println("Obecne wynagrodzenie: " + salary);
        System.out.println("Data operacji: " + LocalDateTime.now());
    }
    void Set_Salary(double salary)
    {
        if(salary>0)
        {
            System.out.println("Nowe dane zostały wysłane do systemu księgowego");
            System.out.println("Prosimy o odebranie aneksu do umowy od Pani Katarzyny z kadr");
            System.out.println("ZUS i US już wiedzą...");
            this.salary = salary;
        }
        else
            System.out.println("Wypłata nie może być ujemna!");
    }

    private Car samochod;;
    void Get_Samochod()
    {
        System.out.println(imie + " " + nazwisko + " posiada samochód: " + samochod.model);
    }
    void Set_Samochod(Car samochod)
    {
        if(salary>samochod.wartosc)
        {
            System.out.println("Udało się kupić samochód za gotówkę");
            this.samochod = samochod;
        }
        else if (salary>(samochod.wartosc/12))
        {
            System.out.println("Udało się kupić samochód na kredyt");
            this.samochod = samochod;
        }
        else
            System.out.println("Nie udało się kupić samochodu, będzie potrzebna podwyżka");
    }

    public Human(String imie, String nazwisko, String zawod, int wiek, double masa, double salary) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.zawod = zawod;
        this.wiek = wiek;
        this.masa = masa;
        this.salary = salary;


        //this.animal_pet = animal_pet;
        System.out.println("Utworzono obiekt HUMAN numer: " + counter);
        counter++;
    }

    public String toString()
    {
        return imie+" "+nazwisko+" "+zawod+" "+wiek+" "+masa+" "+samochod;
    }

}
