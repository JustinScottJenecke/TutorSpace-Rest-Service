package za.ac.cput.controller.operations.tutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.operations.tutor.Tutor;
import za.ac.cput.service.operations.tutor.TutorService;

@RestController
@RequestMapping("/tutorspace/api/v1/tutor")
public class TutorController {

    @Autowired
    private TutorService tutorService;

    @RequestMapping("/")
    public String greet(){
        return "/createTutor - /findTutor/{id} - /updateTutor/{id} - /deleteTutor/{id}";
    }

    @PostMapping("/createTutor")
    public Tutor createTutor(@RequestBody Tutor tutor) {
        Tutor newTutor = new Tutor.Builder()
                .setTutorId(tutor.getTutorId())
                .setTutorDetailsId(tutor.getTutorDetailsId())
                .setQualifications(tutor.getQualifications())
                .build();

        return this.tutorService.create(newTutor);
    }

    //@RequestMapping(value = "/findTutor/{tutorId}", method = RequestMethod.GET)
    @GetMapping("/findTutor/{tutorId}")
    public Tutor getTutor(@PathVariable int tutorId) {return this.tutorService.read(tutorId);
    }

    @PutMapping ("/updateTutor/{id}")
    public Tutor updateTutor(@RequestBody Tutor tutor, @PathVariable int id){

        if (this.tutorService.checkInstance(id)) {
            Tutor newTutor = new Tutor.Builder()
                    .setTutorId(tutor.getTutorId())
                    .setTutorDetailsId(tutor.getTutorDetailsId())
                    .setQualifications(tutor.getQualifications())
                    .build();

            return this.tutorService.create(newTutor);
        } else
            return null;

       /* if (this.tutorService.checkInstance(id)){
            Tutor newTutor = new Tutor.Builder()
                    .setTutorId(tutor.getTutorId())
                    .setTutorDetailsId(tutor.getTutorDetailsId())
                    .setQualifications(tutor.getQualifications())
                    .build();

            this.tutorService.delete(id);

            return this.tutorService.create(newTutor);
        } else
            return null;*/
    }

    @DeleteMapping("/deleteTutor/{id}")
    public boolean deleteTutor(@PathVariable int id){
        this.tutorService.delete(id);
        return !this.tutorService.checkInstance(id);
    }

}
