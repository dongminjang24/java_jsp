package com.example.ex00.dependency.qualifierEx;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Data
@Qualifier("vips")
public class Vips implements Restaurant{
    @Override
    public int steakPrice() {
        return 48000;
    }

    @Override
    public boolean checkedSalad() {
        return false;
    }
}
