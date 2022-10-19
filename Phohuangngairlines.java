import java.util.*;
public class Phohuangngairlines
{
   static char ch;
   static void go()
   {
       String s="";
       System.out.println("                                     WELCOME TO Phượng Hoàng airlines.in");
       System.out.println("                                         Aap ki seva me har samay ");
       System.out.println("==================================================================================================================================================================");
       System.out.println();
       System.out.println();
       System.out.println("If you are an old user then enter your login password but if you are a new user then signup with us.");
       System.out.println("Old user ?(Y/N)");
       ch=new Scanner(System.in).next().charAt(0);
       String a="";
       if(ch=='y'||ch=='Y')
       {
          do
          {
              System.out.println("Enter your password.");
              s=new Scanner(System.in).next();
              if(s.length()!=6)
                 System.out.println("Invalid password.");
          }while(s.length()!=6);
       }
       else
       {
          System.out.println("Enter a valid email ID.");
          String e=new Scanner(System.in).next();
          System.out.println("Enter your 6-digit password.");
          String p=new Scanner(System.in).next();
       }
       System.out.println("\u000c");
       do
       {
          System.out.println("What flight type would you like to avail?\n< ONE WAY\n< ROUND TRIP");
          a=new Scanner(System.in).nextLine();
          a=a.toLowerCase();
          if(!(a.equals("one way"))&&!(a.equals("round trip")))
             System.out.println("FLIGHT TYPE UNAVAILABLE.");
       }while(!(a.equals("one way"))&&!(a.equals("round trip")));
       if(a.equals("one way"))
       {
           System.out.println("\u000c");
           new OneWay().manipulate1();
       }
       else
       {
           System.out.println("\u000c");
           new RoundTrip().manipulate();
       }
   }
}