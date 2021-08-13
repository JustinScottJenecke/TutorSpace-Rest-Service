package za.ac.cput.factoryTest.operations.tutor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.operations.tutor.Qualification;
import za.ac.cput.entity.operations.tutor.Tutor;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Factory test class for testing creation of Qualifications
 * Author: Justin Scott Jenecke
 */

class QualificationFactoryTest {

    Tutor tutor;

    @BeforeEach
    void setup(){
         tutor = new Tutor.Builder()
                .setTutorId(101)
                .setTutorDetailsId(201)
                .setQualifications(null)
                .build();
    }

    @Test
    void createQualification() {

        Qualification qualification = new Qualification.Builder()
                .setQualNo(101)
                .setNqfLevel(6)
                .setInstitution("CPUT")
                .setMajor("CS")
                .setTutor(tutor)
                .build();

        assertEquals(101, qualification.getQualNo());
        assertEquals(6, qualification.getNqfLevel());
        assertEquals("CPUT", qualification.getInstitution());
        assertEquals("CS", qualification.getMajor());
        assertEquals(tutor.getClass(), qualification.getTutor().getClass());
        assertEquals(101, qualification.getTutor().getTutorId());

    }
}