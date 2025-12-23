package com.mycompany.section01.xmlconfig;

import com.mycompany.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

  public static void main(String[] args) {

    /* GenericXmlApplicationContext 클래스를 사용하여 ApplicationContext를 생성한다.
     * 생성자에 XML 설정 메타 정보를 인자로 전달한다. */
    ApplicationContext context
        = new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml"
        /*XML Configuration Metadata 파일 경로*/);

    MemberDTO member = context.getBean("member",MemberDTO.class); // member라는 이름의 bean 생성, 뒤에는 다운캐스팅 해서 T 정해줌

    System.out.println("member = " + member);


  }

}
