/*
 * Created on 08-jun-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package interpreter;

import java.util.ArrayList;

/**
 * @author Luis Gasco Poderoso
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Client {
	public static void Main(String[] args){
	    Context c = new Context();

	    // Usually a tree
	    ArrayList l = new ArrayList();

	    // Populate 'abstract syntax tree'
	    l.add(new TerminalExpression());
	    l.add(new NonterminalExpression());
	    l.add(new TerminalExpression());
	    l.add(new TerminalExpression());

	    // Interpret
	    for(int i = 0; i < l.size() ;i++ )
	      ((AbstractExpression) l.get(i)).interpret(c);
	}
}
