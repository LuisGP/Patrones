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
public class Client {
	public static void Main( String[] args ){
	    // Create receiver, command, and invoker
	    Reciever r = new Reciever();
	    Command c = new ConcreteCommand( r );
	    Invoker i = new Invoker();

	    // Set and execute command
	    i.SetCommand(c);
	    i.ExecuteCommand();
	}
}
