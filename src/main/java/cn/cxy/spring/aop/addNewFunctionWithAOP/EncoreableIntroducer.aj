package cn.cxy.spring.aop.addNewFunctionWithAOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Function: 为满足条件的实现类通过AOP添加新的method  --  @DeclareParents
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 6/10/2017 16:01 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */

@Aspect
public class EncoreableIntroducer {

    //TODO
    @DeclareParents(value = "cn.cxy.spring.aop.Performance+",defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;

}
