package com.example.ex00.dependency.qualifierEx;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Data
@Primary @Qualifier("outback")
public class Outback implements Restaurant{
    @Override
    public int steakPrice() {
        return 53000;
    }

    @Override
    public boolean checkedSalad() {
        return true;
    }
}
