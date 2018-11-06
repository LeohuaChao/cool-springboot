package me.leohuachao.controller;

import me.leohuachao.domain.Author;
import me.leohuachao.service.AuthorService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author leohuachao
 * @version V1.0
 * @Description: TODO
 * @date 2018/11/5
 */
@RequestMapping("/data/author")
@RestController
public class AuthorController {

    @Autowired
    private AuthorService2 authorService;

    @RequestMapping(value = "/userId={id:\\d+}", method = RequestMethod.GET)
    public Author getAuthor(@PathVariable Long id, HttpServletRequest request) {
        Author author = authorService.findAuthor(id);
        return author;
    }
}
