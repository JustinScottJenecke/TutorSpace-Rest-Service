package za.ac.cput.factory.operations.post;

import za.ac.cput.entity.operations.post.TutorPost;

/**
 * Factory class for creating TutorPosts
 * Author: Justin Scott Jenecke
 */

public class TutorPostFactory {

    public static TutorPost createTutorPost(int tutorPostId,
                                            int tutorId,
                                            int postNo){

        TutorPost tutorPost = new TutorPost.Builder()
                .setTutorPostId(tutorPostId)
                .setTutorId(tutorId)
                .setPostNo(postNo)
                .build();

        return tutorPost;
    }

}
