package com.android.base_aspectj_module;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * 作者:created by storm on 2019-11-08
 *
 * 类型匹配语法:
 * *：匹配任何数量字符；
 * ..：匹配任何数量字符的重复，如在类型模式中匹配任何数量子包；而在方法参数模式中匹配任何数量参数。
 * +：匹配指定类型的子类型；仅能作为后缀放在类型模式后边。
 * AspectJ使用 且（&&）、或（||）、非（！）来组合切入点表达式。
 *
 *
 * 匹配模式:
 * call(<注解？> <修饰符?> <返回值类型> <类型声明?>.<方法名>(参数列表) <异常列表>？) ?标注的参数可以什么都不传
 * execution(<注解？> <修饰符?> <返回值类型> <类型声明?>.<方法名>(参数列表) <异常列表>？)
 */

@Aspect
public class PersonAspectJ {

    @Pointcut("execution(* com.android.aspectj.plugin.Person.set*(..))")
    public void callPersonSetNameMethod(){}

    @After("callPersonSetNameMethod()")
    public void invokeCallPersonSetNameMethodBefore(JoinPoint point){
        Signature signature=point.getSignature();
        if(signature instanceof MethodSignature){
            String name=signature.getName();
            Method method=((MethodSignature) signature).getMethod();
            method.setAccessible(true);
            String methodName=method.getName();
            String className=method.getDeclaringClass().getName();
            System.out.println("before:name:"+name+"::methodName:"+methodName+"::className:"+className);
        }

    }
}
