package com.example.pz_lab2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.pz_lab2.model.Save;

@Repository
public interface SaveRepository extends JpaRepository<Save, Integer> {

    @Query(value = "select * from saves", nativeQuery = true)
    List<Save> getAll();

    @Query(value = "select * from saves where id = ?1", nativeQuery = true)
    Save getSaveById(long id);
}
