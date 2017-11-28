package prac1;

/**
 * Created by Xavi on 11/28/2017.
 */
public class CPSCFlowchart {
    public static void main(String[] args) {
        new CPSCFlowchart().modelAndSolve();
    }

    private void modelAndSolve() {
        Semester semesters = new Semester[8];
        semesters[0] = new Semester().addAssignedCourse("SCI 150",1);
        for (int i=1; i< semesters.length; ++i) {
            semesters[i] = new Semester();
            // each semester will have a domain of all the classes depending on fall or spring semester.
        }
    }
}
