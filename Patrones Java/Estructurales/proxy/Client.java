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
public class Client {
	Subject subject;
	
	public Client(Subject proxy){
		subject = proxy;
	}
	
	public void efectuarPeticion(){
		subject.Request();
	}
}
