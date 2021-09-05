package za.ac.cput.factoryTest.operations.post;

import javafx.geometry.Pos;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.operations.post.Post;
import za.ac.cput.entity.operations.tutor.Qualification;
import za.ac.cput.entity.operations.tutor.Tutor;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Factory test class for testing creation of Posts
 * Author: Justin Scott Jenecke
*/

class PostFactoryTest {

    Tutor mockTutor;

    @BeforeEach
    void setup() {
        mockTutor = new Tutor.Builder()
                .setTutorId(1001)
                .setPosts(new ArrayList<>())
                .setQualifications(new HashSet<Qualification>())
                .build();
    }


    @Test
    void createPostFactory() {

        Post post = new Post.Builder()
                .setPostNo(101)
                .setMajor("Computer Science")
                .setSubject("ADP3")
                .setTopic("Domain Driven Design")
                .setTutor(mockTutor)
                .build();

        assertEquals(101, post.getPostNo());
        assertEquals("Computer Science", post.getMajor());
        assertEquals("ADP3", post.getSubject());
        assertEquals("Domain Driven Design", post.getTopic());


    }
}