package za.ac.cput.entity.operations.tutor;

/**
 * Entity concrete class for QualificationList
 * Holds unordered Set of Qualification(s)
 * Author: Justin Scott Jenecke
 */

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class QualificationList {

    @Id
    private int qListNo;

    @OneToMany
    private Set<Qualification> qualifications;

    protected QualificationList() { }

    private QualificationList(Builder b) {

        this.qListNo = b.qListNo;
        this.qualifications = b.qualifications;
    }

    public int getqListNo() {
        return qListNo;
    }

    public Set<Qualification> getQualifications() {
        return qualifications;
    }

    @Override
    public String toString() {
        return "QualificationList{" +
                "qListNo=" + qListNo +
                ", qualifications=" + qualifications +
                '}';
    }

    public static class Builder {

        private int qListNo;
        private Set<Qualification> qualifications;

        public Builder setqListNo(int qListNo) {
            this.qListNo = qListNo;
            return this;
        }

        public Builder setQualifications(Set<Qualification> qualifications) {
            this.qualifications = qualifications;
            return this;
        }

        public Builder copy (QualificationList ql) {
            this.qListNo = ql.qListNo;
            this.qualifications = ql.qualifications;
            return this;
        }

        public QualificationList build(){
            return new QualificationList(this);
        }

    }
}
