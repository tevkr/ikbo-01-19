package ru.mirea.lab2_v3;

public class Book
{
    private String author;
    private String name;
    private String date;
    private int numOfPages;

    public Book(String author, String name, String date, int numOfPages)
    {
        this.author = author;
        this.name = name;
        this.date = date;
        this.numOfPages = numOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }
    @Override
    public String toString()
    {
        return "Book: " + author + ", " + name + ", " + date + ", " + numOfPages;
    }
}
