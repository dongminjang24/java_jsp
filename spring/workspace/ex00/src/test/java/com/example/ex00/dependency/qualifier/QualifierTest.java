package com.example.ex00.dependency.qualifier;

import com.example.ex00.dependency.qualifierEx.Restaurant;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@Slf4j
class QualifierTest {

    @Autowired
//    @Qualifier("desktop")
//    @Qualifier("laptop")
    private Computer computer;

    @Test
    public void ComputerTest() {
        log.info("computer = {}",computer);
    }

    @Autowired
    private Restaurant restaurant;

    @Test
    public void RestaurantTest() {
        log.info("steakPrice = {}",restaurant.steakPrice());
        log.info("salad = {}",restaurant.checkedSalad());
        int price = restaurant.steakPrice();
        Assertions.assertThat(price).isEqualTo(53000);
    }


}