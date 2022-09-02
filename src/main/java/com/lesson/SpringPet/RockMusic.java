package com.lesson.SpringPet;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

@Component
public class RockMusic implements Music{
    @Override
    public ArrayList<String> getSong() {
        return  new ArrayList<>(Arrays.asList("A solnce vzhodit", "And sun rises", "ueueue"));
    }
    @Override
    public String toString() {
        return "RockMusic{" + getSong().toString() + " }";
    }
}
