package com.twu.biblioteca;

/**
 * Created by richiethomas on 6/17/14.
 */
public class Book {

  private String title;
  private String author;
  private int year;

  public Book(String title, String author, int year) {
    this.title = title;
    this.author = author;
    this.year = year;
  }

  public String getTitle() {
    return title;
  }
}