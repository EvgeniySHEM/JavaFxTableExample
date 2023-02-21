package com.example.javafxtableexample;

import java.util.Objects;

public class Authors {
    private final Integer id;
    private final String author_name;
    private final String notes;

    public Authors(Integer id, String author_name, String notes) {
        this.id = id;
        this.author_name = author_name;
        this.notes = notes;
    }

    public Integer getId() {
        return id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public String getNotes() {
        return notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Authors authors = (Authors) o;
        return id.equals(authors.id) && author_name.equals(authors.author_name) && Objects.equals(notes, authors.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author_name, notes);
    }

    @Override
    public String toString() {
        return "Authors{" +
                "id=" + id +
                ", author_name='" + author_name + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
