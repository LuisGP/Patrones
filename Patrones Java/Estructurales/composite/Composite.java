/*
 * Created on 18-may-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package composite;

import java.util.List;

/**
 * @author Luis Gasco Poderoso
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Composite extends Component{
	List lista;
	
	public void Operacion(){
		System.out.println("Operacion Composite");
	}
	
	public void Add(Component comp){
		lista.add(comp);
	}
	
	public void Remove(Component comp){
		lista.remove(comp);
	}
	
	public Component getChild(int index){
		return (Component)lista.get(index);
	}
}
