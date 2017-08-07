package com.putaoteng.task5.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component(value="logAdvice")
@Aspect
public class LogAdvice {

	
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		long startTime = System.currentTimeMillis();
		
		Object obj = pjp.proceed();
		
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		Log.loggerCreate(LogLevel.WARN, pjp.getSignature() + " " + time);
		
		return obj;
	}
	
}
