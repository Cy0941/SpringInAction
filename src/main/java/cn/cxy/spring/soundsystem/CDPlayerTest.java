package cn.cxy.spring.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/5/10 9:45 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class) //自动创建Spring上下文
@ContextConfiguration(classes = CDPlayerConfig.class) //加载配置
public class CDPlayerTest {

    @Autowired
    private CompactDisc cd;

    @Autowired
    private MediaPlayer mediaPlayer;

    @Test
    public void play(){
        mediaPlayer.play();
    }

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
    }

}
