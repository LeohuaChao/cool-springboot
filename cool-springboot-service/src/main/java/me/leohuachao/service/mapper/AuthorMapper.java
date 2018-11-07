package me.leohuachao.service.mapper;

import me.leohuachao.api.domain.Author;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author leohuachao
 * @version V1.0
 * @Description: TODO
 * @date 2018/11/5
 */
public interface AuthorMapper {
    Author findAuthor(@Param("id") long id);

    int add(Author author);

    List<Author> findAll();
}