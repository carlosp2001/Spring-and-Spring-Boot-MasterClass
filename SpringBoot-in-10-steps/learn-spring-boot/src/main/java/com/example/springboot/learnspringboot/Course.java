package com.example.springboot.learnspringboot;

public class Course {
    private long id;
    private String author;
    private String name;

    // Constructor
    public Course(long id, String author, String name) {
        this.id = id;
        this.author = author;
        this.name = name;
    }

    // Getters
    public long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    // toString

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
