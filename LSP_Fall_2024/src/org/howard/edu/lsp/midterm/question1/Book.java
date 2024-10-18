//to avoid plagirism penalties the Answer for this questions was created with the help of online learning tools like AI and google, 

package org.howard.edu.lsp.midterm.question1;

public class Book {
	// Attributes
    private String title;       // The title of the book
    private String author;      // The author of the book
    private String ISBN;        // The ISBN number of the book (unique identifier)
    private int yearPublished;  // The year the book was published
    /**
     * Constructs a Book with specified attributes.
     */
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    // Getters and Setters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getISBN() { return ISBN; }
    public int getYearPublished() { return yearPublished; }
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setISBN(String ISBN) { this.ISBN = ISBN; }
    public void setYearPublished(int yearPublished) { this.yearPublished = yearPublished; }

    /**
     * Compares this Book with another for equality based on ISBN and author.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Book) {
            Book otherBook = (Book) obj;
            return this.ISBN.equals(otherBook.ISBN) && this.author.equals(otherBook.author);
        }
        return false;
    }

    /**
     * Returns a string representation of the Book.
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }  
}


