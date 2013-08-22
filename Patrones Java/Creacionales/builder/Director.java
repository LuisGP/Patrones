/*
 * Created on 17-may-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package builder;

/**
 * @author Luis Gasco Poderoso
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Director {
	
	public void Construct(Builder builders[]){
		for(int i = 0; i < builders.length; i++)
			builders[i].BuildPart();
	}
}
