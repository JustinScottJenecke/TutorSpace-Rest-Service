package za.ac.cput.factory.operations.tutor;

import za.ac.cput.entity.operations.tutor.Qualification;
import za.ac.cput.entity.operations.tutor.Tutor;

import java.util.Set;

/**
 * Factory class for creating Tutors
 * Author: Justin Scott Jenecke
 */

public class TutorFactory {

    public static Tutor createTutor(int tutorId,
                                    int tutorDetails,
                                    Set <Qualification> qualifications){
        Tutor tutor = new Tutor.Builder()
                .setTutorId(tutorId)
                .setTutorDetailsId(tutorDetails)
                .setQualifications(qualifications)
                .build();

        return tutor;

    }

}
