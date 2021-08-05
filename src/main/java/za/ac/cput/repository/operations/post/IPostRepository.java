package za.ac.cput.repository.operations.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.operations.post.Post;

@Repository
public interface IPostRepository extends JpaRepository <Post, Integer> {
}
