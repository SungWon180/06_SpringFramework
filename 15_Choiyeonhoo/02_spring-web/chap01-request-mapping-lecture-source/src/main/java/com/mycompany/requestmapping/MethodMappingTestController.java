package com.mycompany.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/* Dispatcher Servlet은 웹 요청을 받는 즉시
*  @Controller가 달린 컨트롤러 클래스에 처리를 위임한다.
*  그 과정은 컨트롤러 클래스의 핸들러 메서드에 선언된
*  다양한 @RequestMapping 설정 내용을 따른다.
*
*  웹 요청 -> Dispatcher Servlet
*  -> Handler Mapping(@RequestMapping)
*  -> Handler Adaptor
*  -> @Controller -> 핸들러 메서드(menuRegist())*/

// 빈 등록
@Controller
public class MethodMappingTestController {

  /* 1. http method 방식을 지정 X */
//  @RequestMapping("/menu/regist") // 핸들러 매핑 등록 어노테이션
  public String menuRegist(Model model){
    // Model : 화면에 값 전달하는 객체 (request scope)
    model.addAttribute("message", "신규 메뉴 등록용 핸들러 메서드 호출");

    System.out.println("/menu/regist 매핑됨");
    
    /* 핸들러 메서드의 return 값은 
    * 반환 하고자 하는 view(html 파일) 경로를 포함한 이름을 작성한다.
    * resources/templates/ 폴더 하위부터 작성
    * .html은 생략하여 작성
    * -> 자세한건 View Resolver 공부할 때
    * */

    // forward
    return "mappingResult"; // resources/templates/mappingResult.html
  }

  /* 2. http method 방식을 지정 O */
  @RequestMapping(value = "/menu/regist", method = RequestMethod.GET)
  public String menuRegist2(Model model){
    model.addAttribute("message","신규 메뉴 등록 호출");
    return "mappingResult";
  }

  /* 3. http method 전용 어노테이션 */
  @PostMapping("/menu/regist")
  public String postMenuRegist(Model model){
    model.addAttribute("message","Post 방식 메뉴 추가 핸들러 메서드 호출");
    return "mappingResult";
  }

}
