package com.example.project2;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "bookBank")
public class Book {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name ="title")
    private String title;

    @ColumnInfo(name="author")
    private String author;

    @ColumnInfo(name="genre")
    private String genre;

    @ColumnInfo(name="who")
    private String who;

    public Book(String title, String author, String genre, String who) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.who = who;
    }

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

    public String getGenre() {
        return genre;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String toString() {
        return title;
    }
}