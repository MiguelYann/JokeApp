package fr.myt.learn.jokeapp.services;

import org.springframework.stereotype.Service;

import fr.myt.learn.jokeapp.repositories.JokeRepository;

@Service
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
