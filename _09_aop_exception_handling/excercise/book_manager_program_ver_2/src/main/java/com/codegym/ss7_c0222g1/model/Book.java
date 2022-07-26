package com.codegym.ss7_c0222g1.model;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String author;

    @Column(columnDefinition = "date")
    private String publicationDate;
    private Integer quantity;

    @OneToMany(mappedBy = "book")
    private Set<User> User;

    public Book() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Set<com.codegym.ss7_c0222g1.model.User> getUser() {
        return User;
    }

    public void setUser(Set<com.codegym.ss7_c0222g1.model.User> user) {
        User = user;
    }
}
