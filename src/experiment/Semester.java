import java.util.HashSet;
import java.util.Set;

/**
 * Created by Xavi on 11/27/2017.
 */
public class Semester {
    private Set<Course> assignedCourses = new HashSet<Course>();
    private int semesterNum;
    private Set<Course> courseDomain = new HashSet<Course>();

    public Set<Course> getAssignedCourses() {
        return assignedCourses;
    }

    public void setAssignedCourses(Set<Course> assignedCourses) {
        this.assignedCourses = assignedCourses;
    }

    public int getSemesterNum() {
        return semesterNum;
    }

    public void setSemesterNum(int semesterNum) {
        this.semesterNum = semesterNum;
    }

    public int getCredits() {
        int numCreds = 0;
        for (Course course : assignedCourses) {
            numCreds += course.getCredits();
        }
        return numCreds;
    }

    // [1] index, where 1 is fall semester
    public boolean isFallSemester() {
        return semesterNum % 2 == 1;
    }
}
