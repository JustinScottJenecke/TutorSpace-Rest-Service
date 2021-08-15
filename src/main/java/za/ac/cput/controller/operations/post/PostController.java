package za.ac.cput.controller.operations.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.entity.operations.post.Post;
import za.ac.cput.service.operations.post.PostService;

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
        return this.postService.create(input);
    }

    @GetMapping("/findPost/{id}")
    public Post getPost(@PathVariable int id) {return this.postService.read(id);
    }

    @PutMapping ("/updatePost/{id}")
    public Post updatePost(@RequestBody Post input, @PathVariable int id){

        if (this.postService.checkInstance(id)) {

            return this.postService.create(input);
        } else
            return null;
    }

    @DeleteMapping("/deletePost/{id}")
    public boolean deletePost(@PathVariable int id){
        this.postService.delete(id);
        return !this.postService.checkInstance(id);
    }
}
