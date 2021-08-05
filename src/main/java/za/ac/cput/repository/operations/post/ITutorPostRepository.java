package za.ac.cput.repository.operations.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.operations.post.TutorPost;

@Repository
public interface ITutorPostRepository  extends JpaRepository<TutorPost, Integer> {
}
