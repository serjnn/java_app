package com.my.mine.Controllers;


import com.my.mine.models.Books;
import com.my.mine.repo.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
