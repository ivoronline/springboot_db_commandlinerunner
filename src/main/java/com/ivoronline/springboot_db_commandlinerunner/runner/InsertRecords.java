package com.ivoronline.springboot_db_commandlinerunner.runner;

import com.ivoronline.springboot_db_commandlinerunner.entity.Person;
import com.ivoronline.springboot_db_commandlinerunner.repository.PersonRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InsertRecords implements CommandLineRunner {

  //PROPERTIES
  @Autowired PersonRepository authorRepository;

  //=========================================================================================================
  // INSERT RECORDS
  //=========================================================================================================
  @Override
  @Transactional
  public void run(String... args) {
    authorRepository.save(new Person(0, "John" , 20));
    authorRepository.save(new Person(0, "Bill" , 30));
    authorRepository.save(new Person(0, "Nancy", 40));
  }

}

