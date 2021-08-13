package za.ac.cput.service.operations.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.operations.post.Post;
import za.ac.cput.repository.operations.post.IPostRepository;

@Service
public class PostService {

    @Autowired
    private IPostRepository postRepository;

    public void create(Post post) {
        this.postRepository.save(post);
    }

    public Post read(int id) {
        return this.postRepository.findById(id).orElseGet(null);
    }

    public void update(Post post) {
        this.postRepository.save(post);
    }

    public void delete(int id) {
        this.postRepository.deleteById(id);
    }

}
