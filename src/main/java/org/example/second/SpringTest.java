package org.example.second;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml" );

        Cooking cooking = context.getBean("cooking",Cooking.class);

        cooking.Cooking();

        context.close();
    }
}
