import java.util.Scanner;
class pos
{
    public static void main(String[] args) 
    {
        int number;
        Scanner scan = new Scanner(System.in);  //scanner class is used to get input
        System.out.print("Enter the number you want to check:");
        number = scan.nextInt();
        if(number > 0)
        {
            System.out.println("given number is positive"+number);
        }
        else if(number < 0)
        {
            System.out.println("given number is negative"+number);
        }
        else
        {
            System.out.println(number+" is neither positive nor negative");
        }
    }
}