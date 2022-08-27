package com.lesson.SpringPet;

public class ClassicalMusic implements Music{

    private ClassicalMusic(){}
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
    @Override
    public String getSong() {
        return "Green Elephant";
    }
    public void doMyInit(){
        System.out.println("doing my initialisation");
    }
    public void doMyDestroy(){
        System.out.println("doing my destroy");
    }
}
