package com.epam.jmp;


import com.epam.jmp.service.DummyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        DummyService dummyService = applicationContext.getBean(DummyService.class);
    }
}
