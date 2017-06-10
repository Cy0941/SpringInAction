package cn.cxy.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.HashMap;
import java.util.Map;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 6/10/2017 15:36 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */

@Configuration
@EnableAspectJAutoProxy
@Aspect
public class TrackCounter {

    private Map<Integer, Integer> trackCounts = new HashMap<Integer, Integer>();

    /**
     * 连接点方法包含参数
     * //cxy args(参数名) 必须与 pointcut 方法参数名相同
     *
     * @param trackNum
     */
    @Pointcut("execution(* cn.cxy.spring.soundsystem.CompactDisc.playTrack(int)) && args(trackNum))")
    public void trackPlayed(int trackNum) {
    }

    @Before("trackPlayed(trackNum)")
    public void countTrack(int trackNum) {
        int currentTrack = getPlayCount(trackNum);
        trackCounts.put(trackNum, currentTrack + 1);
    }

    private int getPlayCount(int trackNum) {
        return trackCounts.containsKey(trackNum) ? trackCounts.get(trackNum) : 0;
    }

}
