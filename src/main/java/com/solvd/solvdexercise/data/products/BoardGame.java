package com.solvd.solvdexercise.data.products;

import com.solvd.solvdexercise.categories.BoardGameCategory;
import com.solvd.solvdexercise.data.Library;
import com.solvd.solvdexercise.enums.ProductCategory;

import java.util.Objects;

public class BoardGame extends Library {
    private int elementsNumber;

    public BoardGame(String author, String title, ProductCategory category, int elementsNumber) {
        super(author, title, category);
        this.elementsNumber = elementsNumber;
    }

    public int getElementsNumber() {
        return elementsNumber;
    }

    public void setElementsNumber(int elementsNumber) {
        this.elementsNumber = elementsNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BoardGame)) return false;
        if (!super.equals(o)) return false;
        BoardGame boardGame = (BoardGame) o;
        if (!getAuthor().equals(boardGame.getAuthor())) return false;
        if (!getTitle().equals(boardGame.getTitle())) return false;
        return elementsNumber == boardGame.elementsNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), elementsNumber);
    }

    @Override
    public void printCategory() {
        System.out.println(BoardGameCategory.CATEGORY_NAME);
    }

    @Override
    public String toString() {
        return "Title: " + getTitle();

    }
}









