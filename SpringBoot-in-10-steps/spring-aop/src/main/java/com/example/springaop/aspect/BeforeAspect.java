package com.example.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// AOP
// Configuration
@Aspect
@Configuration
public class BeforeAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // Qué métodos se deben interceptar
    // el parámetro que debo pasarle se llama a point guard
    // execution(* PACKAGE.*.*.(..))
    @Before("execution(* com.example.springaop.business*.*.(..))")
    public void before(JoinPoint joinPoint) {
        // What to do?
        logger.info("Intercept Method Calls {}", joinPoint);
    }
}
