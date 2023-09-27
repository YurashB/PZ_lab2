package com.example.pz_lab2.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "json_schemas")
public class JsonSchema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    public JsonSchema(String text) {
        this.text = text;
    }

    public JsonSchema() {

    }

    @Override
    public String toString() {
        return "JsonSchema{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}
