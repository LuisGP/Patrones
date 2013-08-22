/*
 * Created on 17-may-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package prototype;

/**
 * @author Luis Gasco Poderoso
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ConcretePrototype2 implements Prototype{
	
	public ConcretePrototype2(ConcretePrototype2 prot){
	}
	
	public Prototype Clonar() {
		return new ConcretePrototype2(this);
	}
}
