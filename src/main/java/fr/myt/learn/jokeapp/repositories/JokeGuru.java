package fr.myt.learn.jokeapp.repositories;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class JokeGuru implements JokeRepository {

  private final ChuckNorrisQuotes chuckNorrisQuotes;

  public JokeGuru() {
    this.chuckNorrisQuotes = new ChuckNorrisQuotes();
  }

  @Override
  public String findJoke() {
    return this.chuckNorrisQuotes.getRandomQuote();
  }
}
