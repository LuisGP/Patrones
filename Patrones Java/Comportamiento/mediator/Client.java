/*
 * Created on 12-jun-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package mediator;

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
    ConcreteMediator m = new ConcreteMediator();
    ConcreteColleague1 c1 = new ConcreteColleague1( m );
    ConcreteColleague2 c2 = new ConcreteColleague2( m );

    m.setColleague1(c1);
    m.setColleague2(c2);

    c1.Send( "How are you?" );
    c2.Send( "Fine, thanks" );
  }
}
