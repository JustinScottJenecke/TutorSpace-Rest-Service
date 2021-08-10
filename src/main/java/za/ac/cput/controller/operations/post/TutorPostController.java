package za.ac.cput.controller.operations.post;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tutorspace/api/v1/tutorpost/")
public class TutorPostController {

    @RequestMapping("/")
    public String greet(){
        return "Hello Tutor Post!";
    }
}
