package za.ac.cput.entity.operations.tutor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * POJO for Qualification objects
 * Author: Justin Scott Jenecke
 */

@Entity
public class Qualification {

    @Id
    private int qualNo;

    private int nqfLevel;
    private String institution, major;

    @ManyToOne
    @JoinColumn(name = "tutor_id")
    private Tutor tutor;

    protected Qualification(){}

    public Qualification(Builder b) {

        this.qualNo = b.qualNo;
        this.nqfLevel = b.nqfLevel;
        this.institution = b.institution;
        this.major = b.major;
        this.tutor = b.tutor;
    }

    public int getQualNo() {
        return qualNo;
    }

    public int getNqfLevel() {
        return nqfLevel;
    }

    public String getInstitution() {
        return institution;
    }

    public String getMajor() {
        return major;
    }

    public Tutor getTutor() {
        return tutor;
    }

    @Override
    public String toString() {
        return "Qualification{" +
                "qualNo=" + qualNo +
                ", nqfLevel=" + nqfLevel +
                ", institution='" + institution + '\'' +
                ", major='" + major + '\'' +
                ", tutor=" + tutor +
                '}';
    }

    public static class Builder {

        private int qualNo, nqfLevel;
        private String institution, major;
        private Tutor tutor;

        public Builder setQualNo(int qualNo) {
            this.qualNo = qualNo;
            return this;
        }

        public Builder setNqfLevel(int nqfLevel) {
            this.nqfLevel = nqfLevel;
            return this;
        }

        public Builder setInstitution(String institution) {
            this.institution = institution;
            return this;
        }

        public Builder setMajor(String major) {
            this.major = major;
            return this;
        }

        public Builder setTutor(Tutor tutor) {
            this.tutor = tutor;
            return this;
        }

        public Builder copy(Qualification q) {
            this.qualNo = q.qualNo;
            this.nqfLevel = q.nqfLevel;
            this.institution = q.institution;
            this.major = q.major;
            this.tutor = q.tutor;


            return this;
        }

        public Qualification build() {
            return new Qualification(this);
        }
    }
}
