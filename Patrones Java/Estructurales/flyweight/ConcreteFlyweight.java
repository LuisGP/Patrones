/*
 * Created on 18-may-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package flyweight;

/**
 * @author Luis Gasco Poderoso
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ConcreteFlyweight implements Flyweight {

	private Object estadoCompleto;
	
	public void Operacion(Object estadoExtrinseco) {
		estadoCompleto = estadoExtrinseco;
		System.out.println("Operacion peso ligero");
	}

}
