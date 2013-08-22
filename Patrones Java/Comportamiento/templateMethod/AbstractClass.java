/*
 * Created on 12-jun-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package templateMethod;

/**
 * @author Luis Gasco Poderoso
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public abstract class AbstractClass {
	// Methods
	abstract public void PrimitiveOperation1();
	abstract public void PrimitiveOperation2();
	
	// The Template method
	public void TemplateMethod(){
		System.out.println("In AbstractClass.TemplateMethod()");
		PrimitiveOperation1();
		PrimitiveOperation2();
	}
}
