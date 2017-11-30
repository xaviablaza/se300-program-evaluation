import java.util.Set;

/**
 * Created by Xavi on 11/27/2017.
 */
public class Flowchart {
    private Major major;
    private Semester[] semesters = new Semester[8];

    public Flowchart() {
        major = new CPSCMajor();
    }

    public boolean CSP_BACKTRACKING(Semester[] semArray) {
        // If semArray is complete (i.e. all courses from major are assigned) then return true (i.e. return the solution)
        // Select an unassigned semester
        // Select courses for the semester
        // For each course in the semester
          // If the course is consistent with the rest of the semesters (prereqs satisfied, coreqs satisfied)
          // Add the course to the semester array
          // boolean result = CSP_BACKTRACKING(semester array)
          // if result is not a failure then return the result
        // return failure



        for (int i=0; i<semesters.length; ++i) {
            // Check if semester is under 18 credits
            if (semesters[i].getCredits() <= 18) {

                // Get the courses of the current semester
                Set<Course> semCourses = semesters[i].getAssignedCourses();
                // For each course in the course of the current semester
                for (Course course : semCourses) {
                    // Get the course's prerequisites
                    Set<Course> prereqs = course.getPrerequisites();
                    // Get the course's corequisites
                    Set<Course> coreqs = course.getCorequisites();
                    if (prereqs != null) {
                        for (Course prereq : prereqs) {
                            for (int j=i; j<semesters.length; ++j) {

                            }
                        }
                    }
                }
            }
        }






        return false;
    }
}
