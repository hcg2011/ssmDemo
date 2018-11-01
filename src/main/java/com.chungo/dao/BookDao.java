package com.chungo.dao;

import com.chungo.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookDao {

    Book queryById(int id);

    List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    int reduceNumber(int bookId);
}
