/*
 * Created on 17-may-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package facade;

/**
 * @author Luis Gasco Poderoso
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Facade {
	SubSystemA a;
	SubSystemB b;
	SubSystemC c;
	
	public Facade(){
		a = new SubSystemA();
		b = new SubSystemB();
		c = new SubSystemC();
	}
	
	public String Metodo1(){
		return a.MethodA() + b.MethodB();
	}
	
	public String Metodo2(){
		return b.MethodB() + c.MethodC();
	}
}
