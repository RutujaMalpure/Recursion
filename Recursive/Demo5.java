/*
Write a recursive program which accept number from user and return its
factorial.
Input : 5
Output : 120




*/

import java.lang.*;
import java.util.*;

class Rec
{
    
   
    static int fact=1;
   
    int  DisplayRec(int num)
    {
        
        if(num!=0)
        {
           
            fact=fact*num;
            num--;
            
            DisplayRec(num);
        }
        return fact;
    }
}

class Demo5
{
    public static void main(String args[])
    {
        System.out.println("Enter the number");
        Scanner sobj=new Scanner(System.in);

        int num=sobj.nextInt();
        int ret=0;

    Rec dobj=new Rec();
    ret=dobj.DisplayRec(num);
    System.out.println(ret);


    }
}