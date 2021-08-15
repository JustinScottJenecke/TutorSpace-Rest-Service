package za.ac.cput.service.operations.tutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.operations.tutor.Tutor;
import za.ac.cput.repository.operations.tutor.ITutorRepository;

@Service
public class TutorService {

    @Autowired
    private ITutorRepository tutorRepository;

    public Tutor create(Tutor post) {
        return this.tutorRepository.save(post);
    }

    //Reads Tutor by id : returns false if Tutor not found
    public Tutor read(int id) {
        return this.tutorRepository.findById(id).orElseGet(null);
    }

    public Tutor update(Tutor post) {
        return this.tutorRepository.save(post);
    }

    //Deletes Tutor by id
    public void delete(int id) {
        this.tutorRepository.deleteById(id);
    }

    public boolean checkInstance(int id) {
        return this.tutorRepository.existsById(id);
    }
}
