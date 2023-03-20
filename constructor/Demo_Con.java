package constructor;

public class Demo_Con {
    // variable declare and assign the value
    int i=10;

    Demo_Con(){
        i=10;
        i=20;
    }

    public static void main(String[] args) {
        Demo_Con c=new Demo_Con();
        System.out.println(c.i);

    }
}
