package io.datajek.springdatajpa.e_book;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;

@Entity
@NamedQuery(
        name = "get_all_ebooks",
        query = "select b from Ebook b"
)
public class Ebook {

    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String author;
    private double price;

    // No-argument constructor
    public Ebook() {
    }

    // Parameterized constructor
    public Ebook(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //constructor without Id attribute
    public Ebook(String title, String author, double price) {
        super();
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ebook [" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ']';
    }
}
