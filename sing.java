class vehicle
{
    String color;
    int year;
    vehicle(String color,int year)
    {
        this.color=color;
        this.year=year;
    }
    void displaycolor()
    {
        System.out.println("color:" +color);
    }
    void displayyear()
    {
        System.out.println("year:" +year);

    }
}


class car extends vehicle{
    car(String color, int year)
    {
        super(color,year);
    }
    void displayDetails()
    {
        displaycolor();
        displayyear();
    }
    
}

public class sing
{
    public static void main(String args[])
    {
        car mycar=new car("red",1998);
        mycar.displayDetails();
    }
}
