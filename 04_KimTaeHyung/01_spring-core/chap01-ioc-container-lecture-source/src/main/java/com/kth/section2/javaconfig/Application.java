package com.kth.section2.javaconfig;

import com.kth.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
  public static void main(String[] args) {

    ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationContext.class);

    MemberDTO member = context.getBean("member2", MemberDTO.class);
    System.out.println(member);

  }
}
