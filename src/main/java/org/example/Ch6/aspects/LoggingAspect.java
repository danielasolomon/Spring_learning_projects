package org.example.Ch6.aspects;

import org.example.Ch6.model.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Order(2)
public class LoggingAspect {

    private final Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around(value = "@annotation(org.example.Ch6.main.Main.ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Logging Aspect: Calling the intercepted method");

        Object returnedValue = joinPoint.proceed();

        logger.info("Logging Aspect: Method executed and returned " +
                returnedValue);

        return returnedValue;
    }

//    @AfterReturning(value = "@annotation(org.example.Ch6.main.Main.ToLog)",returning ="returnedValue")
//    public void log(Object returnedValue) {
//        logger.info("Method executed and returned " + returnedValue);
//    }

//    @Around("@annotation(org.example.Ch6.main.Main.ToLog)")
//    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
//
//        String methodName = joinPoint.getSignature().getName();
//        Object[] args = joinPoint.getArgs();
//
//
//        logger.info("Method " + methodName +
//                " with parameters " + Arrays.asList(args) +
//                " will execute.");
//
//        Object[] newArgs = { new Comment("Demo comment2", "Aspect")};
//        Object returnedByMethod = joinPoint.proceed(newArgs);
//
//        logger.info("Method executed and returned " + returnedByMethod);
//
//        return "Failed";
//    }

//    @Around("execution(* Ch6.services.*.*(..))")
//    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
//
//        String methodName = joinPoint.getSignature().getName();
//        Object[] args = joinPoint.getArgs();
//
//
//        logger.info("Method " + methodName +
//                " with parameters " + Arrays.asList(args) +
//                " will execute.");
//
//        Object[] newArgs = { new Comment("Demo comment2", "Aspect")};
//        Object returnedByMethod = joinPoint.proceed(newArgs);
//
//        logger.info("Method executed and returned " + returnedByMethod);
//
//        return "Failed";
//    }

//    @Around("execution(* Ch6.services.*.*(..))")
//    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
//
//        String methodName = joinPoint.getSignature().getName();
//        Object[] args = joinPoint.getArgs();
//
//
//        logger.info("Method " + methodName +
//                " with parameters " + Arrays.asList(args) +
//                " will execute.");
//
//        Object returnedByMethod = joinPoint.proceed();
//
//        logger.info("Method executed and returned " + returnedByMethod);
//
//        return returnedByMethod;
//    }

//    @Around("execution(* Ch6.services.*.*(..))")
//    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
//
//        logger.info("Method will execute");
//        joinPoint.proceed();
//        logger.info("Method finished");
//
//    }


}
