package edu.chapman.ablaz101;

import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.constraints.Propagator;

/**
 * Created by Xavi on 11/29/2017.
 */
public class MyConstraint extends Constraint {
    public MyConstraint(String name, Propagator[] propagators) {
        super(name, propagators);
    }
}
