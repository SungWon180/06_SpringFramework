package com.kth.section02.javaconfig;

import com.kth.common.Account;
import com.kth.common.MemberDTO;
import com.kth.common.PersonalAccount;
import org.springframework.context.annotation.Bean;

public class ContextConfiguration {

  // ioc컨테이너한테 이거 생성해서 알아서 관리하다가 내가 필요하면 주입해줘
  @Bean // 해당 메서드에서 반환되는 객체를 Bean으로 등록
  public Account accountGenerator(){
    return new PersonalAccount(20, "123-456-7890");
  }

  @Bean
  public MemberDTO memberGenerator(){
    /* 생성자 주입 방식 */

    /* MemberDTO 생성자를 통해 Account를 생성하는 메소드를 호출한 리턴 값을 전달하여 bean을 조립할 수 있다. */
//    return new MemberDTO(1, "홍길동", "010-1234-5678", "hong123@gmail.com", accountGenerator());

    /* Setter 주입 방식 */
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
