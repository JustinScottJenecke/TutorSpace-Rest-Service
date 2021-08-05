package za.ac.cput.factory.operations.tutor;

import za.ac.cput.entity.operations.tutor.TutorDetails;

/**
 * Factory class for creating TutorDetails
 * Author: Justin Scott Jenecke
 */

public class TutorDetailsFactory {

    public static TutorDetails createTutorDetails(int tutorDetailsId,
                                                  String employmentType,
                                                  String tutorType,
                                                  int studentNo){
        TutorDetails tutorDetails = new TutorDetails.Builder()
                .setTutorDetailsId(tutorDetailsId)
                .setEmploymentType(employmentType)
                .setTutorType(tutorType)
                .setStudentNo(studentNo)
                .build();

        return tutorDetails;

    }

}
