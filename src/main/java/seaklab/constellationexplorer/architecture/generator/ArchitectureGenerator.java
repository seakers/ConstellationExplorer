/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seaklab.constellationexplorer.architecture.generator;

import org.moeaframework.core.Solution;

/**
 * Architecture generators enumerate architectures using a template Solution. 
 * @author nozomihitomi
 */
public interface ArchitectureGenerator {
    
    /**
     * Generates a collection of architectures.
     * @return a collection of architectures.
     */
    public Iterable<Solution> generate();
    
}
