package com.mycompany.section02.annotation.common;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // 1순위
@Qualifier("pikachu")
public class Pikachu implements Pokemon {

  @Override
  public void attack() {
    System.out.println("피카츄 백만볼트⚡");
  }
}
