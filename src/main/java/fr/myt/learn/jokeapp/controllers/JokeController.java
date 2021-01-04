package fr.myt.learn.jokeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.myt.learn.jokeapp.services.JokeService;

@Controller
public class JokeController {

  private final JokeService jokeService;

  @Autowired
  public JokeController(JokeService jokeService) {
    this.jokeService = jokeService;
  }

  @RequestMapping
  public String getJoke(Model model) {
    model.addAttribute("joke", this.jokeService.getJoke());
    return "chucknorris";
  }

}
