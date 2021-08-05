package za.ac.cput.factory.operations.tutor;

import za.ac.cput.entity.operations.tutor.Tutor;

/**
 * Factory class for creating Tutors
 * Author: Justin Scott Jenecke
 */

public class TutorFactory {

    public static Tutor createTutor(int tutorId,
                                    int tutorDetails,
                                    int qListNo){
        Tutor tutor = new Tutor.Builder()
                .setTutorId(tutorId)
                .setTutorDetailsId(tutorDetails)
                .setqListNo(qListNo)
                .build();

        return tutor;

    }

}
