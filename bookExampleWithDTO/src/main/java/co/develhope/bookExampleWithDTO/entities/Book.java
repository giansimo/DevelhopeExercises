package co.develhope.bookExampleWithDTO.entities;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Book {
    private Long id;
    private String title;
    private String author;
    private String isbn;
    private Boolean isAMasterpiece;

    public Book() {}

    public Book(Long id, String title, String author, String isbn) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public Book(String title, String author, String isbn, Boolean isAMasterpiece) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAMasterpiece = isAMasterpiece;
    }

    public Book(Long id, String title, String author, String isbn, Boolean isAMasterpiece) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAMasterpiece = isAMasterpiece;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public Boolean isIsAMasterpiece() {
        return isAMasterpiece;
    }

    public void setIsAMasterpiece(Boolean isAMasterpiece) {
        this.isAMasterpiece = isAMasterpiece;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", isAMasterpiece=" + isAMasterpiece +
                '}';
    }
}
