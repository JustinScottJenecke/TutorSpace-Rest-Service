package za.ac.cput.controller.operations.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.entity.operations.post.Post;
import za.ac.cput.service.operations.post.PostService;
import za.ac.cput.service.operations.tutor.TutorService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tutorspace/api/v1/post")
public class PostController {

    @Autowired
    private PostService postService;
    @Autowired
    private TutorService tutorService;

    @RequestMapping("/")
    public String greet(){
        return "/tutorspace/api/v1/post/ - create{id} - read{id} - update - delete{id}";
    }

    @PostMapping("/create/{tutorId}")
    public Post createPost(@RequestBody Post input, @PathVariable int tutorId) throws RuntimeException {

        if (this.tutorService.checkInstance(tutorId)) {

            Post newPost = new Post.Builder()
                    .setMajor(input.getMajor())
                    .setSubject(input.getSubject())
                    .setTopic(input.getTopic())
                    .setTutor(this.tutorService.read(tutorId))
                    .build();

            return this.postService.create(newPost);
        } else
            throw new RuntimeException("no valid Id or tutor is non-existent at Id: " + tutorId);
    }

    @GetMapping("/find/{id}")
    public Post getPost(@PathVariable int id) {return this.postService.read(id);
    }

    @GetMapping("/getAllById/{tutorId}")
    public List<Post> getAllPosts(@PathVariable int tutorId) {
        List<Post> postList = this.postService.getAll();
        List<Post> resultSet = new ArrayList<>();

        for (Post p: postList) {
            if (p.getTutor().getTutorId() == tutorId)
                resultSet.add(p);
        }
        return resultSet;
    }

    @PutMapping ("/update/{id}")
    public Post updatePost(@RequestBody Post input, @PathVariable int id){

        if (this.postService.checkInstance(id)) {

            Post newPost = new Post.Builder()
                    .setMajor(input.getMajor())
                    .setSubject(input.getSubject())
                    .setTopic(input.getTopic())
                    .build();

            //return this.postService.create(newPost);
            return this.postService.update(newPost);
        } else
            return null;
    }

    @DeleteMapping("/delete/{id}")
    public boolean deletePost(@PathVariable int id){
        this.postService.delete(id);
        return !this.postService.checkInstance(id);
    }
}
