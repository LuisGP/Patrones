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
public class FlyweightFactory {
	Flyweight []pesosligeros;
	
	public Flyweight getFlyweight(int key){
		if(pesosligeros[key] == null){
			return pesosligeros[key];
		}else{
			// Crear pesosligeros[key]
			// Añadir a la estructura de pesosligeros
			// devolver nuevo peso ligero
			return pesosligeros[key];
		}
	}
}
