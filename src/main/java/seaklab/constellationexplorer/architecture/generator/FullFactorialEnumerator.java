/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seaklab.constellationexplorer.architecture.generator;

import java.util.Collection;
import org.moeaframework.core.Solution;
import seaklab.constellationexplorer.architecture.IntegerVariable;

/**
 * Uses full factorial enumeration to generate a set of architectures. The
 * method of full factorial enumeration depends on the types of decisions or
 * genes used in a given solution. Decision variables must be discrete.
 *
 * @author nozomihitomi
 */
public class FullFactorialEnumerator extends AbstractArchitectureGenerator {

    /**
     * Creates a generator for full factorial enumeration. Decision variables
     * must be discrete.
     *
     * @param template solution that acts as a template
     */
    public FullFactorialEnumerator(Solution template) {
        super(template);
        //check that all variables are discrete
        for (int i = 0; i < getTemplate().getNumberOfVariables(); i++) {
            if (!(getTemplate().getVariable(i) instanceof IntegerVariable)) {
                throw new IllegalArgumentException(String.format("Unsupported variable type: %s", getTemplate().getVariable(i).getClass()));
            }
        }
    }

    @Override
    public Collection<Solution> generate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
