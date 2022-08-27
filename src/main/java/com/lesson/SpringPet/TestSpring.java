package com.lesson.SpringPet;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassicalMusic classicalMusic = context.getBean("classic", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
        /*MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        boolean comparison = musicPlayer == musicPlayer1;
        System.out.println(comparison);
        musicPlayer.setVolume(33);
        musicPlayer1.setVolume(55);
        System.out.println(musicPlayer.getVolume() + "\t" + musicPlayer1.getVolume());*/
        context.close();
    }
}
