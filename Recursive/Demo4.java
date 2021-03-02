/*
 Write a recursive program which accept number from user and return
summation of its digits.
Input : 879
Output : 24



*/

import java.lang.*;
import java.util.*;

class Rec
{
    static int digit=0;
    static int sum=0;
    int  DisplayRec(int num)
    {
        
        if(num!=0)
        {
            digit=num%10;
            sum=sum+digit;
            num=num/10;
            DisplayRec(num);
        }
        return sum;
    }
}

class Demo4
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