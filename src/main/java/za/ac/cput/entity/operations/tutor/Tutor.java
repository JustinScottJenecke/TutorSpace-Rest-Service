package za.ac.cput.entity.operations.tutor;

import javax.persistence.Entity;
import javax.persistence.Id;

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
    private int qListNo;

    protected Tutor(){}

    private Tutor(Builder b) {

        this.tutorId = b.tutorId;
        this.tutorDetailsId = b.tutorDetailsId;
        this.qListNo = b.qListNo;
    }

    public int getTutorId() {
        return tutorId;
    }

    public int getTutorDetailsId() {
        return tutorDetailsId;
    }

    public int getqListNo() {
        return qListNo;
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "tutorId=" + tutorId +
                ", tutorDetails=" + tutorDetailsId +
                ", qualificationList=" + qListNo +
                '}';
    }

    public static class Builder{

        private int tutorId;
        private int tutorDetailsId;
        private int qListNo;

        public Builder setTutorId(int tutorId) {
            this.tutorId = tutorId;
            return this;
        }

        public Builder setTutorDetailsId(int tutorDetailsId) {
            this.tutorDetailsId = tutorDetailsId;
            return this;
        }

        public Builder setqListNo(int qListNo) {
            this.qListNo = qListNo;
            return this;
        }

        public Builder copy(Tutor t) {
            this.tutorId = t.tutorId;
            this.tutorDetailsId = t.tutorDetailsId;
            this.qListNo = t.qListNo;
            return this;
        }

        public Tutor build(){
            return new Tutor(this);
        }
    }
}
