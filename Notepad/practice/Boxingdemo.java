class Boxingdemo
{
  public static void main(String args[])
  {
    int a=0;
    int b=0;
    if (args.length!=0)
    {
       a=Integer.parseInt(args[0]);
       b=Integer.parseInt(args[1]);
       System.out.println(a+b);
    }
    else
    {
       System.out.println("please pass two integers as arguments!");
    }
  }
}