package condition;


// which is largest Number

public class Largest3number

{
    public static void main(String[] args)
    {
        int a=10;
        int b=20;
        int c=30;

        if(a>b && a>c)
        {
            System.out.println(" a is largest number");
        } else if (b>a && b>c)
        {
            System.out.println("b is largest number");
        }
        else {
            System.out.println("c is largest number");
        }
    }
}
