/*
 * Created on 08-jun-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package chainOfResponsability;

/**
 * @author Luis Gasco Poderoso
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ConcreteHandler1 extends Handler {
	public Object HandleRequest(Object obj){
		if(obj.getClass().isInstance(new String())){
			return new String("hola");
		}else{
			if(this.successor != null)
				return this.successor.HandleRequest(obj);
			return null;
		}
	}
}
