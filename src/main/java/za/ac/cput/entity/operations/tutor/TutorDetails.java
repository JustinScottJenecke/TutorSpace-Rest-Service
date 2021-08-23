package za.ac.cput.entity.operations.tutor;

import javax.persistence.*;

/**
 * Entity concrete class for TutorDetails
 * Author: Justin Scott Jenecke
 */

@Entity
public class TutorDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tutorDetailsId;

    private String employmentType, tutorType;
    private int studentNo;

    @OneToOne
    private Tutor tutor;

    protected TutorDetails(){}

    private TutorDetails(Builder b) {

        this.tutorDetailsId = b.tutorDetailsId;
        this.employmentType = b.employmentType;
        this.tutorType = b.tutorType;
        this.studentNo = b.studentNo;
        this.tutor = b.tutor;
    }

    public int getTutorDetailsId() {
        return tutorDetailsId;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public String getTutorType() {
        return tutorType;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public Tutor getTutor() {
        return tutor;
    }

    @Override
    public String toString() {
        return "TutorDetails{" +
                "tutorDetailsId=" + tutorDetailsId +
                ", employmentType='" + employmentType + '\'' +
                ", tutorType='" + tutorType + '\'' +
                ", studentNo=" + studentNo +
                ", tutor=" + tutor +
                '}';
    }

    public static class Builder {

        private int tutorDetailsId;
        private String employmentType, tutorType;
        private int studentNo;
        private Tutor tutor;

        public Builder setTutorDetailsId(int tutorDetailsId) {
            this.tutorDetailsId = tutorDetailsId;
            return this;
        }

        public Builder setEmploymentType(String employmentType) {
            this.employmentType = employmentType;
            return this;
        }

        public Builder setTutorType(String tutorType) {
            this.tutorType = tutorType;
            return this;
        }

        public Builder setStudentNo(int studentNo) {
            this.studentNo = studentNo;
            return this;
        }

        public Builder setTutor(Tutor tutor) {
            this.tutor = tutor;
            return this;
        }

        public Builder copy(TutorDetails t) {

            this.tutorDetailsId = t.tutorDetailsId;
            this.employmentType = t.employmentType;
            this.tutorType = t.tutorType;
            this.studentNo = t.studentNo;
            this.tutor = t.tutor;
            return this;
        }

        public TutorDetails build(){
            return new TutorDetails(this);
        }
    }
}
