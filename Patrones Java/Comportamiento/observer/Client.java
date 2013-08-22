/*
 * Created on 12-jun-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package observer;

/**
 * @author Luis Gasco Poderoso
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Client{
  public static void Main(String[] args)
  {
    // Configure Observer structure
    ConcreteSubject s = new ConcreteSubject();
    s.Attach( new ConcreteObserver( s, "X" ) );
    s.Attach( new ConcreteObserver( s, "Y" ) );
    s.Attach( new ConcreteObserver( s, "Z" ) );

    // Change subject and notify observers
    s.setSubjectState("ABC");
    s.Notify();
  }
}