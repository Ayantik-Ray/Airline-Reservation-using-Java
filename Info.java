import java.util.*;
public class Info
{
 static String name;
 static String address;
 static String phone;
 static String date[];
 static void getInfo()
 {
     char ch;
     do
     {
         System.out.println("Enter your name.");
         name=new Scanner(System.in).nextLine();
         name=name.toUpperCase();
         System.out.println("Enter date of departure in dd/mm/yy format.");
         date=new String[3];
         for(int i=0;i<3;i++)
            date[i]=new Scanner(System.in).next();
         System.out.println("Do you confirm(Y/N)?");
         ch=new Scanner(System.in).next().charAt(0);
         System.out.println("\u000c");
     }while(ch=='n'||ch=='N');
 }
}
     