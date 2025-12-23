package com.mycompany.section03.properties.subsection01.properties;

import com.mycompany.common.Beverage;
import com.mycompany.common.Bread;
import com.mycompany.common.Product;
import com.mycompany.common.ShoppingCart;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Configuration
/* resources 폴더 하위 경로를 기술한다 */
// 이런식으로 작성 하면, github에 올릴 때, 해당 파일 ignore 처리 하면 설정 값을 몰라서, 외부에서 사용이 불가능(보안성 올라감)
@PropertySource(value = "section03/properties/subsection01/properties/product-info.properties", encoding = "UTF-8")
public class ContextConfiguration {

  /* 치환자 문법(placeholder) 를 이용하여 properties에 저장 된 키 값을 입력하면
   * value에 해당하는 값이 가져와져서 주입 된다.
   * 양 옆에 공백이 있을 경우 값을 읽어오지 못하므로 주의!!
   * 뒤에 : 을 사용하여 key 값이 없을 경우에 대체값을 작성할 수 있다. */
  @Value("${bread.carpbread.name:팥붕어빵}") // 있으면 원래 값 가져오고, 없으면 뒤 팥붕어빵을 쓰겠다.
  private String carpBreadName;

  /* 값은 여러 번 불러올 수 있다. */
//	@Value("${bread.carpbread.name:슈크림붕어빵}")
//	private String carpBreadName2;

  @Value("${bread.carpbread.price:0}")
  private int carpBreadPrice;

  @Value("${beverage.milk.name:}") // beverage.milk.name: 이면 빈칸(공백문자) ,beverage.milk.name 이면 null
  private String milkName;

  @Value("${beverage.milk.price:0}")
  private int milkPrice;

  @Value("${beverage.milk.capacity:0}")
  private int milkCapacity;

  @Bean
  public Product carpBread() {
    return new Bread(carpBreadName, carpBreadPrice, new Date());
  }

  @Bean
  public Product milk(
      @Value("${beverage.milk.name}") String name,
      @Value("${beverage.milk.price}") int price,
      @Value("${beverage.milk.capacity}") int capacity
  ) {
    return new Beverage(name, price, capacity);
  }

  @Bean
  public Product water(
      @Value("${beverage.water.name}") String name,
      @Value("${beverage.water.price}") int price,
      @Value("${beverage.water.capacity}") int capacity
  ) {
    return new Beverage(name, price, capacity);
  }

  @Bean
  @Scope("prototype")
  public ShoppingCart cart() {
    return new ShoppingCart();
  }

}
