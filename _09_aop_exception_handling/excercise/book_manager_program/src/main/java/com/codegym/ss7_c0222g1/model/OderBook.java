package com.codegym.ss7_c0222g1.model;

import javax.persistence.*;

@Entity(name = "oderbook")
public class OderBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "oder_id")
    private Integer id;

    @Column(name = "oder_book_id")
    private Integer idOderBook;

    @Column(name = "oder_book_status")
    private String oderStatus;

    @ManyToOne(targetEntity = Book.class)
    @JoinColumn(name = "book_id")
    private Book book;

    public OderBook() {
    }

    public OderBook(Integer id, Integer idOderBook, String oderStatus, Book book) {
        this.id = id;
        this.idOderBook = idOderBook;
        this.oderStatus = oderStatus;
        this.book = book;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdOderBook() {
        return idOderBook;
    }

    public void setIdOderBook(Integer idOderBook) {
        this.idOderBook = idOderBook;
    }

    public String getOderStatus() {
        return oderStatus;
    }

    public void setOderStatus(String oderStatus) {
        this.oderStatus = oderStatus;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
