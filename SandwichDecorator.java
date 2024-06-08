abstract class SandwichDecorator extends Sandwich
{
  Sandwich sandwich;
  public SandwichDecorator (Sandwich sandwich)
  {
	this.sandwich = sandwich;
  }
   @Override public double cost ()
  {
	return sandwich.cost ();
  }
}