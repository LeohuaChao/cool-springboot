package me.leohuachao.dao;

import me.leohuachao.domain.Author;
import org.apache.ibatis.annotations.Param;

/**
 * @author leohuachao
 * @version V1.0
 * @Description: TODO
 * @date 2018/11/5
 */
public interface AuthorMapper {
    Author findAuthor(@Param("id") long id);
}
