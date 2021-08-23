package za.ac.cput.controller.operations.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.entity.operations.post.Post;
import za.ac.cput.service.operations.post.PostService;

import java.util.List;

@RestController
@RequestMapping("/tutorspace/api/v1/post/")
public class PostController {

    @RequestMapping("/")
    public String greet(){
        return "Hello Post!";
    }

    @Autowired
    PostService postService;

    @PostMapping("/createPost/")
    public Post createPost(@RequestBody Post input) {

        Post newPost = new Post.Builder()
                .setMajor(input.getMajor())
                .setSubject(input.getSubject())
                .setTopic(input.getTopic())
                .build();

        return this.postService.create(newPost);
    }

    @GetMapping("/findPost/{id}")
    public Post getPost(@PathVariable int id) {return this.postService.read(id);
    }

    @GetMapping("/getPosts")
    public List<Post> getAllPosts() {return this.postService.getAll();
    }

    @PutMapping ("/updatePost/{id}")
    public Post updatePost(@RequestBody Post input, @PathVariable int id){

        if (this.postService.checkInstance(id)) {

            Post newPost = new Post.Builder()
                    .setMajor(input.getMajor())
                    .setSubject(input.getSubject())
                    .setTopic(input.getTopic())
                    .build();

            return this.postService.create(newPost);
        } else
            return null;
    }

    @DeleteMapping("/deletePost/{id}")
    public boolean deletePost(@PathVariable int id){
        this.postService.delete(id);
        return !this.postService.checkInstance(id);
    }
}
