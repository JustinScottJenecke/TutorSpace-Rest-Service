package za.ac.cput.controller.operations.tutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.entity.operations.tutor.QualificationList;
import za.ac.cput.service.operations.tutor.QualificationListService;


@RestController
@RequestMapping("/tutorspace/api/v1/qualificationlist/")
public class QualificationListController {

    @Autowired
    QualificationListService qualificationListService;

    @RequestMapping("/")
    public String greet(){
        return "Hello Qualification List!";
    }

    @RequestMapping(value = "create/", method = RequestMethod.POST)
    public QualificationList create(@RequestBody QualificationList qualificationList){
        return qualificationList;
    }

    @RequestMapping("read/")
    public String read(){
        return "Hello Qualification List!";
    }

}
