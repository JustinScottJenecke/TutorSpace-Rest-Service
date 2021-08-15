package za.ac.cput.controller.operations.tutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.operations.tutor.Qualification;
import za.ac.cput.service.operations.tutor.QualificationService;

@RestController
@RequestMapping("/tutorspace/api/v1/qualification/")
public class QualificationController {

    @RequestMapping("/")
    public String greet(){
        return "Hello Qualification!";
    }


    @Autowired
    QualificationService qualificationService;

    @PostMapping("/createQualification/")
    public Qualification createQualification(@RequestBody Qualification input) {
        return this.qualificationService.create(input);
    }

    @GetMapping("/findQualification/{id}")
    public Qualification getQualification(@PathVariable int id) {return this.qualificationService.read(id);
    }

    @PutMapping ("/updateQualification/{id}")
    public Qualification updateQualification(@RequestBody Qualification input, @PathVariable int id){

        if (this.qualificationService.checkInstance(id)) {

            return this.qualificationService.create(input);
        } else
            return null;
    }

    @DeleteMapping("/deleteQualification/{id}")
    public boolean deleteQualification(@PathVariable int id){
        this.qualificationService.delete(id);
        return !this.qualificationService.checkInstance(id);
    }
}
