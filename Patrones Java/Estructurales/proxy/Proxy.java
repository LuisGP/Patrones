/*
 * Created on 18-may-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package proxy;

/**
 * @author Luis Gasco Poderoso
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Proxy implements Subject {

	RealSubject real;
	
	public void Request() {
		// Quizas haga falta crear el objeto previamente
		real.Request();
	}
}
