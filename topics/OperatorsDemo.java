package topics;

public class OperatorsDemo {
    public static void main(String[] args)
    {
        int a=10;
        int b=20;

        //Arithmetic operators   + - *  / %
        System.out.println(a+b);
        //Concretion two ways we're going to use +
        System.out.println("sum of a and b is:"+(a+b));
        System.out.println("diff of b and a is:"+(b-a));
        System.out.println("mul of a and b is:"+(a*b));
        System.out.println("Div of a and b is:"+(a/b));
        System.out.println("mod div of a and b is:"+(a%b));


        //Relational / comparison Operators // > >= < <= != ==

        System.out.println(a>b);// false
        System.out.println(b>a);// true
        System.out.println(a<b); //true
        System.out.println(a>b);//false
        System.out.println(a!=b);//true
        System.out.println(a<=b);// true
        System.out.println(a>=b);//false


        //Logical && || !

        /*boolean x=true;
        boolean y=false;

        System.out.println(x && y);//false
        System.out.println(x || y);//True
        System.out.println(!x);//false */




    }
}
