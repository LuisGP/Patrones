/*
 * Created on 17-may-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package abstractFactory;

/**
 * @author Luis Gasco Poderoso
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ConcreteFactory2  extends AbstractFactory{
	
	public AbstractProductA CreateProductA() {
		return new ProductA2();
	}

	public AbstractProductB CreateProductB() {
		return new ProductB2();
	}
}
