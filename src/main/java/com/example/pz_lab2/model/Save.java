package com.example.pz_lab2.model;

import java.time.LocalDateTime;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "saves")
public class Save {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private LocalDateTime saved_at;

    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Json json;

    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private JsonSchema jsonSchema;

    public Save() {

    }

    public Save(String title, LocalDateTime saved_at) {
        this.title = title;
        this.saved_at = saved_at;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getSaved_at() {
        return saved_at;
    }

    public void setSaved_at(LocalDateTime saved_at) {
        this.saved_at = saved_at;
    }

    public Json getJson() {
        return json;
    }

    public void setJson(Json json) {
        this.json = json;
    }

    public JsonSchema getJsonSchema() {
        return jsonSchema;
    }

    public void setJsonSchema(JsonSchema jsonSchema) {
        this.jsonSchema = jsonSchema;
    }

    @Override
    public String toString() {
        return "Save{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", saved_at=" + saved_at +
                ", json=" + json +
                ", jsonSchema=" + jsonSchema +
                '}';
    }
}
