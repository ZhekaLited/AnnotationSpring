package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); // Откуда читать бины

        Music music = context.getBean("MusicBean" , Music.class); //Создается какой то обьект который реализует интерфейс Music

        MusicPlayer player = new MusicPlayer(music);

        player.PlayMusic();

        context.close();
    }
}
