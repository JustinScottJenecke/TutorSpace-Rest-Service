package za.ac.cput.service.operations.tutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.operations.tutor.Qualification;
import za.ac.cput.entity.operations.tutor.QualificationList;
import za.ac.cput.repository.operations.tutor.IQualificationListRepository;

@Service
public class QualificationListService {

    @Autowired
    IQualificationListRepository qualificationListRepository;

    public void create(QualificationList ql) {
        this.qualificationListRepository.save(ql);
    }

    public QualificationList read(int id) {
        return this.qualificationListRepository.findById(id).orElseGet(null);
    }

    public void update(QualificationList ql) {this.qualificationListRepository.save(ql);}

    public void delete(int id) {
        this.qualificationListRepository.deleteById(id);
    }

    public void addQualification (Qualification newQualification, int id) {
        QualificationList updateList = this.read(id);
        updateList.getQualifications().add(newQualification);
        this.update(updateList);

    }
}
