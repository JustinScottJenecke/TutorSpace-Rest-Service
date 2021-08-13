package za.ac.cput.entity.operations.tutor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * Entity concrete class for Tutors
 * Serves as aggregate root for tutor-sub entities
 * Author: Justin Scott Jenecke
 */

@Entity
public class Tutor {

    @Id
    private int tutorId;

    private int tutorDetailsId;

    @OneToMany(mappedBy = "tutor", fetch = FetchType.EAGER)
    private Set <Qualification> qualifications;

    protected Tutor(){}

    private Tutor(Builder b) {

        this.tutorId = b.tutorId;
        this.tutorDetailsId = b.tutorDetailsId;
        this.qualifications = b.qualifications;
    }

    public int getTutorId() {
        return tutorId;
    }

    public int getTutorDetailsId() {
        return tutorDetailsId;
    }

    public Set getQualifications() {
        return qualifications;
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "tutorId=" + tutorId +
                ", tutorDetails=" + tutorDetailsId +
                ", qualificationList=" + qualifications +
                '}';
    }

    public static class Builder{

        private int tutorId;
        private int tutorDetailsId;
        private Set <Qualification> qualifications;

        public Builder setTutorId(int tutorId) {
            this.tutorId = tutorId;
            return this;
        }

        public Builder setTutorDetailsId(int tutorDetailsId) {
            this.tutorDetailsId = tutorDetailsId;
            return this;
        }

        public Builder setQualifications(Set qualifications) {
            this.qualifications = qualifications;
            return this;
        }

        public Builder copy(Tutor t) {
            this.tutorId = t.tutorId;
            this.tutorDetailsId = t.tutorDetailsId;
            this.qualifications = t.qualifications;
            return this;
        }

        public Tutor build(){
            return new Tutor(this);
        }
    }
}
