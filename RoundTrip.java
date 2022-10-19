import java.util.*;
public class RoundTrip
{
  void manipulate()
  {
      new Info().getInfo();
      new Infor().getInfo1();
      System.out.println("                         RATE CHART");
      System.out.println("______________________________________________________________________");
      System.out.println();
      System.out.println("                  City                  Rate");
      System.out.println("                 ------                -------");
      System.out.println();
      System.out.println("            1.Kolkata-New Delhi       INR 2399");
      System.out.println("            2.Mumbai-Kolkata          INR 4304");
      System.out.println("            3.New Delhi-Mumbai        INR 2888");
      System.out.println("            4.Hyderabad-Kolkata       INR 3809");
      System.out.println("            5.Hyderabad-New Delhi     INR 3370");
      System.out.println("            7.Hyderabad-Mumbai        INR 1600");
      System.out.println();
      System.out.println("_______________________________________________________________________");
      System.out.println();
      String d="";
      String p="";
      double charge=0.0;
      byte e=0;
      do{
         System.out.println("Enter your current position.");
         p=new Scanner(System.in).nextLine();
         p=p.trim();
         p=p.toLowerCase();
         System.out.println("Enter your destination.");
         do
         {
             d=new Scanner(System.in).nextLine();
             d=d.trim();
             d=d.toLowerCase();
             if(d.equals(p))
               System.out.println("SORRY!Aircrafts dont't fly from a place to that same place.");
         }while(d.equals(p));
         if(!(p.equals("new delhi"))&&!(p.equals("kolkata"))&&!(p.equals("mumbai"))&&!(p.equals("hyderabad")))
            System.out.println("Unable to locate your position.");
         if(!(d.equals("new delhi"))&&!(d.equals("kolkata"))&&!(d.equals("mumbai"))&&!(d.equals("hyderabad")))
            System.out.println("Unable to locate your destination.");
      }while((!(p.equals("new delhi"))&&!(p.equals("kolkata"))&&!(p.equals("mumbai"))&&!(p.equals("hyderabad"))||(!(d.equals("new delhi"))&&!(d.equals("kolkata"))&&!(d.equals("mumbai"))&&!(d.equals("hyderabad")))));
      if(p.equals("new delhi"))
      {
          if(d.equals("kolkata"))
             charge=2399.00;
          else if(d.equals("mumbai"))
             charge=2888.00;
          else
             charge=3370.00;
      }
      else if(p.equals("kolkata"))
      {
          if(d.equals("new delhi"))
             charge=2399.00;
          else if(d.equals("mumbai"))
             charge=4304.00;
          else
             charge=3809.00;
      }
      else if(p.equals("mumbai"))
      {
          if(d.equals("kolkata"))
             charge=4304.00;
          else if(d.equals("new delhi"))
             charge=2888.00;
          else
             charge=1600.00;
      }
      else
      {
          if(d.equals("kolkata"))
             charge=3809.00;
          else if(d.equals("mumbai"))
             charge=1600.00;
          else
             charge=3370.00;
      }
      p=p.toUpperCase();
      d=d.toUpperCase();
      int f1=(int)((Math.random()*(320-300))+300);
      System.out.println("\u000c");
      String r="ROUND TRIP";
      charge=new Registration().reg(charge);
      System.out.println("\u000c");
      charge=new Payment().pay(charge);
      System.out.println("\u000c");
      new Receipt().gt(r,(charge*2));int f=(int)(Math.random()*11);
      new Billr().calcBill(charge,p,d,e,f1,f);
      e++;
      new Billr().calcBill(charge,p,d,e,f1,f); 
  }
}