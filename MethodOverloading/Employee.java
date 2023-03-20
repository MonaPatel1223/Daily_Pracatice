package MethodOverloading;

public class Employee {
     // variable declare
    int x,y,z;
    double d;
    void Emp(){
        x=10;
        y=20;
        System.out.println(x+y);
    }
    void Emp( int a,int b){
        x=a;
        y=b;
        System.out.println(x+y);
    }
    void Emp(int a,double c){
        x=a;
        d=c;
        System.out.println(x+d);

    }
    void Emp(double c,int a){
        d=c;
        x=a;
        System.out.println(d+x);
    }

    public static void main(String[] args) {
        Employee e=new Employee();
        e.Emp();//30
        e.Emp(10,20);//30
        e.Emp(10,10.5);//20.5
        e.Emp(10.5,10);//20.5

    }
}
