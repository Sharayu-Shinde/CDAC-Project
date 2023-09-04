package com.app.restapp.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "rating")
@Getter
@Setter
@NoArgsConstructor
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "rating")
    private int rating;

    @Column(name="comments")
    private String comments;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hostel_id")
    private Hostel selectedHostel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User selectedTenant;

    public Rating(int id, int rating, String comments, Hostel selectedHostel, User selectedTenant) {
        this.id = id;
        this.rating = rating;
        this.comments = comments;
        this.selectedHostel = selectedHostel;
        this.selectedTenant = selectedTenant;
    }
}
