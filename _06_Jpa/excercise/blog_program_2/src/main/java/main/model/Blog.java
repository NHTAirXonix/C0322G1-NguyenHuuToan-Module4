package main.model;

import javax.persistence.*;

@Entity(name = "blog")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "blog_id")
    private Integer idBlog;
    @Column(name = "blog_title")
    private String title;
    @Column(name = "blog_content")
    private String content;
    @Column(name = "writing_day", columnDefinition = "DATE")
    private String day;
    @Column(name = "status", columnDefinition = "BIT(1)")
    private Integer status = 0;

    public Blog() {
    }

    public Blog(Integer idBlog, String title, String content, String day, Integer status) {
        this.idBlog = idBlog;
        this.title = title;
        this.content = content;
        this.day = day;
        this.status = status;
    }

    public Integer getIdBlog() {
        return idBlog;
    }

    public void setIdBlog(Integer idBlog) {
        this.idBlog = idBlog;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
