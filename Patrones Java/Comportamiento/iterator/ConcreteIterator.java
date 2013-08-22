/*
 * Created on 11-jun-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package iterator;

/**
 * @author Luis Gasco Poderoso
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ConcreteIterator implements Iterator {

	private AgregadoConcreto aggregate;
	private int current = 0;
	
	public ConcreteIterator(AgregadoConcreto agg){
		this.aggregate = agg;
	}
	
	public Object first() {
		return this.aggregate.get(0);
	}

	public Object next() {
		if(this.current < this.aggregate.length()){
			return this.aggregate.get(++this.current);
		}
		return null;
	}

	public boolean isDone() {
		return this.current >= this.aggregate.length();
	}

	public Object currentItem() {
		return this.aggregate.get(this.current);
	}

}
