package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); // Откуда читать бины

       MusicPlayer player = context.getBean("MusicPlayer" , MusicPlayer.class);

        player.PlayMusic();

        context.close();
    }
}
