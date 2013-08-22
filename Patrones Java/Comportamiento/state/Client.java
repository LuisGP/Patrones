/*
 * Created on 12-jun-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package state;

/**
 * @author Luis Gasco Poderoso
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Client{
  public static void Main(String[] args){
    // Setup context in a state
    Context c = new Context( new ConcreteStateA() );
    c.Show();

    // Issue request, which toggles state
    c.Request();
    c.Show();

    // Issue request, which toggles state
    c.Request();
    c.Show();
  }
}
