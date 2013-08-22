/*
 * Created on 12-jun-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package observer;

/**
 * @author Luis Gasco Poderoso
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ConcreteSubject extends Subject{
	//Fields
	private String subjectState;

	// Properties
	public String getSubjectState(){
		return subjectState;
	}
	
	public void setSubjectState(String value){
	    subjectState = value;
	}
}
