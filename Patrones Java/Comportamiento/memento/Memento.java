/*
 * Created on 12-jun-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package memento;

/**
 * @author Luis Gasco Poderoso
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Memento {
	private String state;
	
	public Memento(String st){
		this.state = st;
	}
	
	public String getState(){
		return this.state;
	}
	
	public void setState(String st){
		this.state = st;
	}
}
