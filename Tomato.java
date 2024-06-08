class Tomato extends SandwichDecorator
{
  public Tomato (Sandwich sandwich)
  {
	super (sandwich);
  }
   @Override public double cost ()
  {
	return sandwich.cost () + 1.99;
  }
}