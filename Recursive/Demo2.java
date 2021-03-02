/*
 Write a recursive program which display below pattern.
Input : 5
Output : 1 2 3 4 5

*/

import java.lang.*;
import java.util.*;

class Rec
{
    static int no=1;
    void DisplayRec(int num)
    {
        
        if(num!=0)
        {
            System.out.println(no);
            no++;
            num--;
            DisplayRec(num);
        }
        
    }
}

class Demo2
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