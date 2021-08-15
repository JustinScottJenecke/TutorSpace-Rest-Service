package za.ac.cput.service.operations.tutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.operations.tutor.TutorDetails;
import za.ac.cput.repository.operations.tutor.ITutorDetailsRepository;

@Service
public class TutorDetailsService {

    @Autowired
    private ITutorDetailsRepository tutorDetailsRepository;

    public TutorDetails create(TutorDetails td) {
        return this.tutorDetailsRepository.save(td);
    }

    public TutorDetails read(int id) {
        return this.tutorDetailsRepository.findById(id).orElseGet(null);
    }

    public TutorDetails update(TutorDetails td) {
        return this.tutorDetailsRepository.save(td);
    }

    public void delete(int id) {
        this.tutorDetailsRepository.deleteById(id);
    }

    public boolean checkInstance(int id) {
        return this.tutorDetailsRepository.existsById(id);
    }
}
