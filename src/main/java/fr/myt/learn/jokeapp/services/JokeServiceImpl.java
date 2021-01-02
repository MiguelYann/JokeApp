package fr.myt.learn.jokeapp.services;

import fr.myt.learn.jokeapp.repositories.JokeRepository;

public class JokeServiceImpl implements JokeService {

  private final JokeRepository jokeRepository;

  public JokeServiceImpl(JokeRepository jokeRepository) {
    this.jokeRepository = jokeRepository;
  }

  @Override
  public String getJoke() {
    return this.jokeRepository.findJoke();
  }

}
