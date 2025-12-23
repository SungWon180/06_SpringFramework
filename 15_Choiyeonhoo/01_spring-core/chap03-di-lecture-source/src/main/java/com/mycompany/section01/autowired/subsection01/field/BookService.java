package com.mycompany.section01.autowired.subsection01.field;


import com.mycompany.section01.autowired.common.BookDAO;
import com.mycompany.section01.autowired.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/* @Service
* - @Component의 세분화 어노테이션의 한 종류로
*   서비스 계층임을 명시
* - @ComponentScan 시 Bean으로 등록 된다
* - bookServiceField <- 등록된 Bean의 이름(id), 지정하지 않으면 Class 이름으로 만들어줌
 */
@Service("bookServiceField")
public class BookService {

  /* 등록된 Bean 중에서 BookDAO 또는 상속 받은 Bean을 찾아 주입 */

  @Autowired // 필드 주입
  private BookDAO bookDAO;

  /* 도서 목록 전체 조회 */
  public List<BookDTO> selectAllBooks(){
    return bookDAO.selectBookList();
  }

  /* 도서 번호로 도서 조회 */
  public BookDTO searchBookBySequence(int sequence) {
    return bookDAO.selectOneBook(sequence);
  }

}
