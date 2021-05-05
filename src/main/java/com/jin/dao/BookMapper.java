package com.jin.dao;

import com.jin.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //增加一个Book
    int addBook(Books book);

    //根据id删除一个Book
    int deleteBookById(@Param("BookID") int id);

    //更新Book
    int updateBook(Books book);

    //根据id查询,返回一个Book
    Books queryBookById(@Param("BookID") int id);

    //查询全部Book,返回list集合
    List<Books> queryAllBook();
}
