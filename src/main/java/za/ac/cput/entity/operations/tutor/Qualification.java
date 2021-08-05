package za.ac.cput.entity.operations.tutor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity concrete class for Qualification
 * Author: Justin Scott Jenecke
 */

public class Qualification {

    private int qualNo;
    private int nqfLevel;
    private String institution, major;

    protected Qualification(){}

    public Qualification(Builder b) {
        this.qualNo = b.qualNo;
        this.nqfLevel = b.nqfLevel;
        this.institution = b.institution;
        this.major = b.major;
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

        public Builder copy(Qualification q) {
            this.qualNo = q.qualNo;
            this.nqfLevel = q.nqfLevel;
            this.institution = q.institution;
            this.major = q.major;

            return this;
        }

        public Qualification build() {
            return new Qualification(this);
        }
    }
}
