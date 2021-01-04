package fr.myt.learn.jokeapp.repositories;

import org.springframework.stereotype.Repository;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
@Repository
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
