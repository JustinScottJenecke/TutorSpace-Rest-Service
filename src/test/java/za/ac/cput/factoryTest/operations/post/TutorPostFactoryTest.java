package za.ac.cput.factoryTest.operations.post;
/*
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.operations.post.Post;
//import za.ac.cput.entity.operations.post.TutorPost;
import za.ac.cput.entity.operations.tutor.Tutor;

import static org.junit.jupiter.api.Assertions.assertEquals;
*/
/**
 * Factory test class for testing creation of TutorPosts
 * Author: Justin Scott Jenecke
 */
/*
class TutorPostFactoryTest {

    Tutor tutor;
    Post post;

    @BeforeEach
    void setUp() {

        tutor = new Tutor.Builder().setTutorId(101).build();
        post = new Post.Builder().setPostNo(201).build();

    }

    @Test
    void createTutorPost() {

        TutorPost tutorPost = new TutorPost.Builder()
                .setTutorPostId(8)
                .setTutorId(tutor.getTutorId())
                .setPostNo(post.getPostNo())
                .build();


        assertEquals(8,tutorPost.getTutorPostId());
        assertEquals(101, tutorPost.getTutorId());
        assertEquals(201, tutorPost.getPostNo());

        assertEquals(tutor.getTutorId(), tutorPost.getTutorId());
        assertEquals(post.getPostNo(), tutorPost.getPostNo());

    }
}
*/