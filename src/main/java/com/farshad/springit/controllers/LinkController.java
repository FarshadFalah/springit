package com.farshad.springit.controllers;

import com.farshad.springit.domain.Link;
import com.farshad.springit.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/links/")
public class LinkController {

    private LinkRepository linkRepository;

    public LinkController(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    @GetMapping("/")
    public List<Link> list(){
        return linkRepository.findAll();
    }

    @PostMapping("/create")
    public Link create(@ModelAttribute Link link){
        return linkRepository.save(link);
    }

    @GetMapping("/{id}")
    public Optional<Link> read(@PathVariable long id){
        return linkRepository.findById(id);
    }

    @PutMapping("/{id}")
    public Link update(@PathVariable long id,@ModelAttribute Link link){
        return linkRepository.save(link);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        linkRepository.deleteById(id);

    }
}
