package pers.xy.mysqltest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.xy.mysqltest.dao.BookMapper;
import pers.xy.mysqltest.entity.Book;
import pers.xy.mysqltest.service.BookService;

import java.util.List;

/**
 * @Description
 * @Date 2019/7/29
 * @Created by xiayun
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> getAllBooks() {
        return bookMapper.selectAll();
    }

    @Override
    public Book selectById(Integer id) {
        return bookMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addBook(Book book) {
        return bookMapper.insertSelective(book);
    }
}
