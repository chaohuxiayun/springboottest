package pers.xy.mysqltest.service;

import pers.xy.mysqltest.entity.Book;

import java.util.List;

/**
 * @Description
 * @Date 2019/7/29
 * @Created by xiayun
 */
public interface BookService  {

    List<Book> getAllBooks();

    Book selectById(Integer id);

    int addBook(Book book);
}
