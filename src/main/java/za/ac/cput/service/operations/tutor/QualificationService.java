package za.ac.cput.service.operations.tutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.operations.tutor.Qualification;
import za.ac.cput.repository.operations.tutor.IQualificationRepository;

@Service
public class QualificationService {

    @Autowired
    private IQualificationRepository qualificationRepository;

    public Qualification create(Qualification ql) {
        return this.qualificationRepository.save(ql);
    }

    public Qualification read(int id) {
        return this.qualificationRepository.findById(id).orElseGet(null);
    }

    public Qualification update(Qualification ql) {
        return this.qualificationRepository.save(ql);
    }

    public void delete(int id) {
        this.qualificationRepository.deleteById(id);
    }

    public boolean checkInstance(int id) {
        return this.qualificationRepository.existsById(id);
    }
}