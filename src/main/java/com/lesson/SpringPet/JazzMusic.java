package com.lesson.SpringPet;

import java.util.ArrayList;
import java.util.Arrays;

public class JazzMusic implements Music {
    @Override
    public ArrayList<String> getSong() {
        return  new ArrayList<>(Arrays.asList("jazz", "jazzex", "jazzexqwerty"));
    }
    @Override
    public String toString() {
        return "JazzMusic{" + getSong().toString() + " }";
    }
}
