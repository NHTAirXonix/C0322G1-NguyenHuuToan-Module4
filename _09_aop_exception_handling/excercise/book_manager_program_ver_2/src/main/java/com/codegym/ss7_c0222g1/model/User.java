package com.codegym.ss7_c0222g1.model;

import javax.persistence.*;

@Entity(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "varchar(255)", unique = true)
    private String code;

    @ManyToOne(targetEntity = Book.class)
    @JoinColumn(name = "id_book")
    private Book book;

    public User() {
    }

    public User(String code, Book book) {
        this.code = code;
        this.book = book;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public com.codegym.ss7_c0222g1.model.Book getBook() {
        return book;
    }

    public void setBook(com.codegym.ss7_c0222g1.model.Book book) {
        book = book;
    }
}