package com.ivoronline.springboot_db_commandlinerunner.repository;

import com.ivoronline.springboot_db_commandlinerunner.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> { }
