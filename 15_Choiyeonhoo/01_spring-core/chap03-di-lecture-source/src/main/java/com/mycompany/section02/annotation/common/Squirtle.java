package com.mycompany.section02.annotation.common;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("squirtle")
public class Squirtle implements Pokemon {

  @Override
  public void attack() {
    System.out.println("꼬부기 물대포 발사🌊");
  }
}
