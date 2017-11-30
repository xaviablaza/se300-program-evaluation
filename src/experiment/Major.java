import java.util.Set;

/**
 * Created by Xavi on 11/26/2017.
 */
public class Major {
    private String majorName;
    private Set<Course> requirements;
    private Set<Course> electives;

    public Major() {

    }

    public Major(String majorName, Set<Course> requirements, Set<Course> electives) {
        this.majorName = majorName;
        this.requirements = requirements;
        this.electives = electives;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public Set<Course> getRequirements() {
        return requirements;
    }

    public void setRequirements(Set<Course> requirements) {
        this.requirements = requirements;
    }

    public Set<Course> getElectives() {
        return electives;
    }

    public void setElectives(Set<Course> electives) {
        this.electives = electives;
    }
}
