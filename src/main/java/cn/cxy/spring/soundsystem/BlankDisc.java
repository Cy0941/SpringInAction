package cn.cxy.spring.soundsystem;

import java.util.List;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/5/13 15:20 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;

    /**
     * 通过构造方法注入
     * @param title
     */
    /*public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }*/

    /**
     * 通过属性注入
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
    }

    public void playTrack(int trackNum) {
        System.out.println("playing the " + trackNum + " disc");
    }
}
