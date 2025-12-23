package com.mycompany.section01.aop;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/* proxyTargetClass = true
*  - Proxy(대체자) 객체 생성 방식으로 CGLIB 방식을 사용
*  -> false면 타겟 인터페이스 이용
*  -> true면 타겟 class 이용 가능
* (예전에는 interface가 있어야지만 사용가능 했지만 CGLIB가 나오면서 클래스를 사용 할 수 있게됨*/


@Configuration // 설정용 Bean 등록(내부 메서드 자동 수행)
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ContextConfiguration {


}