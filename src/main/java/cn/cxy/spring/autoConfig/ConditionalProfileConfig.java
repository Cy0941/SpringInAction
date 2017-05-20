package cn.cxy.spring.autoConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 5/20/2017 12:00 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */

@Configuration
public class ConditionalProfileConfig {

    /**
     * 只有 MagicExistsCondition 创建后才会创建 MagicBean
     * @return
     */
    @Bean
    @Conditional(MagicExistsCondition.class) //如果条件满足，则注解上所有引用 MagicExistsCondition 的 bean 都会被创建；否则都不创建
    public MagicBean magicBean() {
        return new MagicBean();
    }

}
