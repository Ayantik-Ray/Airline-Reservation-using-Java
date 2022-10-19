import java.util.*;
public class Payment
{
   double pay(double ch)
   {
       char c;byte doc;
       do
       { 
           System.out.println("================================================================================================");
           System.out.println("                                          PAYMENT ");
           System.out.println("================================================================================================");
           System.out.println();
           System.out.println("WOULD YOU LIKE TO PAY USING DEBIT CARD OR CREDIT CARD OR NET BANKING ? ");
           System.out.println("Press 1 for debit card.\nPress 2 for credit card.\nPress 3 for net banking.(*currently unavailable due to internal problems*)");
           doc=new Scanner(System.in).nextByte();            
           if(doc==2)
           {
               System.out.println("Enter the type of your credit card.\nPress 1 for Mastercard or Discover Credit cards\nPress 2 for American Express Credit cards\nPress 3 for Diner's Club Credit cards\nPress 4 for Visa or Visa Electron Credit cards");
               byte a=new Scanner(System.in).nextByte();
               long b;
               if(a==4)
               {
                   do{
                       System.out.println("Enter card number.");
                       b=new Scanner(System.in).nextLong();
                       if(((int)Math.log10(b)+1)!=13&&(((int)Math.log10(b)+1)!=16))
                           System.out.println("Invalid.");
                   }while(((int)Math.log10(b)+1)!=13&&(((int)Math.log10(b)+1)!=16));
                   return (ch-ch*0.15);
               }
               else if(a==1)
               {
                   do{
                       System.out.println("Enter card number.");
                       b=new Scanner(System.in).nextLong();
                       if(((int)Math.log10(b)+1)!=13)
                           System.out.println("Invalid.");
                   }while(((int)Math.log10(b)+1)!=13);
                   return (ch-ch*0.12);
               }
               else if(a==2)
               {
                   do{
                       System.out.println("Enter card number.");
                       b=new Scanner(System.in).nextLong();
                       if(((int)Math.log10(b)+1)!=15)
                           System.out.println("Invalid.");
                   }while(((int)Math.log10(b)+1)!=15);
                   return (ch-ch*0.1);
               }
               else
               {
                   do{
                       System.out.println("Enter card number.");
                       b=new Scanner(System.in).nextLong();
                       if(((int)Math.log10(b)+1)!=14)
                           System.out.println("Invalid.");
                   }while(((int)Math.log10(b)+1)!=14);
                   return (ch-ch*0.13);
               }
           }
           else if(doc==1)
           {
               System.out.println("Enter the type of your debit card.\nPress 1 for Maestro Debit cards\nPress 2 for Laser(Ireland Debit Card) Debit cards\nPress 3 for Switch(United Kingdom Debit Card) Debit cards\nPress 4 for Solo(United Kingdom Debit Card)Debit cards\nPress 5 for JCB Debit cards\nPress 6 for China UnionPay Debit cards");
               byte a=new Scanner(System.in).nextByte();
               long b;
               if(a==1)
               {
                   do{
                       System.out.println("Enter card number.");
                       b=new Scanner(System.in).nextLong();
                       if(((int)Math.log10(b)+1)!=12&&(((int)Math.log10(b)+1)!=19))
                           System.out.println("Invalid.");
                   }while(((int)Math.log10(b)+1)!=12&&(((int)Math.log10(b)+1)!=19));
                   return (ch-ch*0.05);
               }
               else if(a==2)
               {
                   do{
                       System.out.println("Enter card number.");
                       b=new Scanner(System.in).nextLong();
                       if(((int)Math.log10(b)+1)!=16&&(((int)Math.log10(b)+1)!=19))
                           System.out.println("Invalid.");
                   }while(((int)Math.log10(b)+1)!=16&&(((int)Math.log10(b)+1)!=19));
                   return (ch-ch*0.06);
               }
               else if(a==3)
               {
                   do{
                       System.out.println("Enter card number.");
                       b=new Scanner(System.in).nextLong();
                       if(((int)Math.log10(b)+1)!=16&&(((int)Math.log10(b)+1)!=19)&&(((int)Math.log10(b)+1)!=18))
                           System.out.println("Invalid.");
                   }while(((int)Math.log10(b)+1)!=16&&(((int)Math.log10(b)+1)!=19)&&(((int)Math.log10(b)+1)!=18));
                   return (ch-ch*0.1);
               }
               else if(a==4)
               {
                   do{
                       System.out.println("Enter card number.");
                       b=new Scanner(System.in).nextLong();
                       if(((int)Math.log10(b)+1)!=16&&(((int)Math.log10(b)+1)!=19)&&(((int)Math.log10(b)+1)!=18))
                           System.out.println("Invalid.");
                   }while(((int)Math.log10(b)+1)!=16&&(((int)Math.log10(b)+1)!=19)&&(((int)Math.log10(b)+1)!=18));
                   return (ch-ch*0.1);
               }
               else if(a==5)
               {
                   do{
                       System.out.println("Enter card number.");
                       b=new Scanner(System.in).nextLong();
                       if(((int)Math.log10(b)+1)!=16&&(((int)Math.log10(b)+1)!=15))
                           System.out.println("Invalid.");
                   }while(((int)Math.log10(b)+1)!=16&&(((int)Math.log10(b)+1)!=15));
                   return (ch-ch*0.8);
               }
               else
               {
                   do{
                       System.out.println("Enter card number.");
                       b=new Scanner(System.in).nextLong();
                       if(((int)Math.log10(b)+1)!=16)
                           System.out.println("Invalid.");
                   }while(((int)Math.log10(b)+1)!=16);
                   return (ch-ch*0.7);
               }
           }
           else
           {
               System.out.println("Invalid input.Option unavailable.");
               System.out.println("\u000c");
               //continue;
           }
           System.out.println("Do you confirm?(Y/N)");
           c=new Scanner(System.in).next().charAt(0);
           if(c=='n'||c=='N')
               System.out.println("\u000c");
       }while(c=='n'||c=='N');
       return ch;
   }
}