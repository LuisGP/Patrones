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
public class Context {
	private State state;

	// Constructors
	public Context( State state ){
		this.state = state;
	}
	
	// Properties
	public State getState(){
		return state;
	}
	
	public void setState(State value){
		state = value;
	}
	
	// Methods
	public void Request(){
		state.Handle(this);
	}
	
	public void Show(){
		System.out.println("State: " + state);
	}
}
