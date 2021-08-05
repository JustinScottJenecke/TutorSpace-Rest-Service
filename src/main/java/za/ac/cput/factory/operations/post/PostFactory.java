package za.ac.cput.factory.operations.post;

import za.ac.cput.entity.operations.post.Post;

/**
 * Factory class for creating Posts
 * Author: Justin Scott Jenecke
 */

public class PostFactory {

    public static Post createPostFactory(int postNo,
                                         String major,
                                         String subject,
                                         String topic){

        Post post = new Post.Builder()
                .setPostNo(postNo)
                .setMajor(major)
                .setSubject(subject)
                .setTopic(topic)
                .build();

        return post;

    }

}
