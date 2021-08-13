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
    @JoinColumn(name = "q_list_no")
    private QualificationList qualificationList;

    protected Qualification(){}

    public Qualification(Builder b) {

        this.qualNo = b.qualNo;
        this.nqfLevel = b.nqfLevel;
        this.institution = b.institution;
        this.major = b.major;
        this.qualificationList = b.qualificationList;

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

    public QualificationList getQualificationList() {
        return qualificationList;
    }

    @Override
    public String toString() {
        return "Qualification{" +
                "qualNo=" + qualNo +
                ", nqfLevel=" + nqfLevel +
                ", institution='" + institution + '\'' +
                ", major='" + major + '\'' +
                '}';
    }

    public static class Builder {

        private int qualNo, nqfLevel;
        private String institution, major;
        private QualificationList qualificationList;

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

        public Builder setQualificationList(QualificationList qualificationList) {
            this.qualificationList = qualificationList;
            return this;
        }

        public Builder copy(Qualification q) {
            this.qualNo = q.qualNo;
            this.nqfLevel = q.nqfLevel;
            this.institution = q.institution;
            this.major = q.major;
            this.qualificationList = q.qualificationList;

            return this;
        }

        public Qualification build() {
            return new Qualification(this);
        }
    }
}
