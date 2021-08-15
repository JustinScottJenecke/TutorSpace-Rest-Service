package za.ac.cput.entity.operations.post;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity concrete class for Post
 * Author: Justin Scott Jenecke
 */

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int postNo;

    private String major, subject, topic;

    protected Post(){}

    private Post(Builder b) {

        this.postNo = b.postNo;
        this.major = b.major;
        this.subject = b.subject;
        this.topic = b.topic;
    }

    public int getPostNo() {
        return postNo;
    }

    public String getMajor() {
        return major;
    }

    public String getSubject() {
        return subject;
    }

    public String getTopic() {
        return topic;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postNo=" + postNo +
                ", major='" + major + '\'' +
                ", subject='" + subject + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }

    public static class Builder {

        private int postNo;
        private String major, subject, topic;

        public Builder setPostNo(int postNo) {
            this.postNo = postNo;
            return this;
        }

        public Builder setMajor(String major) {
            this.major = major;
            return this;
        }

        public Builder setSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder setTopic(String topic) {
            this.topic = topic;
            return this;
        }

        public Builder copy (Post p) {
            this.postNo = p.postNo;
            this.major = p.major;
            this.subject = p.subject;
            this.topic = p.topic;

            return this;
        }

        public Post build(){
            return new Post(this);
        }
    }
}
