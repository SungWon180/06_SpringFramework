package com.google.section02.javaconfig;

import com.google.common.Account;
import com.google.common.MemberDTO;
import com.google.common.PersonalAccount;
import org.springframework.context.annotation.Bean;

public class ContextConfiguration {

  // (Bean 등록)은 ioc 컨테이너한테 account 를 주고 생성 관리를 하게한다
  @Bean // 해당 메서드에서 반환되는 객체를 Bean으로 등록
  public Account accountGenerator() {   // acount 객체 생성
    return new PersonalAccount(20, "110-480-948103");
  }


  @Bean
  public MemberDTO memberGenerator(){
     //생성자 주입 방식
    /*return new MemberDTO(
        1,
        "홍길동",
        "010-1234-1234",
        "hong@naver.com",
        acountGenerator());*/
    MemberDTO member = new MemberDTO();
    member.setSequence(1);
    member.setName("홍길동");
    member.setPhone("010-1234-5678");
    member.setEmail("hong123@gmail.com");
    /* setter를 통해 Account를 생성하는 메소드를 호출한 리턴 값을 전달하여 bean을 조립할 수 있다. */
    member.setPersonalAccount(accountGenerator());

    return member;
  }

}
