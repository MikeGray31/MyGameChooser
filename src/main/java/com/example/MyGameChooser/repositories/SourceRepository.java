package com.example.MyGameChooser.repositories;

import com.example.MyGameChooser.models.Source;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SourceRepository extends CrudRepository<Source, Long> {
}
