package constructor;

import java.util.concurrent.Callable;

public class Con_para {
int Id;
String Name;
    Con_para(int id,String name){
        Id=id;
        Name=name;

        //System.out.println("Id:"+id);
        //System.out.println("Name:"+name);
    }
    public static void main(String[] args)
    {
       Con_para c=new Con_para(10,"Mona");
       c.Id=10;
       c.Name="Mona";
        System.out.println(c.Id);
        System.out.println(c.Name);






            }
        }



