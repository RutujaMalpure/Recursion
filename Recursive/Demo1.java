/*
Write a recursive program which display below pattern.


Input : 5
Output : * * * * *
*/

import java.lang.*;
import java.util.*;

class Rec
{
    void DisplayRec(int num)
    {
        
        if(num!=0)
        {
            System.out.print("*\t");
            num=num-1;
            DisplayRec(num);
        }
        
    }
}

class Demo1
{
    public static void main(String args[])
    {
        System.out.println("Enter the number");
        Scanner sobj=new Scanner(System.in);

        int num=sobj.nextInt();
    

    Rec dobj=new Rec();
    dobj.DisplayRec(num);


    }
}