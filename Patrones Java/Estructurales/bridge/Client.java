/*
 * Created on 17-may-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package bridge;

/**
 * @author Luis Gasco Poderoso
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Client {
	Abstraction abst;
	
	public Client(Abstraction abs){
		abst = abs;
	}
	
	public void Operacion(){
		abst.Operation();
	}
}