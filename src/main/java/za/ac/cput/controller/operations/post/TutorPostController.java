package za.ac.cput.controller.operations.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.operations.post.TutorPost;
import za.ac.cput.service.operations.post.TutorPostService;

@RestController
@RequestMapping("/tutorspace/api/v1/tutorpost/")
public class TutorPostController {

    @RequestMapping("/")
    public String greet(){
        return "Hello Tutor Post!";
    }


    @Autowired
    TutorPostService tutorPostService;

    @PostMapping("/createTutorPost/")
    public TutorPost createTutorPost(@RequestBody TutorPost input) {
        return this.tutorPostService.create(input);
    }

    @GetMapping("/findTutorPost/{id}")
    public TutorPost getTutorPost(@PathVariable int id) {return this.tutorPostService.read(id);
    }

    @PutMapping ("/updateTutorPost/{id}")
    public TutorPost updateTutorPost(@RequestBody TutorPost input, @PathVariable int id){

        if (this.tutorPostService.checkInstance(id)) {

            return this.tutorPostService.create(input);
        } else
            return null;
    }

    @DeleteMapping("/deleteTutorPost/{id}")
    public boolean deleteTutorPost(@PathVariable int id){
        this.tutorPostService.delete(id);
        return !this.tutorPostService.checkInstance(id);
    }
}
