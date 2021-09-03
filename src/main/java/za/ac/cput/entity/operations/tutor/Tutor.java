package za.ac.cput.entity.operations.tutor;

import za.ac.cput.entity.operations.post.Post;

import javax.persistence.*;
import java.util.List;
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

    @OneToOne
    private TutorDetails tutorDetailsId;

    @OneToMany(mappedBy = "tutor", fetch = FetchType.LAZY)
    private Set <Qualification> qualifications;

    @OneToMany(mappedBy = "tutor", fetch = FetchType.LAZY)
    private List<Post> posts;

    protected Tutor(){}

    private Tutor(Builder b) {

        this.tutorId = b.tutorId;
        this.tutorDetailsId = b.tutorDetailsId;
        this.qualifications = b.qualifications;
        this.posts = b.posts;
    }

    public int getTutorId() {
        return tutorId;
    }

    public TutorDetails getTutorDetailsId() {
        return tutorDetailsId;
    }

    public Set<Qualification> getQualifications() {
        return qualifications;
    }

    public List<Post> getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "tutorId=" + tutorId +
                ", tutorDetailsId=" + tutorDetailsId +
                ", qualifications=" + qualifications +
                ", posts=" + posts +
                '}';
    }

    public static class Builder{

        private int tutorId;
        private TutorDetails tutorDetailsId;
        private Set <Qualification> qualifications;
        private List<Post> posts;

        public Builder setTutorId(int tutorId) {
            this.tutorId = tutorId;
            return this;
        }

        public Builder setTutorDetailsId(TutorDetails tutorDetailsId) {
            this.tutorDetailsId = tutorDetailsId;
            return this;
        }

        public Builder setQualifications(Set<Qualification> qualifications) {
            this.qualifications = qualifications;
            return this;
        }

        public Builder setPosts(List<Post> posts) {
            this.posts = posts;
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
