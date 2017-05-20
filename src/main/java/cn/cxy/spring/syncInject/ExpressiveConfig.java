package cn.cxy.spring.syncInject;

import cn.cxy.spring.soundsystem.BlankDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Function: 通过声明属性源运行时注入
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 5/20/2017 15:19 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */

@Configuration
@PropertySource("classpath:app.properties")//声明属性源
public class ExpressiveConfig {
    //在 Environment 中检索所需属性
    @Autowired
    Environment environment;

    @Bean
    public BlankDisc disc() {
        BlankDisc blankDisc = new BlankDisc();
        if (environment.containsProperty("disc.title")) {
            blankDisc.setTitle(environment.getProperty("disc.title"));
        }
        if (environment.containsProperty("disc.artist")) {
            blankDisc.setArtist(environment.getProperty("disc.artist"));//没有则返回null
        }
        return blankDisc;
    }
}
