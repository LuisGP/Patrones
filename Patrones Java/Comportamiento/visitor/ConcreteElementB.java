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
public class ConcreteElementB extends Element{
	public void Accept(Visitor visitor){
		visitor.VisitConcreteElementB(this);
	}
	
	public void OperationB(){
	}
}
