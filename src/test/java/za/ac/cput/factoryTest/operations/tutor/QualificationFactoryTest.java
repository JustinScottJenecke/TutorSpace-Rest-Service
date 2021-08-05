package za.ac.cput.factoryTest.operations.tutor;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.operations.tutor.Qualification;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Factory test class for testing creation of Qualifications
 * Author: Justin Scott Jenecke
 */

class QualificationFactoryTest {

    @Test
    void createQualification() {

        Qualification qualification = new Qualification.Builder()
                .setQualNo(101)
                .setNqfLevel(6)
                .setInstitution("CPUT")
                .setMajor("CS")
                .build();

        assertEquals(101, qualification.getQualNo());
        assertEquals(6, qualification.getNqfLevel());
        assertEquals("CPUT", qualification.getInstitution());
        assertEquals("CS", qualification.getMajor());

    }
}