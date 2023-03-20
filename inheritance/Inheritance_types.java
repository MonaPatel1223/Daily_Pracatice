package inheritance;


class Parent{
    int a;
    void display(){
        System.out.println(a);
    }
}
class Child extends A {
    int b;

    void show() {
        System.out.println(b);
    }
}

class Grandchild extends Child{
    int c=300;
     void myMethod(){
         System.out.println(c);
     }
}
public class Inheritance_types {
    public static void main(String[] args) {
       /* Child c=new Child();
        c.a=100;
        c.b=200;

        c.display();
        c.show();*/
        // crete an objecct
        Grandchild g=new Grandchild();
        // asign the arguments in ref objcet
        g.a=100;
        g.b=200;
        g.c=300;
        // call the method
        g.display();
        g.show();
        g.myMethod();

    }

}
