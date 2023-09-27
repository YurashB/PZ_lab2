package com.example.pz_lab2;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.pz_lab2.model.Json;
import com.example.pz_lab2.model.JsonSchema;
import com.example.pz_lab2.model.Save;
import com.example.pz_lab2.repository.SaveRepository;

@SpringBootTest
public class SaveRepositoryTest {

    @Autowired
    private SaveRepository repository;


    @Test
    void count_saves_in_db() {
        System.out.println("Saves count: " + repository.getAll().size());
    }

    @Test
    void insert_save_in_db() {
        Json json = new Json("Some text");
        JsonSchema jsonSchema = new JsonSchema("Some text");
        Save save = new Save("Some title", LocalDateTime.now());
        save.setJson(json);
        save.setJsonSchema(jsonSchema);
        System.out.println("Add save entity to db: ");
        System.out.println(repository.save(save));
    }

}
