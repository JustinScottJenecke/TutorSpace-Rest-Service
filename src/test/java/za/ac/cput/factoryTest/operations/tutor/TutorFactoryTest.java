package za.ac.cput.factoryTest.operations.tutor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.operations.tutor.Qualification;
import za.ac.cput.entity.operations.tutor.Tutor;
import za.ac.cput.entity.operations.tutor.TutorDetails;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Factory test class for testing creation of Tutors
 * Author: Justin Scott Jenecke
**/

class TutorFactoryTest {

    TutorDetails tutorDetails;

    Set <Qualification> qualificationSet;

    @BeforeEach
    void setUp() {
        qualificationSet = new HashSet<>();

         tutorDetails = new TutorDetails.Builder()
                .setTutorDetailsId(101)
                .setEmploymentType("Part-Time")
                .setStudentNo(102)
                .setTutorType("Alumni")
                .build();
    }

    @Test
    void createTutor() {

        Tutor tutor = new Tutor.Builder()
                .setTutorId(101)
                .setTutorDetailsId(tutorDetails)
                .setQualifications(qualificationSet)
                .build();

        assertEquals(101, tutor.getTutorId());
        assertEquals(tutorDetails, tutor.getTutorDetailsId());
        assertEquals(0, tutor.getQualifications().size());

    }
}