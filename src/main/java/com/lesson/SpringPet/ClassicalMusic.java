package com.lesson.SpringPet;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassicalMusic implements Music{
    ClassicalMusic(){
    }
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
    @Override
    public ArrayList<String> getSong() {
        return  new ArrayList<>(Arrays.asList("eto classica", "green elephant", "zeleny golovastik"));
    }
    public void doMyInit(){
        System.out.println("doing my initialisation");
    }
    public void doMyDestroy(){
        System.out.println("doing my destroy");
    }

    @Override
    public String toString() {
        return "ClassicalMusic{" + getSong().toString() + " }";
    }
}
