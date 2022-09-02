package com.lesson.SpringPet;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

public class DumbMusic implements Music{
    @Override
    public ArrayList<String> getSong() {
        ArrayList<String> list = new ArrayList<>();
        list.add("dumba$$");
        list.add("drum'n'ba$$");
        list.add("hard ba$$");
        return list;
    }
    @Override
    public String toString() {
        return "ClassicalMusic{" + getSong().toString() + " }";
    }
}
