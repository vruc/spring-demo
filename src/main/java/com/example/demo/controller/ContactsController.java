package com.example.demo.controller;

import com.example.demo.dao.ContactsRepository;
import com.example.demo.domain.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/contacts")
public class ContactsController {

    @Autowired
    ContactsRepository contactsRepository;

    @RequestMapping(value = "/save/new", method = RequestMethod.POST)
    @ResponseBody
    public Contact saveNewContact(@RequestBody Contact contact) {
        return contactsRepository.save(contact);
    }

    @RequestMapping(value = "/byName", method = RequestMethod.GET)
    @ResponseBody
    public Contact findContactByName(@RequestParam(value = "name", defaultValue = "") String name) {
        return contactsRepository.findByName(name);
    }

    @RequestMapping(value = "/byNameLike", method = RequestMethod.GET)
    @ResponseBody
    public List<Contact> findContactByNameLike(@RequestParam(value = "name", defaultValue = "") String name) {
        String nameWhere = "%" + name + "%";
        return contactsRepository.findByNameLike(nameWhere);
    }

}
