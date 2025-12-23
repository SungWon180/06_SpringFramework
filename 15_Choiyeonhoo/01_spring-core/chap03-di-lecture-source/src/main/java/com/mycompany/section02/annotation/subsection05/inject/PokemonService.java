package com.mycompany.section02.annotation.subsection05.inject;

import com.mycompany.section02.annotation.common.Pokemon;
import jakarta.annotation.Resource;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.stereotype.Service;

// Bean 등록
@Service("pokemonServiceInject")
public class PokemonService {

  /* 1. 필드 주입 */
  @Inject
  @Named("pikachu")
  private Pokemon pokemon;

  /* 2. 생성자 주입 */
//  @Inject
//  public PokemonService(@Named("pikachu") Pokemon pokemon) {
//    this.pokemon = pokemon;
//  }

  public void pokemonAttack() {
    pokemon.attack();
  }
}