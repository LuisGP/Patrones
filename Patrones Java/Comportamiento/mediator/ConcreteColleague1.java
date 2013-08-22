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
public class ConcreteColleague1 extends Colleague {
	
	public ConcreteColleague1( Mediator mediator ){
		super(mediator);
	}

	// Methods
	public void Send(String message){
		mediator.Send(message, this);
	}

	public void Notify(String message){
		System.out.println("Colleague1 gets message: "+ message);
	}
}
