package com.mycompany.section02.annotation.common;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("charmander")
public class Charmander implements Pokemon {

  @Override
  public void attack() {
    System.out.println("파이리 불꽃 공격🔥");
  }
}
