package com.lesson.SpringPet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private final int id;
    private final MusicPlayer player;
    @Autowired
    public Computer(MusicPlayer player){
        this.id = 1;
        this.player = player;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", player=" + player.playMusic() +
                '}';
    }
}
