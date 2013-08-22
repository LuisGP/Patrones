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
public class ConcreteObserver extends Observer {

	// Fields
	private String name;
	private String observerState;
	private ConcreteSubject subject;

	// Constructors
	public ConcreteObserver(ConcreteSubject subject,String name){
	    this.subject = subject;
	    this.name = name;
	}

	// Methods
	public void Update(){
	    observerState = subject.getSubjectState();
	    System.out.println("Observer "+name+"s new state is "+observerState);
	}

	// Properties
	public ConcreteSubject getSubject(){
	    return subject;
	}
	
	public void setSubject(ConcreteSubject value){
	    subject = value;
	}
}
