/*
 .Write a recursive program which display below pattern.
Input : 5
Output : 5 4 3 2 1


*/

import java.lang.*;
import java.util.*;

class Rec
{
    void DisplayRec(int num)
    {
        if(num!=0)
        {
            System.out.println(num);
            num--;
            DisplayRec(num);
        }
        
    }
}

class Demo3
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