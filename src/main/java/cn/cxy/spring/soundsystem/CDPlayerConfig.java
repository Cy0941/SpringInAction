package cn.cxy.spring.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/5/10 9:43 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */

@Configuration
//启用主键扫描，默认当前类所在包及子包 - 使用 basePackageClasses 配置扫描包，类型更安全
@ComponentScan
public class CDPlayerConfig {
}
