package com.lesson.SpringPet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private List<Music> musicList;

    //IoC
    public MusicPlayer(List<Music> list){
        this.musicList = list;
    }
    public List<Music> playMusic(){
        Random random = new Random();
        return List.of(musicList.get(random.nextInt(0, musicList.size())));
    }
}
