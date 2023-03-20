package encapslation;

public class Account_Encap
{
    // declare a variable
    //every varible is private
    /* this keyword when we use  like class
    variable ,method variable also local variable are same
    then we have to differentiate them by using this keyword
     */
    private int acc_no;
    private String name;
    private double amount;

    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    //seeter its assign the value
    /*void setaccno(int accno){// method take parametrs and assign the value
        acc_no=accno;
    }
    //geeter when just return the value
    int getaccno(){
        return acc_no;
    }*/

    public static void main(String[] args) {

        // create an object

        Account_Encap acc_obj=new Account_Encap();
        // we have to access a variable, so we have to use set method and pass the arguments
        acc_obj.setAcc_no(124);
        acc_obj.setName("Mona patel");
        acc_obj.setAmount(1000);

        // we use return a value  from the variable so use a Get method
        System.out.println(acc_obj.getAcc_no());
        System.out.println(acc_obj.getName());
        System.out.println(acc_obj.getAmount());



    }
}
