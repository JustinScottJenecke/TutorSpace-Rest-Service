package za.ac.cput.service.operations.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.operations.post.TutorPost;
import za.ac.cput.repository.operations.post.ITutorPostRepository;

@Service
public class TutorPostService {

    @Autowired
    ITutorPostRepository tutorPostRepository;

    public void create(TutorPost tutorPost) {
        this.tutorPostRepository.save(tutorPost);
    }

    public TutorPost read(int id){
        return this.tutorPostRepository.findById(id).orElseGet(null);
    }

    public void update(TutorPost tutorPost) {
        this.tutorPostRepository.save(tutorPost);
    }

    public void delete(int id) {
        this.tutorPostRepository.deleteById(id);
    }

}
