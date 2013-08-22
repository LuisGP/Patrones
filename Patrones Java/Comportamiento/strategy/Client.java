/*
 * Created on 12-jun-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package strategy;

/**
 * @author Luis Gasco Poderoso
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Client
{
  public static void Main(String[] args)
  {
    // Three contexts following different strategies
    Context c = new Context(new ConcreteStrategyA());
    c.ContextInterface();

    Context d = new Context(new ConcreteStrategyB());
    d.ContextInterface();

    Context e = new Context(new ConcreteStrategyC());
    e.ContextInterface();
  }
}

