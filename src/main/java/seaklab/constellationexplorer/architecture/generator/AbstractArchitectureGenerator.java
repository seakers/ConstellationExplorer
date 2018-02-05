/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seaklab.constellationexplorer.architecture.generator;

import java.util.Arrays;
import org.moeaframework.core.Solution;
import seaklab.constellationexplorer.architecture.GeneTranscriptor;

/**
 * An abstract class for an architecture generator.
 * @author nozomihitomi
 */
public abstract class AbstractArchitectureGenerator implements ArchitectureGenerator{
    
    /**
     * A solution that acts as a template.
     */
    private final Solution template;

    /**
     * Creates a new architecture generator
     * @param template a solution that acts as a template.
     */
    public AbstractArchitectureGenerator(Solution template) {
        this.template = GeneTranscriptor.trasncript(template);
        //clear all objective and constraint values
        this.template.clearAttributes();
        double[] constraints = new double[this.template.getNumberOfConstraints()];
        double[] objectives = new double[this.template.getNumberOfObjectives()];
        Arrays.fill(constraints, 0);
        Arrays.fill(objectives, 0);
        this.template.setConstraints(constraints);
        this.template.setObjectives(objectives);
    }

    /**
     * Gets the template solution with all genes expanded
     * @return the template solution with all genes expanded
     */
    protected final Solution getTemplate() {
        return template;
    }
    
    
}
