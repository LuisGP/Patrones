/*
 * Created on 12-jun-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package visitor;

import java.util.Vector;

/**
 * @author Luis Gasco Poderoso
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ObjectStructure {
	//	 Fields
	private Vector elements = new Vector();
	
	// Methods
	public void Attach(Element element){
		elements.add(element);
	}
	
	public void Detach(Element element){
		elements.remove(element);
	}
	
	public void Accept(Visitor visitor){
		for(int i = 0; i < elements.size(); i++)
			((Element)elements.get(i)).Accept(visitor);
	}
}
