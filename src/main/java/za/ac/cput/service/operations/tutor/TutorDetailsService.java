package za.ac.cput.service.operations.tutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.operations.tutor.TutorDetails;
import za.ac.cput.repository.operations.tutor.ITutorDetailsRepository;

@Service
public class TutorDetailsService {

    @Autowired
    ITutorDetailsRepository tutorDetailsRepository;

    public void create(TutorDetails td) {
        this.tutorDetailsRepository.save(td);
    }

    public TutorDetails read(int id) {
        return this.tutorDetailsRepository.findById(id).orElseGet(null);
    }

    public void update(TutorDetails td) {
        this.tutorDetailsRepository.save(td);
    }

    public void delete(int id) {
        this.tutorDetailsRepository.deleteById(id);
    }
}
