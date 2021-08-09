package za.ac.cput.entity.operations.tutor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity concrete class for TutorDetails
 * Author: Justin Scott Jenecke
 */

@Entity
public class TutorDetails {

    @Id
    private int tutorDetailsId;

    private String employmentType, tutorType;
    private int studentNo;

    protected TutorDetails(){}

    private TutorDetails(Builder b) {

        this.tutorDetailsId = b.tutorDetailsId;
        this.employmentType = b.employmentType;
        this.tutorType = b.tutorType;
        this.studentNo = b.studentNo;
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


    @Override
    public String toString() {
        return "TutorDetails{" +
                "tutorDetailsId=" + tutorDetailsId +
                ", employmentType='" + employmentType + '\'' +
                ", tutorType='" + tutorType + '\'' +
                ", studentNo=" + studentNo +
                '}';
    }

    public static class Builder {

        private int tutorDetailsId;
        private String employmentType, tutorType;
        private int studentNo;

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

        public Builder copy(TutorDetails t) {

            this.tutorDetailsId = t.tutorDetailsId;
            this.employmentType = t.employmentType;
            this.tutorType = t.tutorType;
            this.studentNo = t.studentNo;
            return this;
        }

        public TutorDetails build(){
            return new TutorDetails(this);
        }
    }
}
