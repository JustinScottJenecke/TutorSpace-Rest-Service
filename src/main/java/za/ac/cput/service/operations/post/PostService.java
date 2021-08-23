package za.ac.cput.service.operations.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.operations.post.Post;
import za.ac.cput.repository.operations.post.IPostRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PostService {

    @Autowired
    private IPostRepository postRepository;

    public Post create(Post post) {
        return this.postRepository.save(post);
    }

    public Post read(int id) {
        return this.postRepository.findById(id).orElseGet(null);
    }

    public Post update(Post post) {
        return this.postRepository.save(post);
    }

    public void delete(int id) {
        this.postRepository.deleteById(id);
    }

    public boolean checkInstance(int id) {
        return this.postRepository.existsById(id);
    }

    public List<Post> getAll(){
        return this.postRepository.findAll();

    }

}
