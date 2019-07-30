package pers.xy.mysqltest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.xy.mysqltest.entity.Book;
import pers.xy.mysqltest.service.BookService;

import java.util.List;

/**
 * @Description
 * @Date 2019/7/29
 * @Created by xiayun
 */
@RestController
@RequestMapping("/bookController")
public class BookController {

    @Autowired
    private BookService bookService;


    @RequestMapping("/getBook/{id}")
    Book getBook(@PathVariable("id") Integer id) {
        return bookService.selectById(id);
    }

    @RequestMapping("/getAllBook")
    List<Book> getAllBook() {
        return bookService.getAllBooks();
    }
}
