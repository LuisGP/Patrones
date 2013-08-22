/*
 * Created on 18-may-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package composite;

/**
 * @author Luis Gasco Poderoso
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public abstract class Component {
	public void Operacion(){
		System.out.println("Por defecto");
	}
	
	public void Add(Component comp){
		System.out.println("Añadir defecto");
	}
	
	public void Remove(Component comp){
		System.out.println("Borrar defecto");
	}
	
	public Component getChild(int index){
		return null;
	}
}
