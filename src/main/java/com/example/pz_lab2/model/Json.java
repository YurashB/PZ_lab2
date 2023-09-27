package com.example.pz_lab2.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "jsons")
public class Json {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    public Json(String text) {
        this.text = text;
    }

    public Json() {

    }

    @Override
    public String toString() {
        return "Json{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}
