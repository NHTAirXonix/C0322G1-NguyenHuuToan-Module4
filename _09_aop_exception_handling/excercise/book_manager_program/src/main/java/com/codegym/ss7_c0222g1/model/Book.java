package com.codegym.ss7_c0222g1.model;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Integer id;
    @Column(name = "book_name")
    private String name;
    @Column(name = "book_writer_name")
    private String writerName;
    @Column(name = "book_amount")
    private Integer amount;

    @OneToMany(mappedBy = "book")
    private Set<OderBook> oderBooks;

    public Book() {
    }

    public Book(Integer id, String name, String writerName, Integer amount) {
        this.id = id;
        this.name = name;
        this.writerName = writerName;
        this.amount = amount;
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

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
