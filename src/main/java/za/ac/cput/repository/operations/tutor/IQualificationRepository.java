package za.ac.cput.repository.operations.tutor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.operations.tutor.Qualification;

@Repository
public interface IQualificationRepository extends JpaRepository <Qualification, Integer> {
}
