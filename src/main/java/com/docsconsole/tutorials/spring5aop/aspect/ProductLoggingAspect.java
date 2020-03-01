package com.docsconsole.tutorials.spring5aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class ProductLoggingAspect {
     
	@AfterThrowing("execution(* com.docsconsole.tutorials.spring5aop.service.ProductManagerServiceImpl.*(..))")
    public void logAroundAllMethods(JoinPoint joinPoint) 
    {
        System.out.println(":::::::--> LoggingAspect.logAroundAllMethods() : " + joinPoint.getSignature().getName());
    }
     
	@AfterThrowing("execution(* com.docsconsole.tutorials.spring5aop.service.ProductManagerServiceImpl.getProductById(..))")
    public void logAroundGetProduct(JoinPoint joinPoint) 
    {
        System.out.println(":::::::--> LoggingAspect.logAroundGetProduct() : " + joinPoint.getSignature().getName());
    }
     
	@AfterThrowing("execution(* com.docsconsole.tutorials.spring5aop.service.ProductManagerServiceImpl.createProduct(..))")
    public void logAroundCreateProduct(JoinPoint joinPoint) 
    {
        System.out.println(":::::::--> LoggingAspect.logAroundCreateProduct() : " + joinPoint.getSignature().getName());
    }
}	