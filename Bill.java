import java.util.*;
public class Bill
{
  void calcBill(double charge,String p,String d)
  {    
      Info ob=new Info();
      System.out.println("            Your Boarding Pass");
      System.out.println("           ____________________");
      System.out.println();
      System.out.println("                                      Our lowest fares at");
      System.out.println("        IndiGo                        Phượng Hoàng airlines.in");
      System.out.println("__________________________________________________________________________________________________________________________________");
      System.out.println("                                                         SPECIAL SERVICES");
      System.out.println("                                As a courtesy to fellow");
      System.out.println("                                passengers please place");
      System.out.println("                                your carry-on items in the");
      System.out.println("                                overhead bin above your");
      System.out.println("                                own seat.");
      System.out.println("  Name           "+ob.name);
      System.out.println("                                                            NIL");
      System.out.println("  From           "+p+"       To "+d);
      System.out.println();
      int f2=(int)(Math.random()*12);
      int f1=(int)((Math.random()*(320-300))+300);int f=(int)(Math.random()*11);
      System.out.print("  Flight         "+f+"E "+f1+"        Date     ");
      for(int i=0;i<3;i++)
      {
        if(i!=2)
           System.out.print(ob.date[i]+"/");
        else
           System.out.println(ob.date[i]);
      }
      System.out.println("                                                        Name:"+ob.name);
      int th=(int)((Math.random()*(9-1))+1);
      int ts=(int)((Math.random()*(55-1))+1);
      System.out.println("  Boarding Time  "+th+":"+ts+"pm"+"        Departure Time "+(th+1)+":"+ts+"pm      Pnr: IR34AS");
      System.out.println("                                                        Flt: "+f+"E "+f1);
      int s=(int)((Math.random()*(140-100))+100);
      System.out.println("  Sequence       "+s+"           Class     N              Seat:"+f2+"E");
      System.out.println("                                                        Seq: "+s);
      System.out.println("  Gate           "+(int)((Math.random()*(4-1))+1)+"             Seat Number  "+f2+"E");
      System.out.println();
      System.out.println("Thank you for choosing Phượng Hoàng airlines today.\nPlease be at your departure gate at the indicated boarding time.\nAny passenger failing to do so may be refused boarding privileges.\nFrisking of passengers and checking of hand baggage is a mandatory procedure.\nPassengers are requested to co-operate with Phượng Hoàng's Security Services Team.\nHave a pleasant flight.");
      System.out.println("Call   0 99 10 38 38 38 / 0124 661 38 38");
      Calendar c=Calendar.getInstance(); 
      if(c.get(Calendar.HOUR)==0)
        System.out.println("                                                                                                        "+(c.get(Calendar.HOUR)+12)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
      else
        System.out.println("                                                                                                        "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
      System.out.println("                                                                                                        "+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
  }
}
