/*
 * Created on 12-jun-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package visitor;

/**
 * @author Luis Gasco Poderoso
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Client {
	public static void Main(String[] args){
		// Setup structure
		ObjectStructure o = new ObjectStructure();
		o.Attach( new ConcreteElementA() );
		o.Attach( new ConcreteElementB() );
		
		// Create visitor objects
		ConcreteVisitor1 v1 = new ConcreteVisitor1();
		ConcreteVisitor2 v2 = new ConcreteVisitor2();
		
		// Structure accepting visitors
		o.Accept( v1 );
		o.Accept( v2 );
	}
}
