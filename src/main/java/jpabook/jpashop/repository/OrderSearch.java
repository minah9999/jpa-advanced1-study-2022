package jpabook.jpashop.repository;

import jpabook.jpashop.domain.enumType.OrderStatus;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class OrderSearch {

    private String memberName;
    private OrderStatus orderStatus;
}
