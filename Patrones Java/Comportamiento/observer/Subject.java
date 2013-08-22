/*
 * Created on 12-jun-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package observer;

import java.util.Vector;

/**
 * @author Luis Gasco Poderoso
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public abstract class Subject {
	//Fields
	private Vector observers = new Vector();

	// Methods
	public void Attach(Observer observer){
	    observers.add(observer);
	}

	public void Detach(Observer observer){
	    observers.remove(observer);
	}

	public void Notify(){
	    for(int i = 0; i < observers.size(); i++)
	    	((Observer)this.observers.get(i)).Update();
	}
}
