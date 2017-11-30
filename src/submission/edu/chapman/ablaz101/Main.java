package edu.chapman.ablaz101;

import org.chocosolver.solver.Model;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.constraints.Propagator;
import org.chocosolver.solver.variables.SetVar;

public class Main {

    public static void main(String[] args) {
        Model model = new Model("CPSC Major Flowchart");
        SetVar[] semesters = new SetVar[2];
        SetVar sem1 = model.setVar("sem1", new int[]{}, new int[]{230,231});
        SetVar sem2 = model.setVar("sem2", new int[]{}, new int[]{230,231});
        semesters[0] = sem1;
        semesters[1] = sem2;
        Constraint myConstraint = new MyConstraint("prereqs", new Propagator[]{new CPSC231Prerequisite(semesters)});
        model.allDifferent(semesters).post();
        model.post(myConstraint);
        Solver solver = model.getSolver();
        if (solver.solve()) {
            for (SetVar var : semesters) {
                System.out.println(var.getValue());
            }
        } else {
            System.out.println("No solution");
        }
    }
}
