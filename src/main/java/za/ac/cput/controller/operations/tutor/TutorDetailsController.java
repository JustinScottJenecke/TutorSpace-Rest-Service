package za.ac.cput.controller.operations.tutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.operations.tutor.TutorDetails;
import za.ac.cput.service.operations.tutor.TutorDetailsService;

@RestController
@RequestMapping("/tutorspace/api/v1/tutordetails")
public class TutorDetailsController {

    @RequestMapping("/")
    public String greet(){
        return "Hello Tutor Details!";
    }

    @Autowired
    TutorDetailsService tutorDetailsService;

    @PostMapping("/createTutorDetails/")
    public TutorDetails createTutorDetails(@RequestBody TutorDetails input) {
        return this.tutorDetailsService.create(input);
    }

    @GetMapping("/findTutorDetails/{id}")
    public TutorDetails getTutorDetails(@PathVariable int id) {return this.tutorDetailsService.read(id);
    }

    @PutMapping ("/updateTutorDetails/{id}")
    public TutorDetails updateTutorDetails(@RequestBody TutorDetails input, @PathVariable int id){

        if (this.tutorDetailsService.checkInstance(id)) {

            return this.tutorDetailsService.create(input);
        } else
            return null;
    }

    @DeleteMapping("/deleteDetails/{id}")
    public boolean deleteTutorDetails(@PathVariable int id){
        this.tutorDetailsService.delete(id);
        return !this.tutorDetailsService.checkInstance(id);
    }
}
