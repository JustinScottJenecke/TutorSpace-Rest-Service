package za.ac.cput.repository.operations.tutor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.operations.tutor.TutorDetails;

@Repository
public interface ITutorDetailsRepository  extends JpaRepository<TutorDetails, Integer> {
}
