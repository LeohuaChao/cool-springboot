package me.leohuachao.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import me.leohuachao.api.domain.Author;
import me.leohuachao.service.IAuthorService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("/author")
@RestController
public class AuthorController {

    @Reference
    private IAuthorService authorService;

    @RequestMapping("/")
    public List<Author> allAuthor() {
        return authorService.findAll();
    }

    @RequestMapping(value = "/{id:\\d+}")
    public Author getAuthor(@PathVariable Long id, HttpServletRequest request) {
        Author author = authorService.findAuthor(id);
        return author;
    }

}
