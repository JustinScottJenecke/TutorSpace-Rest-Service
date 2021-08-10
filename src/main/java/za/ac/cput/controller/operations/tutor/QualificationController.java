package za.ac.cput.controller.operations.tutor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tutorspace/api/v1/qualification/")
public class QualificationController {

    @RequestMapping("/")
    public String greet(){
        return "Hello Qualification!";
    }
}
