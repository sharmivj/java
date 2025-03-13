public class logic
{
    public static void main(String args[])
    {
        int a=10;
        int b=30;
        if(a==b && a>b)
        {
            System.out.println("the condition is true for &&");
        }
        if(a==b || a<b)
        {
            System.out.println("the condition is true for ||");
        }
        else
        {
            System.out.println("Invalid for & and |");
        }
    }
}