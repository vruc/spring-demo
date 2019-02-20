package com.example.demo.dao;

import com.example.demo.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactsRepository extends JpaRepository<Contact, Long> {
    Contact findByName(String name);

    List<Contact> findByNameLike(String name);
}
