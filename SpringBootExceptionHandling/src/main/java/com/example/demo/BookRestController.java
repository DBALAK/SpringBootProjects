package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookRestController {
	
    List<Book> books = new ArrayList<>();
        
    public BookRestController() {
        books.add(new Book("The Silence of the Lambs", "Thomas Harris", "Thriller"));
        books.add(new Book("Murder on the Orient Express", "Agatha Christie", "Thriller"));
        books.add(new Book("A Midsummer Night's Dream", "William Shakespeare", "Comedy"));
    }

    @GetMapping("/{id}") 
    public Book get(@PathVariable("id") int id) {
        return books.get(id);
    }
	
    @GetMapping("/100") 
    public void error() {
        throw new IllegalArgumentException("invalid book id");
    }
		
}
