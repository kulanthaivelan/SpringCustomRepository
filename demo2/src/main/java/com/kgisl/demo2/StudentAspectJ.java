package com.kgisl.demo2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StudentAspectJ {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentAspectJ.class);

    @Before("execution(* com.kgisl.demo2.repository.StudentRepository.*(..))")
    public void beforeMethodExecution(JoinPoint joinPoint) {
        LOGGER.info("Before executing method: {}", joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "execution(* com.kgisl.demo2.repository.StudentRepository.*(..))", returning = "result")
    public void afterMethodExecution(JoinPoint joinPoint, Object result) {
        LOGGER.info("After executing method: {}", joinPoint.getSignature().getName());
        LOGGER.info("Method returned: {}", result);
    }
}
