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
public class Caretaker {
	private Memento memento;
	
	public Memento getMemento(){
		return this.memento;
	}
	
	public void setMemento(Memento mem){
		this.memento = mem;
	}
}
