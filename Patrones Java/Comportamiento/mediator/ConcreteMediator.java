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
public class ConcreteMediator implements Mediator{

	   // Fields
	  private ConcreteColleague1 colleague1;
	  private ConcreteColleague2 colleague2;

	  // Properties
	  public void setColleague1(ConcreteColleague1 value)
	  {
	    colleague1 = value;
	  }

	  public void setColleague2(ConcreteColleague2 value){
	    colleague2 = value;
	  }

	  // Methods
	  public void Send(String message, Colleague colleague){
	    if(colleague == colleague1)
	      colleague2.Notify(message);
	    else
	      colleague1.Notify(message);
	  }
}
