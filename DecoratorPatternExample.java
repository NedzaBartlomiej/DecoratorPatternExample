public class DecoratorPatternExample
{
  public static void main (String[]args)
  {
	BigMac bm1 = new BigMac ();
	  System.out.println ("BigMac cost: " + bm1.cost ());
	Tomato bm1WithTomato = new Tomato (bm1);
	  System.out.println ("BigMac with tomato cost: " +
						  bm1WithTomato.cost ());
  }
}