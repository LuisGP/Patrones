/*
 * Created on 11-jun-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package iterator;

import java.util.Vector;


/**
 * @author Luis Gasco Poderoso
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class AgregadoConcreto extends Agregado{

	private Vector items = new Vector();
	
	public Iterator CrearIterador() {
		return new ConcreteIterator(this);
	}
	
	public Object get(int index){
		return this.items.get(index);
	}

	public void set(Object item){
		this.items.add(item);
	}
	
	public int length(){
		return this.items.size();
	}
}
