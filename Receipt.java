public class Receipt
{
  void gt(String v,double c)
  {
      Info ob=new Info();
      System.out.println("                Receipt");
      System.out.println("               __________");
      System.out.println();
      System.out.print("Name");
      for(int i=1;i<=ob.name.length();i++)
         System.out.print(" ");
      System.out.print("Flight    Flight type");
      for(int i=1;i<=v.length()+4;i++)
         System.out.print(" ");
      System.out.println("Charge");
      System.out.println();
      System.out.print(ob.name+"    Phượng Hoàng airlines    "+v);
      for(int i=1;i<=((11-v.length())+v.length()+4);i++)
         System.out.print(" ");
      System.out.println("Rs"+c+"0");
      System.out.println();
      System.out.println();
  }
}
  