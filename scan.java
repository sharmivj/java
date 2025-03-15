import java.util.Scanner;
class Scan
{
    public static void main(String args[])
    {
        Scanner myscan=new Scanner(System.in);
        System.out.println(" enter the name:");
        String username=myscan.next();
        System.out.println("the username is :" +username);
    }
}