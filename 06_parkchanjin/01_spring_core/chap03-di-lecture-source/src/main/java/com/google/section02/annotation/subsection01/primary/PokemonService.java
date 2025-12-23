package com.google.section02.annotation.subsection01.primary;

import com.google.section02.annotation.common.Pokemon;
import org.springframework.stereotype.Service;

// Bean 등록
@Service("pokemonServicePrimary")
public class PokemonService {

  private final Pokemon pokemon;

  public PokemonService(Pokemon pokemon ) {
    this.pokemon = pokemon; // 피카츄가 1순위
  }

  public void pokemonAtteck() {
    pokemon.attack();
  }
}
