package org.ho.section02;

import org.ho.common.Account;
import org.ho.common.MemberDTO;
import org.ho.common.PersonalAccount;
import org.springframework.context.annotation.Bean;

public class ContextConfiguration {

  @Bean // 해당 메서드에서 반환되는 객체를 Bean으로 등록 = IoC Container한테 객체주고 알아서 생명주기 관리하도록 한다
  public Account accountGenerator(){
    return new PersonalAccount(20,"123-456-789");
  }

  @Bean
  public MemberDTO memberGenerator(){
    /* 생성자 주입 방식 */
    return new MemberDTO(1,
        "홍길동",
        "010-1234-5678",
        "hong123@gmail.com",
        accountGenerator()/*= 등록된 PersoanlAccount 빈 */);
  }
}
