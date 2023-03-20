package methods;

public class Non_Static {
    // non-static
    void Emp( int i,String Name){
        System.out.println("Id:"+i);
        System.out.println("name:"+Name);
        //System.out.println("Mona");
    }
    public static void main(String[] args) {
        Non_Static e=new Non_Static();
        e.Emp(10,"Mona");

    }
}
