package Concept_A;

/*
        1)Declare an array
        2) insert values into array
        3) Find size of an array
        4) read single value from an array
        5) read multiple values from an array
*/
public class Demo_2daimesion {

    public static void main(String[] args) {
        // Apporch 1
        // Declare an array
       /* int a[][]=new int[3][2];

        //insert the value in array
        a[0][0]=100;
        a[0][1]=200;
        a[1][0]=300;
        a[1][1]=400;
        a[2][0]=500;
        a[2][1]=600;*/

        // 2 ways
         int a[][]={{100,200},
                   {300,400},
                   {500,600}};
        System.out.println(a.length);//3

        //lenght of array
        System.out.println(a[0].length);//2

        //specific row and colom
        //System.out.println(a[1][1]);//400

        //reading data from array using for loop
       /* for(int r=0;r<=a.length;r++) {
            for (int c = 0; c <= a[r].length; c++) {

                System.out.println(a[r][c] + " ");
            }
            System.out.println();
        }*/

        for(int x[]:a)
        {
            for(int v:x)
            {
                System.out.println(v+ " ");
            }
            System.out.println();
        }




    }
}
