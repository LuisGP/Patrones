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
public class UnsharedConcreteFlyweight implements Flyweight{

	private Object estadoIntrinseco;
	
	public void Operacion(Object estadoExtrinseco) {
		System.out.println("Operacion del peso ligero");
		// Obtener estado intrinseco a partir del extrinseco
		estadoIntrinseco = estadoExtrinseco;
	}
	
}
