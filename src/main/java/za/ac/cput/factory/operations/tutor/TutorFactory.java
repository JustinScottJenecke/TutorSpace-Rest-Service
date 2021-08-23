package za.ac.cput.factory.operations.tutor;

import za.ac.cput.entity.operations.post.Post;
import za.ac.cput.entity.operations.tutor.Qualification;
import za.ac.cput.entity.operations.tutor.Tutor;
import za.ac.cput.entity.operations.tutor.TutorDetails;

import java.util.List;
import java.util.Set;

/**
 * Factory class for creating Tutors
 * Author: Justin Scott Jenecke
 */

public class TutorFactory {

    public static Tutor createTutor(int tutorId,
                                    TutorDetails tutorDetails,
                                    Set <Qualification> qualifications,
                                    List <Post> posts){
        Tutor tutor = new Tutor.Builder()
                .setTutorId(tutorId)
                .setTutorDetailsId(tutorDetails)
                .setQualifications(qualifications)
                .setPosts(posts)
                .build();

        return tutor;

    }

}
