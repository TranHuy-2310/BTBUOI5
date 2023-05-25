package com.example.demo.controller;

import com.example.demo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;

@Controller
//@RequestMapping("/books")
public class BookController{
    @Autowired
    private List<Book> books;

    @GetMapping("/")
    public String listBooks(Model model){
        model.addAttribute( "books", books);
        model.addAttribute("title", "Book List");
        return "book/list";

    }
}


