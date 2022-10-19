import java.util.*;
public class Registration
{
   double reg(double cha)
   {
       System.out.println("Enter number of members who would travel.");
       int m=new Scanner(System.in).nextInt();
       char c;int ch=0;
       System.out.println("For every child below five years there will be a rebate of 10% on the ticket.");
       System.out.println("Any child below five years ?(Y/N)");
       c=new Scanner(System.in).next().charAt(0);
       if(c=='y'||c=='Y')
       {
           System.out.println("How many ?");
           ch=new Scanner(System.in).nextInt();
       }
       cha=cha*(m-ch)+0.1*cha*ch;
       char s=new Phohuangngairlines().ch;
       int a=0;
       if(s=='y'||s=='Y')
       {
           System.out.println("How many times have you travelled on our aircrafts ?");
           a=new Scanner(System.in).nextInt();
       }
       cha-=cha*0.2;
       return cha;
    }
}
           