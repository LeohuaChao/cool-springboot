package me.leohuachao.dao.impl;

import me.leohuachao.dao.AuthorDao;
import me.leohuachao.domain.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

/**
 * @author leohuachao
 * @version V1.0
 * @Description: TODO
 * @date 2018/11/2
 */
@Repository
public class AuthorDaoImpl implements AuthorDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(Author author) {
        return jdbcTemplate.update("insert into t_author(real_name, nick_name) values(?, ?)",
                author.getRealName(), author.getNickName());
    }

    @Override
    public int remove(Long id) {
        return jdbcTemplate.update("delete from t_author where id = ?", id);
    }

    @Override
    public int update(Author author) {
        return jdbcTemplate.update("update t_author set real_name = ?, nick_name = ? where id = ?",
                author.getRealName(), author.getNickName(), author.getId());
    }

    @Override
    public Author findAuthor(Long id) {
        List<Author> list = jdbcTemplate.query("select * from t_author where id = ?", new Object[]{id},
                new BeanPropertyRowMapper<Author>(Author.class));
        if (null != list && list.size() > 0) {
            return list.get(0);
        } else {
            return null;
        }

    }

    @Override
    public List<Author> findAll() {
        return jdbcTemplate.query("select * from t_author", new Object[]{},
                new BeanPropertyRowMapper<Author>(Author.class, false));
    }
}
