import devices.Car;
import devices.Phone;

public class Main
{
    public static void main(String[] args)
    {
        Car car1 = new Car("Mitsubishi", "Lancer VII", 2004,"GKE 122RW", 4, 2000, 15000);
        Phone phone1 = new Phone("Xiaomi", "Redmi", 2017, "Android 8.0");

        System.out.println(car1);
        System.out.println(phone1);
        car1.Turn_On();
        car1.Turn_On();
        phone1.Turn_On();
        phone1.Turn_On();
    }
}