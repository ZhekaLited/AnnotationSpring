package org.example;

public class MusicPlayer {
    private Music music; // Интерфейс ссылка

    public MusicPlayer(Music music) {
        this.music = music; // Придает полю music интерфейс Music
    }

    public void PlayMusic() {
        System.out.println("Playing " + music.getSong()); // Добавка интерфейса
    }
}
