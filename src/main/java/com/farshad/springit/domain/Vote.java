package com.farshad.springit.domain;

import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Vote extends Auditable {

    @Id
    @GeneratedValue
    private long id;
    @NonNull
    private String vote;

    public Vote(){}

    

    /**
     * @return long return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return String return the vote
     */
    public String getVote() {
        return vote;
    }

    /**
     * @param vote the vote to set
     */
    public void setVote(String vote) {
        this.vote = vote;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "id=" + id +
                ", vote='" + vote + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote1 = (Vote) o;
        return id == vote1.id &&
                Objects.equals(vote, vote1.vote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vote);
    }
}