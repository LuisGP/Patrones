/*
 * Created on 18-may-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package decorator;

/**
 * @author Luis Gasco Poderoso
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ConcreteDecoratorB extends Decorator {
	public void Operacion(){
		FuncionalidadAñadida();
		super.Operacion();
	}
	
	public void FuncionalidadAñadida(){
		System.out.print("Responsabilidad");
	}
}
