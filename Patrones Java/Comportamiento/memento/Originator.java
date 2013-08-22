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
public class Originator {

	private String state;
		
	public void setMemento(Memento m){
		this.state = m.getState();
	}
	
	public Memento CreateMemento(){
		return new Memento(this.state);
	}
	
	public void setState(String st){
		this.state = st;
	}
	
	public String getState(){
		return this.state;
	}
}
