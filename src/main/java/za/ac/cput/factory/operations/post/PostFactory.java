package za.ac.cput.factory.operations.post;

import za.ac.cput.entity.operations.post.Post;
import za.ac.cput.entity.operations.tutor.Tutor;

/**
 * Factory class for creating Posts
 * Author: Justin Scott Jenecke
 */

public class PostFactory {

    public static Post createPostFactory(int postNo,
                                         String major,
                                         String subject,
                                         String topic,
                                         Tutor tutor){

        Post post = new Post.Builder()
                .setPostNo(postNo)
                .setMajor(major)
                .setSubject(subject)
                .setTopic(topic)
                .setTutor(tutor)
                .build();

        return post;

    }

}
