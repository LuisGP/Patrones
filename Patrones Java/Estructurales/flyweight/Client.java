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
public class Client {
	private FlyweightFactory fabrica;
	
	private Flyweight pl1, pl2, pl3;
	
	public void funcioncilla(){
		pl1 = fabrica.getFlyweight(1);
		pl2 = fabrica.getFlyweight(2);
		pl3 = fabrica.getFlyweight(1);
		
		pl1.Operacion(new Integer(1));
		pl2.Operacion(new Integer(2));
		pl3.Operacion(new Integer(3));
	}
}
