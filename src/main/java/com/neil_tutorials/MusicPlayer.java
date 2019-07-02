package com.neil_tutorials;

public class MusicPlayer {
//    private List<Music> musicList = new ArrayList<>();
    private Music music;
    private String name;
    private int volume;

    public MusicPlayer() {
    }

//    //IoC
//    public MusicPlayer(List<Music> musicList) {
//        this.musicList = musicList;
//    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

//    public List<Music> getMusicList() {
//        return musicList;
//    }
//
//    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }


    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
//        for (Music music: musicList) {
            System.out.println("Playing: " + music.getSong());
//        }
    }
}
