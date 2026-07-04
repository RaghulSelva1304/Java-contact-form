package Newuser.Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @PostMapping("/contact")
    public String submitForm(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String message
    ) {

        Contact contact = new Contact();

        contact.setName(name);
        contact.setEmail(email);
        contact.setMessage(message);

        contactRepository.save(contact);

        return "Form Submitted Successfully!";
    }

    @GetMapping("/contacts")
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }
}