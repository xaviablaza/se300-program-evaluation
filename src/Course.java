import java.util.HashSet;
import java.util.Set;

/**
 * Created by Xavi on 11/26/2017.
 */
public class Course {
    private String courseCode;
    private String courseNumber;
    private String courseDescription;
    private int credits;
    private CourseSchedule courseSchedule;
    private Set<Course> prerequisites = new HashSet<Course>();
    private Set<Course> corequisites = new HashSet<Course>();

    public Course(String courseCode, String courseNumber) {
        this.courseCode = courseCode;
        this.courseNumber = courseNumber;
    }

    public Course(String courseCode, String courseNumber, String courseDescription, int numCredits, CourseSchedule courseSchedule) {
        this.courseCode = courseCode;
        this.courseNumber = courseNumber;
        this.courseDescription = courseDescription;
        this.credits = numCredits;
        this.courseSchedule = courseSchedule;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public CourseSchedule getCourseSchedule() {
        return courseSchedule;
    }

    public void setCourseSchedule(CourseSchedule courseSchedule) {
        this.courseSchedule = courseSchedule;
    }

    public Course addPrerequisite(Course course) {
        prerequisites.add(course);
        return this;
    }

    public Course addCorequisite(Course course) {
        corequisites.add(course);
        return this;
    }
}