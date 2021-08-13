package za.ac.cput.service.operations.tutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.operations.tutor.Tutor;
import za.ac.cput.repository.operations.tutor.ITutorRepository;

@Service
public class TutorService {

    @Autowired
    private ITutorRepository tutorRepository;

    public void create(Tutor post) {
        this.tutorRepository.save(post);
    }

    public Tutor read(int id) {
        return this.tutorRepository.findById(id).orElseGet(null);
    }

    public void update(Tutor post) {
        this.tutorRepository.save(post);
    }

    public void delete(int id) {
        this.tutorRepository.deleteById(id);
    }
}
