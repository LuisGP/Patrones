/*
 * Created on 17-may-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package singleton;

/**
 * @author Luis Gasco Poderoso
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Singleton {
	private static Singleton instancia;
	
	private Singleton(){
	}
	
	public static Singleton Instanciar(){
		if(instancia == null){
			instancia = new Singleton();
		}
		return instancia;	// O null depende de que queramos, asi
							// devolvemos el que ya existe
	}
}
