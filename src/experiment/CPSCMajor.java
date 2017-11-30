import java.util.HashSet;
import java.util.Set;

/**
 * Created by Xavi on 11/27/2017.
 */
public class CPSCMajor extends Major {
    private int electiveCredits = 12;

    public CPSCMajor() {
        Set<Course> requirements = new HashSet<Course>();

        // Grand Challenges in Science Courses
        requirements.add(
                new Course(
                        "SCI",
                        "150",
                        "Grand Challenges in Science I",
                        1,
                        CourseSchedule.SPRING));
        requirements.add(
                new Course(
                        "SCI",
                        "200",
                        "Grand Challenges in Science II",
                        1,
                        CourseSchedule.FALL)
                        .addPrerequisite(
                                new Course(
                                        "SCI",
                                        "150")));
        requirements.add(
                new Course(
                        "SCI",
                        "250",
                        "Grand Challenges in Science III",
                        1,
                        CourseSchedule.SPRING)
                        .addPrerequisite(
                                new Course(
                                        "SCI",
                                        "200")));

        // Lower Division Mathematics
        requirements.add(
                new Course(
                        "MATH",
                        "115",
                        "Calculus Part I: Differentiation and Integration",
                        3,
                        CourseSchedule.FALL));
        requirements.add(
                new Course("MATH",
                        "116",
                        "Calculus Part II: Optimization and Differential Equations",
                        3,
                        CourseSchedule.SPRING)
                        .addPrerequisite(
                                new Course(
                                        "MATH",
                                        "115")));
        requirements.add(
                new Course("MATH",
                        "215",
                        "Introduction to Linear Algebra and Differential Equations",
                        3,
                        CourseSchedule.FALL)
                        .addPrerequisite(
                                new Course(
                                        "MATH",
                                        "116")));

        requirements.add(
                new Course("MATH",
                        "250",
                        "Discrete Mathematics I",
                        3,
                        CourseSchedule.EVERY_SEMESTER));

        // Lower Division Computer Science
        requirements.add(
                new Course("CPSC",
                        "230",
                        "Computer Science I",
                        3,
                        CourseSchedule.EVERY_SEMESTER));
        requirements.add(
                new Course("CPSC",
                        "231",
                        "Computer Science II",
                        3,
                        CourseSchedule.EVERY_SEMESTER)
                        .addPrerequisite(
                                new Course(
                                        "CPSC",
                                        "230")));
        requirements.add(
                new Course("CPSC",
                        "236",
                        "Visual Programming",
                        3,
                        CourseSchedule.EVERY_SEMESTER)
                        .addPrerequisite(
                                new Course(
                                        "CPSC",
                                        "230")));

        // Natural Science Sequence
        requirements.add(
                new Course("PHYS",
                        "101",
                        "General Physics I",
                        3,
                        CourseSchedule.SPRING)
                        .addCorequisite(
                                new Course(
                                        "PHYS",
                                        "101L")));
        requirements.add(
                new Course("PHYS",
                        "101L",
                        "Lab-General Physics I",
                        1,
                        CourseSchedule.SPRING)
                        .addCorequisite(
                                new Course(
                                        "PHYS",
                                        "101")));
        requirements.add(
                new Course("PHYS",
                        "102",
                        "General Physics II",
                        3,
                        CourseSchedule.FALL)
                        .addPrerequisite(
                                new Course(
                                        "PHYS",
                                        "101"))
                        .addCorequisite(
                                new Course(
                                        "PHYS",
                                        "102L")));
        requirements.add(
                new Course("PHYS",
                        "102L",
                        "Lab-General Physics II",
                        1,
                        CourseSchedule.FALL)
                        .addPrerequisite(
                                new Course(
                                        "PHYS",
                                        "101"
                                )
                        )
                        .addCorequisite(
                                new Course(
                                        "PHYS",
                                        "102")));

        // Colloquium Requirement
        // TODO: How do you model someone taking 3, 1-credit classes of a Course?
        requirements.add(
                new Course("CPSC",
                        "298",
                        "Computer Science Colloquium",
                        3,
                        CourseSchedule.EVERY_SEMESTER)
                        .addPrerequisite(
                                new Course(
                                        "CPSC",
                                        "230")));

        // Upper Division core requirements
        requirements.add(
                new Course("CPSC",
                        "330",
                        "Digital Logic Design I",
                        3,
                        CourseSchedule.SPRING)
                        .addPrerequisite(
                                new Course(
                                        "MATH",
                                        "250"))
                        .addCorequisite(
                                new Course(
                                        "CPSC",
                                        "330L"
                                )
                        ));
        requirements.add(
                new Course("CPSC",
                        "330L",
                        "Lab-Digital Logic Design I",
                        1,
                        CourseSchedule.SPRING)
                        .addPrerequisite(
                                new Course(
                                        "MATH",
                                        "250"))
                        .addCorequisite(
                                new Course(
                                        "CPSC",
                                        "330"
                                )
                        ));
        requirements.add(
                new Course("CPSC",
                        "350",
                        "Data Structures and Algorithms",
                        3,
                        CourseSchedule.EVERY_SEMESTER)
                        .addPrerequisite(
                                new Course(
                                        "CPSC",
                                        "231")));

        requirements.add(
                new Course("CPSC",
                        "351",
                        "Computer Architecture I",
                        3,
                        CourseSchedule.FALL)
                        .addPrerequisite(
                                new Course(
                                        "CPSC",
                                        "250"))
                        .addPrerequisite(
                                new Course(
                                        "CPSC",
                                        "330")));

        requirements.add(
                new Course("CPSC",
                        "353",
                        "Data Communications and Computer Networks",
                        3,
                        CourseSchedule.FALL)
                        .addPrerequisite(
                                new Course(
                                        "CPSC",
                                        "231")));

        requirements.add(
                new Course("CPSC",
                        "354",
                        "Programming Languages",
                        3,
                        CourseSchedule.FALL)
                        .addPrerequisite(
                                new Course(
                                        "CPSC",
                                        "350")));

        requirements.add(
                new Course("CPSC",
                        "380",
                        "Operating Systems",
                        3,
                        CourseSchedule.EVERY_SEMESTER)
                        .addPrerequisite(
                                new Course(
                                        "CPSC",
                                        "350")));

        requirements.add(
                new Course("CPSC",
                        "402",
                        "Compiler Construction",
                        3,
                        CourseSchedule.EVERY_SEMESTER)
                        .addPrerequisite(
                                new Course(
                                        "MATH",
                                        "250"))
                        .addPrerequisite(
                                new Course(
                                        "CPSC",
                                        "350"))
                        .addPrerequisite(
                                new Course(
                                        "CPSC",
                                        "354")));

        requirements.add(
                new Course("CPSC",
                        "408",
                        "Database Management",
                        3,
                        CourseSchedule.EVERY_SEMESTER)
                        .addPrerequisite(
                                new Course(
                                        "CPSC",
                                        "236"))
                        .addPrerequisite(
                                new Course(
                                        "CPSC",
                                        "350")));

        Set<Course> electives = new HashSet<Course>();

        electives.add(
                new Course("MATH",
                        "251",
                        "Discrete Mathematics II",
                        3,
                        CourseSchedule.EVERY_SEMESTER)
                        .addPrerequisite(new Course(
                                "MATH",
                                "251"
                        )));

        electives.add(
                new Course("CPSC",
                        "285",
                        "Social and Ethical Issues in Computing",
                        3,
                        CourseSchedule.EVERY_SEMESTER)
                        .addPrerequisite(new Course(
                                "CPSC",
                                "230"
                        )));
        electives.add(
                new Course("SE",
                        "300",
                        "Software Requirements and Testing",
                        3,
                        CourseSchedule.FALL)
                        .addPrerequisite(new Course(
                                "CPSC",
                                "231"
                        ))
                        .addCorequisite(new Course(
                                "SE",
                                "310"
                        )));
        electives.add(
                new Course("SE",
                        "310",
                        "Software Design",
                        3,
                        CourseSchedule.FALL)
                        .addPrerequisite(new Course(
                                "CPSC",
                                "231"
                        ))
                        .addCorequisite(new Course(
                                "SE",
                                "300"
                        )));
        electives.add(
                new Course("SE",
                        "320",
                        "The Software Development Lifecycle",
                        3,
                        CourseSchedule.FALL)
                        .addPrerequisite(new Course(
                                "CPSC",
                                "350"
                        ))
                        .addPrerequisite(new Course(
                                "SE",
                                "300"
                        ))
                        .addPrerequisite(new Course(
                                "SE",
                                "310"
                        )));
        electives.add(
                new Course("CPSC",
                        "352",
                        "Computer Architecture II",
                        3,
                        CourseSchedule.FALL)
                        .addPrerequisite(new Course(
                                "CPSC",
                                "351"
                        )));
        electives.add(
                new Course("CPSC",
                        "355",
                        "Human Computer Interaction",
                        3,
                        CourseSchedule.EVERY_SEMESTER)
                        .addPrerequisite(new Course(
                                "CPSC",
                                "231"
                        )));
        electives.add(
                new Course("CPSC",
                        "356",
                        "Android Application Development",
                        3,
                        CourseSchedule.EVERY_SEMESTER)
                        .addPrerequisite(new Course(
                                "CPSC",
                                "231"
                        )));
        electives.add(
                new Course("CPSC",
                        "357",
                        "iOS Application Development",
                        3,
                        CourseSchedule.EVERY_SEMESTER)
                        .addPrerequisite(new Course(
                                "CPSC",
                                "231"
                        )));
        electives.add(
                new Course("CPSC",
                        "360",
                        "Computer Graphics",
                        3,
                        CourseSchedule.FALL)
                        .addPrerequisite(new Course(
                                "CPSC",
                                "350"
                        )));
        electives.add(
                new Course("CPSC",
                        "366",
                        "Digital Logic Design II",
                        3,
                        CourseSchedule.EVERY_SEMESTER)
                        .addPrerequisite(new Course(
                                "CPSC",
                                "330"
                        ))
                        .addPrerequisite(new Course(
                                "MATH",
                                "251"
                        )));
        electives.add(
                new Course("CPSC",
                        "370",
                        "Topics in Computer Science",
                        3,
                        CourseSchedule.EVERY_SEMESTER));
        electives.add(
                new Course("CPSC",
                        "390",
                        "Artificial Intelligence",
                        3,
                        CourseSchedule.SPRING)
                        .addPrerequisite(new Course(
                                "MATH",
                                "250"
                        ))
                        .addPrerequisite(new Course(
                                "CPSC",
                                "350"
                        )));
        electives.add(
                new Course("CPSC",
                        "392",
                        "Introduction to Data Science",
                        3,
                        CourseSchedule.FALL)
                        .addPrerequisite(new Course(
                                "CPSC",
                                "230"
                        )));
        electives.add(
                new Course("CPSC",
                        "393",
                        "Machine Learning",
                        3,
                        CourseSchedule.SPRING)
                        .addPrerequisite(new Course(
                                "CPSC",
                                "392"
                        )));
        electives.add(
                new Course("CPSC",
                        "406",
                        "Algorithm Analysis",
                        3,
                        CourseSchedule.EVERY_SEMESTER)
                        .addPrerequisite(new Course(
                                "CPSC",
                                "250"
                        )
                                .addPrerequisite(new Course(
                                        "CPSC",
                                        "350"
                                ))));
        electives.add(
                new Course("CPSC",
                        "430",
                        "Computational Economics",
                        3,
                        CourseSchedule.EVERY_SEMESTER)
                        .addPrerequisite(new Course(
                                "CPSC",
                                "230"
                        )));
        electives.add(
                new Course("CPSC",
                        "445",
                        "High Performance Computing",
                        3,
                        CourseSchedule.EVERY_SEMESTER)
                        .addPrerequisite(new Course(
                                "CPSC",
                                "350"
                        )));
        electives.add(
                new Course("CPSC",
                        "453",
                        "Network Implementation and Security",
                        3,
                        CourseSchedule.EVERY_SEMESTER)
                        .addPrerequisite(new Course(
                                "CPSC",
                                "353"
                        )));
        electives.add(
                new Course("CPSC",
                        "465",
                        "Integrated Circuit Design I",
                        3,
                        CourseSchedule.EVERY_SEMESTER)
                        .addPrerequisite(new Course(
                                "CPSC",
                                "366"
                        )));
        electives.add(
                new Course("CPSC",
                        "466",
                        "Integrated Circuit Design II",
                        3,
                        CourseSchedule.EVERY_SEMESTER)
                        .addPrerequisite(new Course(
                                "CPSC",
                                "330"
                        ))
                        .addPrerequisite(new Course(
                                "CPSC",
                                "465"
                        )));
        electives.add(
                new Course("CPSC",
                        "498",
                        "Senior Project",
                        3,
                        CourseSchedule.EVERY_SEMESTER));
        electives.add(
                new Course("CPSC",
                        "499",
                        "Individual Study",
                        3,
                        CourseSchedule.EVERY_SEMESTER));

        setMajorName("Bachelor of Science in Computer Science");
        setRequirements(requirements);
        setElectives(electives);
    }

}
