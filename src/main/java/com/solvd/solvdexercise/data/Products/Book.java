package com.solvd.solvdexercise.data.Products;

import com.solvd.solvdexercise.categories.BookCategory;
import com.solvd.solvdexercise.data.Library;
import com.solvd.solvdexercise.enums.Category;

import java.util.Objects;

public class Book extends Library {
    private int pagesNumber;
    private Category category;

    public Book(String author, String title, int pagesNumber) {
        super(author, title);
        this.pagesNumber = pagesNumber;
    }

    public Book(String author, String title, int pagesNumber, Category category) {
        super(author, title);
        this.pagesNumber = pagesNumber;
        this.category = category;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        if (!getAuthor().equals(book.getAuthor())) return false;
        if (!getTitle().equals(book.getTitle())) return false;
        return pagesNumber == book.pagesNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pagesNumber);
    }

    @Override
    public String toString() {
        return "Title - " + getTitle() +
                "\nauthor - " + getAuthor() +
                "\npages number - " + getPagesNumber() + "\n";
    }

    @Override
    public void printCategory() {
        System.out.println(BookCategory.CATEGORY_NAME);
    }

}