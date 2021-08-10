package za.ac.cput.controller.operations.tutor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tutorspace/api/v1/tutordetails")
public class TutorDetailsController {

    @RequestMapping("/")
    public String greet(){
        return "Hello Tutor Details!";
    }
}
