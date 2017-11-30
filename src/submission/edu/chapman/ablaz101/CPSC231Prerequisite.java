package edu.chapman.ablaz101;

import org.chocosolver.solver.ICause;
import org.chocosolver.solver.constraints.Propagator;
import org.chocosolver.solver.constraints.PropagatorPriority;
import org.chocosolver.solver.exception.ContradictionException;
import org.chocosolver.solver.explanations.RuleStore;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.SetVar;
import org.chocosolver.solver.variables.events.IEventType;
import org.chocosolver.util.ESat;

/**
 * Created by Xavi on 11/29/2017.
 */
public class CPSC231Prerequisite extends Propagator<SetVar> {

    /**
     * Constructor of the CPSC231 prerequisite propagator : CPSC230 must not be in a further semester
     * @param x
     */
    public CPSC231Prerequisite(SetVar[] x) {
        super(x, PropagatorPriority.LINEAR, false);
    }

    @Override
    public void propagate(int i) throws ContradictionException {
        boolean found231 = false;
        for (SetVar var : vars) {
            if (var.getLB().contains(231)) found231 = true;
            if (found231) {
                if (var.getUB().contains(230)) {
                    var.remove(230, new ICause() {
                        @Override
                        public boolean why(RuleStore ruleStore, IntVar var, IEventType evt, int value) {
                            return false;
                        }
                    });
                }
            }
        }
    }

    @Override
    public ESat isEntailed() {
        boolean checkSemsAhead = false;
        for (int i=0; i<vars.length; ++i) {
            if (vars[i].getLB().contains(231)) checkSemsAhead = true;
            if (checkSemsAhead) {
                if (vars[i].getLB().contains(230)) return ESat.FALSE;
            }
        }
        return ESat.TRUE;
    }
}
