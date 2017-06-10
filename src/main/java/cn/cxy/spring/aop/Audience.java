package cn.cxy.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Function: 观看演出的切面
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 6/10/2017 15:09 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */

@Configuration
@EnableAspectJAutoProxy // 启用AspectJ自动代理 <aop:aspectj-autoproxy/>

//此注解仅将此类定义为切面，但Spring还不会将其解析为aspect，需启用解析
@Aspect
public class Audience {

    @Bean
    public Audience audience(){
        return new Audience();
    }

    @Pointcut("execution(* cn.cxy.spring.aop.Performance.perform(..))")
    public void performance(){}

    /**
     * //cxy ProceedingJoinPoint - 该对象必须要有
     * @param joinPoint
     */
    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            //TODO 通过 proceed() 方法来调用被通知的方法
            joinPoint.proceed();
            System.out.println("CLAP CLAP CLAP!!!");
        } catch (Throwable throwable) {
            System.out.println("Demanding a refund");
            throwable.printStackTrace();
        }
    }

    /*@Before("execution(* cn.cxy.spring.aop.Performance.perform(..))")
    public void silenceCellPhones(){
        System.out.println("Silencing cell phones");
    }

    @Before("performance()")
    public void takeSeats(){
        System.out.println("Taking seats");
    }

    @AfterReturning("performance()")
    public void applause(){
        System.out.println("CLAP CLAP CLAP!!!");
    }

    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("Demanding a refund");
    }

    *//**
     * 定义命名的切点
     *//*
    @Pointcut("execution(* cn.cxy.spring.aop.Performance.perform(..))")
    public void performance(){
        //TODO 此方法的实际内容不重要；其本身只是一个标识，供 @pointcut 注解依附
    }*/

}
