package com.beyond.section02.annotation.subsection05.inject;

import com.beyond.section02.annotation.common.Pokemon;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.stereotype.Service;

// Bean 등록
@Service("pokemonServiceInject")
public class PokemonService {

  /* 1. 필드 주입 */
  @Inject
  @Named("charmander")
  private Pokemon pokemon;

  public void pokemonAttack() {
    pokemon.attack();
  }
}