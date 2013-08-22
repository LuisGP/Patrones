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
public class Client {
	AbstractProductA productA;
	AbstractProductB productB;
	AbstractFactory factory;
	
	public Client(AbstractFactory fact){
		factory = fact;
		productA = fact.CreateProductA();
		productB = fact.CreateProductB();
	}
	
	public void changeFactory(AbstractFactory fact){
		factory = fact;
	}
}
