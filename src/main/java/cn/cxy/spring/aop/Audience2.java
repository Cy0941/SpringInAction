package cn.cxy.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Function: 观看演出的切面
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 6/10/2017 15:09 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */

public class Audience2 {

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

    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    public void takeSeats() {
        System.out.println("Taking seats");
    }

    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    public void demandRefund() {
        System.out.println("Demanding a refund");
    }

    public void performance() {
        //TODO 此方法的实际内容不重要；其本身只是一个标识，供 @pointcut 注解依附
    }

}
