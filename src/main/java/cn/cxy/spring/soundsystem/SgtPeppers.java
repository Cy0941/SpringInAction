package cn.cxy.spring.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/5/10 9:41 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */

@Component
public class SgtPeppers implements CompactDisc {

    private String title = "跨时代";
    private String artist = "Jay Chou";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
