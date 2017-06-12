package cn.cxy.spring.aop;

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

public class TrackCounter2 {

    private Map<Integer, Integer> trackCounts = new HashMap<Integer, Integer>();

    /**
     * 连接点方法包含参数
     * //cxy args(参数名) 必须与 pointcut 方法参数名相同
     *
     * @param trackNum
     */
    public void trackPlayed(int trackNum) {
    }

    public void countTrack(int trackNum) {
        int currentTrack = getPlayCount(trackNum);
        trackCounts.put(trackNum, currentTrack + 1);
    }

    private int getPlayCount(int trackNum) {
        return trackCounts.containsKey(trackNum) ? trackCounts.get(trackNum) : 0;
    }

}
