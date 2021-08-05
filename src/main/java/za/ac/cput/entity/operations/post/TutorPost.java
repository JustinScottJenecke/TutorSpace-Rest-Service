package za.ac.cput.entity.operations.post;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Aggregate-root concrete class for TutorPosts
 * Author: Justin Scott Jenecke
 */

@Entity
public class TutorPost {

    @Id
    private int tutorPostId;

    private int tutorId;
    private int postNo;

    protected TutorPost(){}

    public TutorPost(Builder b) {
        this.tutorPostId = b.tutorPostId;
        this.tutorId = b.tutorId;
        this.postNo = b.postNo;
    }

    public int getTutorPostId() {
        return tutorPostId;
    }

    public int getTutorId() {
        return tutorId;
    }

    public int getPostNo() {
        return postNo;
    }

    @Override
    public String toString() {
        return "TutorPost{" +
                "tutorPostId=" + tutorPostId +
                ", tutorId=" + tutorId +
                ", postNo=" + postNo +
                '}';
    }

    public static class Builder {

        private int tutorPostId;
        private int tutorId;
        private int postNo;

        public Builder setTutorId(int tutorId) {
            this.tutorId = tutorId;
            return this;
        }

        public Builder setPostNo(int postNo) {
            this.postNo = postNo;
            return this;
        }

        public Builder setTutorPostId(int tutorPostId) {
            this.tutorPostId = tutorPostId;
            return this;
        }

        public Builder copy(TutorPost tp) {
            this.tutorId = tp.tutorPostId;
            this.tutorId = tp.tutorId;
            this.postNo = tp.postNo;
            return this;
        }

        public TutorPost build(){
            return new TutorPost(this);
        }
    }
}
