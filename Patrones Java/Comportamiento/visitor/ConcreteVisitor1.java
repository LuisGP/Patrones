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
public class ConcreteVisitor1 extends Visitor{

	public void VisitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println(concreteElementA+" visited by "+this);
	}

	public void VisitConcreteElementB(ConcreteElementB concreteElementB) {
		System.out.println(concreteElementB+" visited by "+this);
	}
}
