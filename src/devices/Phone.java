package devices;

public class Phone extends Device
{
    public String sys_oper;
    private boolean on = false;
    public static int counter=0;

    public Phone(String producer, String model, int year_of_production, String sys_oper)
    {
        super(producer, model, year_of_production);
        this.sys_oper = sys_oper;

        System.out.println("Utworzono obiekt PHONE numer: " + counter);
        counter++;
    }

    @Override
    public String toString()
    {
        return super.toString()+" "+sys_oper;
    }

    @Override
    public void Turn_On()
    {
        if(on != true)
        {
            on = true;
            System.out.println("Telefon został włączony");
        }
        else
            System.out.println("Telefon już jest włączony!");
    }
}
