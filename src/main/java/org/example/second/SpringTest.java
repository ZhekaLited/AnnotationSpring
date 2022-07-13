package org.example.second;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml" );

        Bazar bazar = context.getBean("bazar" , Bazar.class);

        System.out.println(bazar);



//        Cooking cooking = context.getBean("cooking",Cooking.class);
//
//       cooking.EatCooking();

//        Fruit fruitSecond = context.getBean("some",Fruit.class);
//
//        System.out.println(fruitSecond.sort());

        context.close();
    }
}
