package com.example.loginsecurity.web;

import com.example.loginsecurity.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    private final UserService userService;

    // Constructor
    public UserRegistrationController(UserService userService){
        this.userService = userService;
    }

    // GET method to show the registration form
    @GetMapping
    public String showRegistrationForm(Model model){
        // Add a new DTO object so Thymeleaf can bind the form
        model.addAttribute("user", new UserRegistrationDto());
        return "registration"; // Thymeleaf template name
    }

    // POST method to handle form submission
    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto){
        // Save the user through the service layer
        userService.save(registrationDto);

        // Redirect after successful registration
        return "redirect:/registration?success";
    }

}
