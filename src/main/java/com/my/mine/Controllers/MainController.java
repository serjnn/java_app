package com.my.mine.Controllers;


import com.my.mine.models.Books;
import com.my.mine.repo.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private BooksRepository rep;

    @GetMapping("/")
    public String index(Model model){
        Iterable<Books> boks = rep.findAll();
        model.addAttribute("boks", boks);
        return "index";
    }
    @PostMapping("/")
    public String bookadd(@RequestParam String name, @RequestParam String title,Model model){
        Books saver = new Books(name, title );
        rep.save(saver);

        return "redirect:/";
    }

    @PostMapping("/deleteAll")
    public String deleteAllBooks() {
        rep.deleteAll();
        return "redirect:/";
    }


}
