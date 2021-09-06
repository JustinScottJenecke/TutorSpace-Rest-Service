package za.ac.cput.controller.operations.tutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.operations.tutor.Qualification;
import za.ac.cput.service.operations.tutor.QualificationService;
import za.ac.cput.service.operations.tutor.TutorService;

@RestController
@RequestMapping("/tutorspace/api/v1/qualification/")
public class QualificationController {

    @RequestMapping("/")
    public String greet(){
        return "Hello Qualification!";
    }


    @Autowired
    private QualificationService qualificationService;

    @Autowired
    private TutorService tutorService;

    @PostMapping("/createQualification/{tutorId}")
    public Qualification createQualification(@RequestBody Qualification input, @PathVariable int tutorId) {

        if (this.tutorService.checkInstance(tutorId)) {

            Qualification newQualification = new Qualification.Builder()
                    .setInstitution(input.getInstitution())
                    .setMajor(input.getMajor())
                    .setNqfLevel(input.getNqfLevel())
                    .setTutor(this.tutorService.read(tutorId))
                    .build();

            return this.qualificationService.create(newQualification);
        } else
            throw new RuntimeException("Error 404: no valid Id or tutor is non-existent at Id: " + tutorId);
    }

    @GetMapping("/findQualification/{id}")
    public Qualification getQualification(@PathVariable int id) {return this.qualificationService.read(id);
    }

    //No set tutor in update since qualifications cannot change owners/tutors
    @PutMapping ("/updateQualification/{id}")
    public Qualification updateQualification(@RequestBody Qualification input, @PathVariable int id){

        if (this.qualificationService.checkInstance(id)) {

            Qualification newQualification = new Qualification.Builder()
                    .setInstitution(input.getInstitution())
                    .setMajor(input.getMajor())
                    .setNqfLevel(input.getNqfLevel())
                    .build();

            return this.qualificationService.create(newQualification);
        } else
            throw new RuntimeException("Error 404: no valid Id or qualification Id: " + id + " in non-existent");
    }


    @DeleteMapping("/deleteQualification/{id}")
    public boolean deleteQualification(@PathVariable int id){
        this.qualificationService.delete(id);
        return !this.qualificationService.checkInstance(id);
    }
}
