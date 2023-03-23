package Concept_A;

/*
1)Declare an array
2) insert values into array
3) Find size of an array
4) read single value from an array
5) read multiple values from an array
 */

import java.util.Arrays;

public class Demo_singleDArray {
    public static void main(String[] args) {

        // 1 way
        /*int a[]=new int[5];// Declare array

        a[0]=100;// store the value in array
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;*/

        // 2 way
        int a[]={100,200,300,400,500,600};

        // size and length of an array

        //System.out.println(a.length);//6

        //get a single value of an array

        System.out.println(a[3]);

        // get a all value from the array

        System.out.println(Arrays.toString(a));

        //get all value using for loop

        // if you don't know the all value in array o use a.length
        // like for(int i=0;i<a.length;i++)
        for(int i=0;i<=4;i++)

        {
            System.out.println(a[i]);
        }

        // by using enhance  for loop
        /*for(int d:a)
        {
            System.out.println(d);
        }*/



    }
}
