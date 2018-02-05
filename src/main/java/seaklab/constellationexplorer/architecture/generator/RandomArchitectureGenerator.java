/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seaklab.constellationexplorer.architecture.generator;

import org.moeaframework.core.Population;
import org.moeaframework.core.Solution;

/**
 * Generates a set of random architectures
 *
 * @author nozomihitomi
 */
public class RandomArchitectureGenerator extends AbstractArchitectureGenerator {

    /**
     * the number of architectures to generate
     */
    private int n;

    /**
     * Creates a new generator for random architectures.
     *
     * @param template solution to act as template
     * @param n the number of architectures to generate
     */
    public RandomArchitectureGenerator(Solution template, int n) {
        super(template);
    }

    @Override
    public Iterable<Solution> generate() {
        Population pop = new Population();
        for (int i = 0; i < n; i++) {
            Solution soln = getTemplate().copy();
            for(int j=0; j<soln.getNumberOfVariables(); j++){
                soln.getVariable(j).randomize();
            }
            pop.add(soln);
        }
        return pop;
    }

}
