package Newuser.Demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @PostMapping("/contact")
    public String submitForm(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String message) {

        System.out.println("========== FORM DATA ==========");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Message: " + message);
        System.out.println("===============================");

        return "Form Submitted Successfully!";
    }
}