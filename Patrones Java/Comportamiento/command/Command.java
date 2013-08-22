/*
 * Created on 08-jun-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package command;

/**
 * @author Luis Gasco Poderoso
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public abstract class Command {
	protected Reciever reciever;
	protected int state;
	
	public Command(Reciever rec){
		this.reciever = rec;
	}
	
	abstract public void Execute();
}
