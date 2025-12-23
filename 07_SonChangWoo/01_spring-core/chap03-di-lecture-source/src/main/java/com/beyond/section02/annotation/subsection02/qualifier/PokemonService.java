package com.beyond.section02.annotation.subsection02.qualifier;

import com.beyond.section02.annotation.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

// Bean 등록
@Service("pokemonServiceQualifier")
public class PokemonService {

  /* @Qualifier("Bean Name")
  * - 이름이 일치하는 Bean을 의존성 주입(DI)
  * - 필드, 생성자 주입 가능
  * */


  private final Pokemon pokemon;

  @Autowired
  public PokemonService(@Qualifier("squirtle") Pokemon pokemon) {
    this.pokemon = pokemon; // 피카츄가 1순위
  }

  public void pokemonAttack() {
    pokemon.attack();
  }

}