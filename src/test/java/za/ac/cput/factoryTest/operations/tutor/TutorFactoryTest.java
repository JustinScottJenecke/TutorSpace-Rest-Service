package za.ac.cput.factoryTest.operations.tutor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.operations.tutor.Tutor;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Factory test class for testing creation of Tutors
 * Author: Justin Scott Jenecke
 */

class TutorFactoryTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void createTutor() {

        Tutor tutor = new Tutor.Builder()
                .setTutorId(101)
                .setTutorDetailsId(201)
                .setqListNo(301)
                .build();

        assertEquals(101, tutor.getTutorId());
        assertEquals(201, tutor.getTutorDetailsId());
        assertEquals(301, tutor.getqListNo());
    }
}