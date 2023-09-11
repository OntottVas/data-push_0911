package hu.progmatic.datapush_0911.controller;

import hu.progmatic.datapush_0911.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DataStorageController {

    private List<User> users = new ArrayList<>();

    @GetMapping("/home")
    public String getHome() {
        return "home";
    }

    @GetMapping("/registration")
    public String getRegistration() {
        return "registration";
    }

    @GetMapping("/show")
    public String getShow(Model model) {
        model.addAttribute("users", users);
        return "show";
    }

    @PostMapping("/regist")
    public String register(User user) {
        users.add(user);
        return "redirect:/home";
    }
}
